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

  userstr: Object;
  

  constructor(private accountService: AccountService) { }

  ngOnInit() {

    this.accountService.fetchAccount().subscribe(
      (account: Object) => {this.userstr = account.toString()}, error => console.log(`Error: ${error} `)
    );

    

  }

}
