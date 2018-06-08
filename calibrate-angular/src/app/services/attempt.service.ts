import { Injectable } from '@angular/core';
import { ATTEMPT } from '../mock-quiz';
import { Http, Response } from '@angular/http';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Quiz } from '../classes/quiz';
import { Attempt } from '../classes/attempt';

@Injectable({
  providedIn: 'root'
})
export class AttemptService {

  constructor(private http: Http, private httpClient: HttpClient) { }

  // attempt = ATTEMPT;
  list: number[] = [];
  private attemptUrl = 'http://ec2-184-72-131-208.compute-1.amazonaws.com:8080/CalibrateBackend/attempt/submit/byAccount/';

  //submit/byAccount/{accountId}/forQuiz/{quizId}/withAnswers/{answerIds}


  public submitAttempt(attempt: Quiz): Observable<Attempt> {


    this.list = this.getSelectedArray(attempt);


    //submit/byAccount/{accountId}/forQuiz/{quizId}/withAnswers/{answ

    //console.log('sending to: ' + `${this.attemptUrl}${localStorage.getItem('accountId')}/forQuiz/${attempt.quizId}/withAnswers/${JSON.stringify(this.list).slice(1, -1)}`);

    return this.http.get(`${this.attemptUrl}${localStorage.getItem('accountId')}/forQuiz/${attempt.quizId}/withAnswers/${JSON.stringify(this.list).slice(1, -1)}`)
      .pipe(map((response: Response) => {
        return <Attempt>response.json();
      }));
  }

  getSelectedArray(completedQuiz): number[] {

    //console.log("getSelectedArray: " + JSON.stringify(completedQuiz.questions));

    let list: number[] = [];

    for (let question of completedQuiz.questions) {
      console.log(JSON.stringify(question));
      for (let answer of question.answers) {
        if (answer.isSelected) {
          list.push(answer.answerId);
        }
      }
    }
    console.log("answerId list: " + list);
    return list;
  }
}


    /*
    this.httpClient.post(this.attemptUrl + localStorage.getItem('accountId'), 
    JSON.stringify(this.myAttempt).subscribe( 
      data => { 
        alert('ok'); 
        console.log(data);
    }
  )
)

  
  */