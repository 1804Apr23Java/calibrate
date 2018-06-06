import { Injectable } from '@angular/core';
import { Question } from '../classes/question';

import { Http, Response } from '@angular/http';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class QuestionService {

  //inject Http objects
  constructor(private http: Http, private httpClient: HttpClient) { }

  //set URL for api fetching without id 
  private questionUrl = 'http://ec2-184-72-131-208.compute-1.amazonaws.com:8080/CalibrateNgTest/question';

  //get Question by passing URL + id through http
  public getQuestionById(questionId: number): Observable<Question> {
    return this.http.get(`${this.questionUrl}/${questionId}`).pipe(map((response: Response) => {
      return <Question>response.json();
    }));
  }
}
