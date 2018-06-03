import { Injectable } from '@angular/core';
import { Account } from '../classes/account';
import { ACCOUNT } from '../mock-account';

import { Http, Response } from '@angular/http';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';


@Injectable()
export class AccountService {

  //inject Http object
  constructor(private http: Http, private httpClient: HttpClient) { }

  private accountUrl = 'http://localhost:8083/CalibrateNgTest/account/82';

  public fetchAccountInfo(accountId: number): Observable<Account> {
    return this.http.get(`https://pokeapi.co/api/v2/pokemon/${accountId}`).pipe(map((response: Response) => {
      return <Account>response.json();
    }))
  }

  //get account for real from our backend using HttpClient; newer vesion of module

  public fetchAccount(): Observable<Account> {
    console.log("Fetching Account");
    return this.httpClient.get<Account>('http://localhost:8083/CalibrateNgTest/account/82');
  } 


  getAccount(): Account { 
    
    //http request plz
    return ACCOUNT;
  }

}
