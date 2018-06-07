import { Component, OnInit } from '@angular/core';
import { Library } from 'src/app/classes/library';
import { LibraryService } from '../../services/library.service';
import { Observable } from 'rxjs';

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

  constructor(private libraryService: LibraryService) { }

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
      console.log(this.maxQuestions);
    }
  }

  deleteLibraryFromList(redXSelectedLibrary: Library): void {
    this.currentlySelectedLibraries.splice(this.currentlySelectedLibraries.indexOf(redXSelectedLibrary), 1);
    this.getMaxQuestions();
  }

  ngOnInit() {
    this.getLibrariesByUserId(parseInt(localStorage.getItem("accountId")));
    this.getAllPublicLibraries();
    this.getMaxQuestions();
  }

}
