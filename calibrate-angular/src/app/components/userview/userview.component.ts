import { Component, OnInit } from '@angular/core';
import { AccountService } from '../../services/account.service';
import { Account } from '../../classes/account';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';
import { AttemptService } from '../../services/attempt.service';
import { ATTEMPT } from '../../mock-quiz';
import { Attempt } from '../../classes/attempt';


import { LibraryService } from '../../services/library.service';
import { Library } from '../../classes/library';

@Component({
  selector: 'app-userview',
  templateUrl: './userview.component.html',
  styleUrls: ['./userview.component.css']
})
export class UserviewComponent implements OnInit {

  accountId: number;
  user: Account;
  userstring: String;
  mockQuiz = ATTEMPT;

  library: Library;
  librarystring: String;
  libraryList: any;
  libraryListString: String;
  attempt: Attempt;

  constructor(private accountService: AccountService, private libraryService: LibraryService, private router: Router, private attemptService: AttemptService) { }

  // getAccountById(accountId: number): void {
  //   this.accountService.getAccountById(accountId).subscribe(
  //     (account: Account) => { this.user = account; this.userstring = JSON.stringify(this.user) }, error => console.log(`Error: ${error} `)
  //   );
  // }

  // getLibraryById(libraryId: number): void{
  //   this.libraryService.getLibraryById(libraryId).subscribe(
  //     (library: any) => { this.library = library; this.librarystring = JSON.stringify(this.library) }
  //   );
  // }

  // getLibrariesByStatus(status: number): void{
  //   this.libraryService.getLibrariesByStatus("public").subscribe(
  //     (list: any) => { this.libraryList = list; this.libraryListString = JSON.stringify(this.libraryList) }
  //   );
  // }

  /*

  
  getLogin(): void {
    this.accountService.getLogin(this.account).subscribe(
      (account: Account) => { 
        this.returnedAccount = account; 
        localStorage.setItem('accountId', this.returnedAccount.accountId.toString());
        localStorage.setItem('accountEmail', this.returnedAccount.email);
        localStorage.setItem('accountIsAdmin', this.returnedAccount.isAdmin.toString());
        localStorage.setItem('accountUsername', this.returnedAccount.username);
        //localStorage.setItem('accountObject', JSON.stringify(this.returnedAccount));
        this.router.navigate(['user']);
      }, 
        error => { console.log(`Error: ${error} `), localStorage.setItem('accountId',''), this.badCreds = true; }
    );

  }

  */

  readInAttempt(): void {


    this.attemptService.submitAttempt(this.mockQuiz).subscribe(
      (attempt: Attempt) => {
        this.attempt = attempt;
        console.log(JSON.stringify(this.attempt));
        this.getScore();
      },
      error => { console.log(`Error: ${error} `);});
  }

  getScore(): number {

    console.log('Attempt Score: ' + (this.attempt.numCorrect / this.attempt.numberOfQuestions))
    return (this.attempt.numCorrect / this.attempt.numberOfQuestions)

  }

  ngOnInit() {

    if (localStorage.getItem('accountId') == '') {
      this.router.navigate(['login']);
    }

    this.readInAttempt();
   


    // this.getAccountById(81);
    // this.getLibraryById(81);
    // this.getLibrariesByStatus(2);
    // localStorage.setItem("userObject", "hello");
    // console.log(localStorage.getItem("userObject"));
    // localStorage.clear();
    // console.log(localStorage.getItem("userObject"));
  }

}
