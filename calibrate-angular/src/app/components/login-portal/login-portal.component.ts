import { Component, OnInit } from '@angular/core';
import { AccountService } from '../../services/account.service';
import { Account } from '../../classes/account';
import { Observable } from 'rxjs';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router'


@Component({
  selector: 'app-login-portal',
  templateUrl: './login-portal.component.html',
  styleUrls: ['./login-portal.component.css']
})
export class LoginPortalComponent implements OnInit {

  constructor(private accountService: AccountService, private router: Router) { }

  
  getLogin(): void {
    this.accountService.getLogin(this.account).subscribe(
      (account: Account) => { 
        this.returnedAccount = account; 
        this.userString = JSON.stringify(this.returnedAccount); 
        console.log(this.userString) 
        localStorage.setItem('accountId', this.returnedAccount.accountId.toString());
        this.router.navigate(['user']);
      }, 
        error => { console.log(`Error: ${error} `), localStorage.setItem('accountId','') }
    );

  }


  account = new Account();
  returnedAccount = new Account();
  userString = new String();

  onSubmit(accountService) {

    this.getLogin();

  }

  ngOnInit() {

   
  }

}
