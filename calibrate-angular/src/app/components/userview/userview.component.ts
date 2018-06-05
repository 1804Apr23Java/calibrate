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

  user: Account;

  constructor(private accountService: AccountService) { }

  getAccountInformation(): void {
    this.accountService.fetchAccount().subscribe(
      (account: Account) => { this.user = account }, error => console.log(`Error: ${error} `)
    );
  }

  ngOnInit() {

    
    this.getAccountInformation();


  }

}
