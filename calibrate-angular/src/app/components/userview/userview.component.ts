import { Component, OnInit } from '@angular/core';
import { AccountService } from '../../services/account.service';
import { Account } from '../../classes/account';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-userview',
  templateUrl: './userview.component.html',
  styleUrls: ['./userview.component.css']
})
export class UserviewComponent implements OnInit {
  
  accountId: number;
  user: Account;
  userstring: String;

  constructor(private accountService: AccountService) { }

  getAccountById(accountId: number): void {
    this.accountService.getAccountById(accountId).subscribe(
      (account: Account) => { this.user = account; this.userstring = JSON.stringify(this.user) }, error => console.log(`Error: ${error} `)
    );
  }

  ngOnInit() {
    
    this.getAccountById(81);

  }

}
