import { Component, OnInit } from '@angular/core';
import { Library } from 'src/app/classes/library';
import { LibraryService } from '../../services/library.service';
import { Observable } from 'rxjs';
import { Quiz } from 'src/app/classes/quiz';
import { QuizService } from '../../services/quiz.service';

@Component({
  selector: 'app-take-a-quiz',
  templateUrl: './take-a-quiz.component.html',
  styleUrls: ['../userview/userview.component.css']
})
export class TakeAQuizComponent implements OnInit {

  libraryList: Library[] = [];
  libraryListString: String;
  publicLibraryList: Library[] = [];
  publicLibraryListString: String;

  currentlySelectedLibraries: Library[] = [];
  maxQuestions: number = 0;

  newName: any = "";
  newQuiz: Quiz;
  newLibraryIds: number[] = [];
  newQuizLength: number;

  constructor(private libraryService: LibraryService, private quizService: QuizService) { }

  getLibrariesByUserId(userId: number): void {
    this.libraryService.getLibrariesByUserId(userId).subscribe(
      (list: any) => { 
        this.libraryList = list; 
        this.libraryListString = JSON.stringify(this.libraryList);
       }
    );
  }

  getAllPublicLibraries(): void{
    this.libraryService.getLibrariesByStatus("public").subscribe(
      (list: any) => { 
        this.publicLibraryList = list; 
        this.publicLibraryListString = JSON.stringify(this.publicLibraryList);
       }
    );
  }

  addLibraryToList(userAddedLibrary: Library): void {
    if(!this.currentlySelectedLibraries.includes(userAddedLibrary)){
      this.currentlySelectedLibraries.push(userAddedLibrary);
    }      
    this.getMaxQuestions();
    //close modal here
  }
  
  getMaxQuestions(): void{
    this.maxQuestions = 0;
    let library: any;
    for(let l of this.currentlySelectedLibraries){
      library = l;
      this.maxQuestions = this.maxQuestions + library.questions.length;
    }
  }

  deleteLibraryFromList(redXSelectedLibrary: Library): void {
    this.currentlySelectedLibraries.splice(this.currentlySelectedLibraries.indexOf(redXSelectedLibrary), 1);
    this.getMaxQuestions();
    this.validateNumber();
  }

  validateNumber(): void {
    let numberInputElement = <HTMLInputElement>document.getElementById("desiredNumberOfQuestions");
    let changedNumber = numberInputElement.value;
    if(parseInt(changedNumber) < 0){
      numberInputElement.value = "0";
    } else if (parseInt(changedNumber) > this.maxQuestions){
      numberInputElement.value = this.maxQuestions.toString();
    }

  }

  generateQuizData(): void {
    this.newName = '';
    this.newLibraryIds = [];
    let numberInputElement = <HTMLInputElement>document.getElementById("desiredNumberOfQuestions");
    this.newQuizLength = parseInt(numberInputElement.value);

    for(let library of this.currentlySelectedLibraries){
      console.log('Generated Quiz Name: ' + JSON.stringify(library));
      this.newName += library.name;
      console.log('Last Library Name: ' + JSON.stringify(this.newName));
      this.newLibraryIds.push(library.libraryId);
    }

    localStorage.setItem('currentQuizSession', this.newName);


  }

  generateQuiz(): void {
    this.generateQuizData();

    this.quizService.getNewGeneratedQuiz(this.newName, this.newLibraryIds, this.newQuizLength).subscribe(
      (quiz: Quiz) => {
        this.newQuiz = quiz;
        console.log('New Quiz: ' + JSON.stringify(this.newQuiz));
      },
      error => { console.log(`Error: ${error} `); });
      localStorage.setItem("currentQuizSession", JSON.stringify(this.newQuiz.name));

  }

  ngOnInit() {
    this.getLibrariesByUserId(parseInt(localStorage.getItem("accountId")));
    this.getAllPublicLibraries();
    this.getMaxQuestions();
  }

}
