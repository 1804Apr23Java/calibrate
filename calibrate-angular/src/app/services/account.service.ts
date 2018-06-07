import { Injectable } from '@angular/core';
import { Account } from '../classes/account';

import { Http, Response } from '@angular/http';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class AccountService {

  //inject Http objects
  constructor(private http: Http, private httpClient: HttpClient) { }

  //set URL for api fetching without id 
  private accountUrl = 'http://ec2-184-72-131-208.compute-1.amazonaws.com:8080/CalibrateBackend/account';


  //get account by passing URL + id through http
  public getAccountById(accountId: number): Observable<Account> {
    return this.http.get(`${this.accountUrl}/${accountId}`).pipe(map((response: Response) => {
      return <Account>response.json();
    }));
  }

  //get account by passing URL + id through http
  public getLogin(account): Observable<Account> {

    console.log('In getLogin: ' + account.email + ' ' + account.password);

    return this.http.get(`${this.accountUrl}/email/${account.email}/password/${account.password}`).pipe(map((response: Response) => {
      return <Account>response.json();
    }));
  }

}
