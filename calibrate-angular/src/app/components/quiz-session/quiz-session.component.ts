import { Component, OnInit } from '@angular/core';
import { AttemptService } from '../../services/attempt.service';

@Component({
  selector: 'app-quiz-session',
  templateUrl: './quiz-session.component.html',
  styleUrls: ['./quiz-session.component.css']
})
export class QuizSessionComponent implements OnInit {

  constructor(private attemptService: AttemptService) { }

  ngOnInit() {


  }

}
