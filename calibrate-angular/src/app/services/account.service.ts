import { Injectable } from '@angular/core';
import { Account } from '../classes/account';
import { ACCOUNT } from '../mock-account';


@Injectable({
  providedIn: 'root'
})
export class AccountService {

  constructor() { }

  getAccount(): Account { 
    
    //http request plz
    return ACCOUNT;
  }

}
