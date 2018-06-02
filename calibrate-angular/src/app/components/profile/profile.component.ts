import { Component, OnInit } from '@angular/core';
import { Account } from '../../classes/account';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  account = <Account>{};

  constructor() { }

  ngOnInit() {

    console.log('profile ngOnInit ran...');

    //Call some service to get real data

    this.account.username = "DaveB";
    this.account.password = "davelovescollin";
    this.account.isAdmin = false;
    this.account.email = "dave@email.com";

  }

}
