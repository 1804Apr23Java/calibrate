import { Component, OnInit } from '@angular/core';
import { QuizService } from '../../services/quiz.service';

@Component({
  selector: 'app-review-quizzes',
  templateUrl: './review-quizzes.component.html',
  styleUrls: ['../userview/userview.component.css']
})
export class ReviewQuizzesComponent implements OnInit {

  attemptsList: any = [];
  attemptsListString: String;
  userId: number;

  constructor(
    private quizService: QuizService
  ) { }

  getPreviousQuizzesByUserId(): void{
    this.quizService.getPreviousQuizzesByUserId(this.userId).subscribe(
      (list: any) => { 
        this.attemptsList = list; 
        this.attemptsListString = JSON.stringify(this.attemptsList);
       }
    );
  }

  ngOnInit() {
    //TEST for user stored in local storage, this will normally be set on login
    localStorage.setItem("loggedInUser", "44");
    //END TEST

    this.userId = parseInt(localStorage.getItem("loggedInUser"));
    this.getPreviousQuizzesByUserId();
    //TEST for user stored in local storage, this will normally be set on login
  }

}
