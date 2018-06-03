import { Component, OnInit } from '@angular/core';
import { Account } from '../../classes/account';
import { AccountService } from '../../services/account.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-userview',
  templateUrl: './userview.component.html',
  styleUrls: ['./userview.component.css']
})
export class UserviewComponent implements OnInit {
  
  user: Account;
  user2: Observable<Account>;



  constructor(private accountService: AccountService) { }

  ngOnInit() {

    this.user = new Account(1, 'dave@gmail.com', false, 'chunli', 'DaveB');

    this.user2 = this.accountService.fetchAccount();

    console.log(this.user2);
  }

}
