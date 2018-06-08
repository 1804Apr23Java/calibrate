import { Component, OnInit } from '@angular/core';
import { Library } from 'src/app/classes/library';
import { LibraryService } from '../../services/library.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-userview-my-libraries',
  templateUrl: './userview-my-libraries.component.html',
  styleUrls: ['../userview/userview.component.css']
})

export class UserviewMyLibrariesComponent implements OnInit {

  libraryList: Library[] = [];
  libraryListString: String;

  constructor(private libraryService: LibraryService) { }
  
  getLibrariesByUserId(userId: number): void {
    this.libraryService.getLibrariesByUserId(userId).subscribe(
      (list: any) => { 
        this.libraryList = list; 
        this.libraryListString = JSON.stringify(this.libraryList);
       }
    );
  }
  
  deleteLibraryFromList(redXSelectedLibrary: Library): void {
    //delete Library from database
    this.libraryList.splice(this.libraryList.indexOf(redXSelectedLibrary), 1);
  }

  ngOnInit() {
    this.getLibrariesByUserId(parseInt(localStorage.getItem("accountId")));
  }

}
