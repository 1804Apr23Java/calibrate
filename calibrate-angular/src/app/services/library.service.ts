import { Injectable } from '@angular/core';
import { Library } from '../classes/library';

import { Http, Response } from '@angular/http';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class LibraryService {

  //inject Http objects
  constructor(private http: Http, private httpClient: HttpClient) { }

  //set URL for api fetching without id 
  private libraryUrl = 'http://ec2-184-72-131-208.compute-1.amazonaws.com:8080/CalibrateBackend/library';

  //get Library by passing URL + id through http
  public getLibraryById(libraryId: number): Observable<Library> {
    return this.http.get(`${this.libraryUrl}/${libraryId}`).pipe(map((response: Response) => {
      return <Library>response.json();
    }));
  }

  // get Library by status "pending" or "public"
  public getLibrariesByStatus(libraryStatus: String): Observable<Library[]> {
    return this.http.get(`${this.libraryUrl}/${libraryStatus}`).pipe(map((response: Response) => {
      return <Library[]>response.json();
    }));
  }

  //get list of libraries that belong to one user
  // CHANGE this once Team Spring implements the api link
  // urlblargh:8080/library/userid or whatever
  public getLibrariesByUserId(userId: number): Observable<Library[]> {
    return this.http.get(`${this.libraryUrl}/byAccount/${userId}`).pipe(map((response: Response) => {
      return <Library[]>response.json();
    }));
  }


  //   "/new/{libraryName}/accountId/{accountId}"
  // add new library from user input
  // need to send library name, question array and userId (for author)
  public addLibrary(libraryName: string){

    console.log(`http://ec2-184-72-131-208.compute-1.amazonaws.com:8080/CalibrateBackend/library/new/${libraryName}/accountId/${localStorage.getItem('accountId')}`);

    return this.http.get(`http://ec2-184-72-131-208.compute-1.amazonaws.com:8080/CalibrateBackend/library/new/${libraryName}/accountId/${localStorage.getItem('accountId')}`).pipe(map((response: Response) => {
      return <Library>response.json();
    }));
    
  }

  // update library by status
  // need endpoint
  public updateLibraryStatus(libraryId: number, status: String): void {
    this.http.get(`${this.libraryUrl}/id/${libraryId}/status/${status}`);
  }

}
