import { Component, OnInit } from '@angular/core';
import { AccountService } from '../../services/account.service';
import { Account } from '../../classes/account';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';
import { AttemptService } from '../../services/attempt.service';
//import { ATTEMPT } from '../../mock-quiz';
import { Attempt } from '../../classes/attempt';
import { QuizService } from '../../services/quiz.service';
import { NewQuiz } from '../../classes/newquiz';
import { Quiz } from '../../classes/quiz';


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
  //mockQuiz = ATTEMPT;
  mockQuiz: any;

  library: Library;
  librarystring: String;
  libraryList: any;
  libraryListString: String;
  newLibrary: Library;
  attempt: Attempt;
  newQuiz: Quiz;

  newQuizName: string = 'Brand New Quiz!';

  constructor(private accountService: AccountService, private libraryService: LibraryService, private router: Router, private attemptService: AttemptService, private quizService: QuizService) { }

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
f        localStorage.setItem('accountUsername', this.returnedAccount.username);
        //localStorage.setItem('accountObject', JSON.stringify(this.returnedAccount));
        this.router.navigate(['user']);
      }, 
        error => { console.log(`Error: ${error} `), localStorage.setItem('accountId',''), this.badCreds = true; }
    );

  }

  */

  generateLibrary(): void {

    //library: libraryName

    this.libraryService.addLibrary('New Library!!').subscribe(
      (library: Library) => {
        this.newLibrary = library;
        console.log(JSON.stringify('Generated Library: ' + JSON.stringify(this.newLibrary)));
      },
      error => { console.log(`Error: ${error} `); });
  }




  generateQuiz(): void {

    //quiz: NewQuiz, libraryIds: number[], quizLength: number

    this.quizService.getNewGeneratedQuiz(this.newQuizName, [81, 82], 12).subscribe(
      (quiz: Quiz) => {
        this.newQuiz = quiz;
        console.log(JSON.stringify('Generated Quiz: ' + JSON.stringify(this.newQuiz)));
      },
      error => { console.log(`Error: ${error} `); });
  }



  readInAttempt(): void {

    this.attemptService.submitAttempt(this.mockQuiz).subscribe(
      (attempt: Attempt) => {
        this.attempt = attempt;
        console.log(JSON.stringify(this.attempt));
        this.getScore();
      },
      error => { console.log(`Error: ${error} `); });
  }

  getScore(): number {

    console.log('Attempt Score: ' + (this.attempt.numCorrect / this.attempt.numberOfQuestions))
    return (this.attempt.numCorrect / this.attempt.numberOfQuestions)

  }

  ngOnInit() {

    if (localStorage.getItem('accountId') == '') {
      this.router.navigate(['login']);
    }

    //this.readInAttempt();   <-- WORKS
    //this.generateQuiz();    <-- WORKS
    // this.generateLibrary();




    // this.getAccountById(81);
    // this.getLibraryById(81);
    // this.getLibrariesByStatus(2);
    // localStorage.setItem("userObject", "hello");
    // console.log(localStorage.getItem("userObject"));
    // localStorage.clear();
    // console.log(localStorage.getItem("userObject"));
  }

}
