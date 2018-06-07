import { Component, OnInit } from '@angular/core';
import { Quiz } from '../../classes/quiz';
import { QuizService } from '../../services/quiz.service';

@Component({
  selector: 'app-review-quizzes',
  templateUrl: './review-quizzes.component.html',
  styleUrls: ['../userview/userview.component.css']
})
export class ReviewQuizzesComponent implements OnInit {

  attemptsList: any[] = [];
  attemptsListString: String;
  accountId: number;

  constructor(
    private quizService: QuizService
  ) { }

  // getPreviousQuizzesByUserId(accountId: number): void{
  //   this.quizService.getPreviousQuizzesByUserId(this.accountId).subscribe(
  //     (list: Quiz[]) => { 
  //       console.log('am i real');
  //       this.attemptsList = list; 
  //       for (let val in list) {
  //         console.log(JSON.stringify(val));
  //       }
  //       this.attemptsListString = JSON.stringify(this.attemptsList);
  //      }
  //   );
  // }

  getPreviousQuizzesByUserId(accountId: number): void {
    this.quizService.getPreviousQuizzesByUserId(accountId).subscribe(
      (list: any) => { 
        this.attemptsList = list; 
        console.log('called component getPreviousQuizzes');
        console.log(this.attemptsList);
        this.attemptsListString = JSON.stringify(this.attemptsList);
       }
    );
  }

  ngOnInit() {
    this.accountId = parseInt(localStorage.getItem("accountId"));
    this.getPreviousQuizzesByUserId(this.accountId);
    console.log(this.attemptsListString);
  }

}
