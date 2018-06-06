import { Injectable } from '@angular/core';
import { Account } from '../classes/account';
import { ACCOUNT } from '../mock-account';

import { Http, Response } from '@angular/http';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class AccountService {


    //inject Http object
    constructor(private http: Http, private httpClient: HttpClient) { }

    private accountUrl = 'http://ec2-184-72-131-208.compute-1.amazonaws.com:8080/CalibrateNgTest/account/82';
  
    public fetchAccountById(accountId: number): Observable<Account> {
      return this.http.get(this.accountUrl).pipe(map((response: Response) => {
        return <Account>response.json();
      }));
    }
  
    //get account for real from our backend using HttpClient; newer vesion of module
    public fetchAccount(): Observable<Account> {
      return this.http.get(this.accountUrl).pipe(map((response: Response) => {
        return <Account>response.json();
      }));
    }

  getAccount(): Account { 
    
    //http request plz
    return ACCOUNT;
  }

}
