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
  private questionUrl = 'http://ec2-184-72-131-208.compute-1.amazonaws.com:8080/CalibrateBackend/question';

  //get Question by passing URL + id through http
  public getQuestionById(questionId: number): Observable<Question> {
    return this.http.get(`${this.questionUrl}/${questionId}`).pipe(map((response: Response) => {
      return <Question>response.json();
    }));
  }

  //get Question by passing URL + id through http
  public addQuestionsToLibrary(libraryId: number, questionValue: string, difficulty: number): Observable<Question> {
    console.log('Added question to library: ' + `${this.questionUrl}/add/value/${questionValue}/difficulty/${difficulty}/libraryId/${libraryId}`);
    return this.http.get(`${this.questionUrl}/add/value/${questionValue}/difficulty/${difficulty}/libraryId/${libraryId}`).pipe(map((response: Response) => {
      return <Question>response.json();
    }));
  }

}
