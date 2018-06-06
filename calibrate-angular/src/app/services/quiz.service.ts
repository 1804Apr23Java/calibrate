import { Injectable } from '@angular/core';
import { Quiz } from '../classes/quiz';

import { Http, Response } from '@angular/http';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class QuizService {

  //inject Http objects
  constructor(private http: Http, private httpClient: HttpClient) { }

  //set URL for api fetching without id 
  private quizUrl = 'http://ec2-184-72-131-208.compute-1.amazonaws.com:8080/CalibrateNgTest/quiz';

  //get Quiz by passing URL + id through http
  public getQuizById(quizId: number): Observable<Quiz> {
    return this.http.get(`${this.quizUrl}/${quizId}`).pipe(map((response: Response) => {
      return <Quiz>response.json();
    }));
  }

}
