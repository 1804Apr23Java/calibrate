import { Injectable } from '@angular/core';
import { Library } from '../classes/library';
import { Observable, of } from 'rxjs';
// import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LibraryService {

  // libraryApiUrl: String = "http://ec2-184-72-131-208.compute-1.amazonaws.com:8080/CalibrateNgTest/library/";

  constructor() { }

  // getAllLibrariesByUserId(userId: Number): Observable<Library[]> {
  //   return this.http.get<Library[]>(this.libraryApiUrl + String(userId));

  // }

  // getLibraryById(): Library {

  // }

}
