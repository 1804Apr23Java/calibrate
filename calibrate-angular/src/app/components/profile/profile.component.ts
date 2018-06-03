import { Component, OnInit } from '@angular/core';
import { Account } from '../../classes/account';
import {AccountService } from '../../services/account.service';


@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  account: Account;

  constructor(private accountService: AccountService) { }

  getAccount() {
    this.account = this.accountService.getAccount();
  }

  ngOnInit() {

    console.log('profile ngOnInit ran...');

    //Call some service to get real data

    this.accountService.fetchAccount();
    //this.getAccount();
  }

}
