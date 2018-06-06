import { Component, OnInit } from '@angular/core';
import { QuizService } from '../../services/quiz.service';

@Component({
  selector: 'app-review-quizzes',
  templateUrl: './review-quizzes.component.html',
  styleUrls: ['../userview/userview.component.css']
})
export class ReviewQuizzesComponent implements OnInit {

  constructor(
    private quizService: QuizService
  ) { }

  ngOnInit() {
  }

}
