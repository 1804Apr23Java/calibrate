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

  ngOnInit() {
    //TEST for user stored in local storage, this will normally be set on login
    localStorage.setItem("loggedInUser", "81");
    //END TEST
    this.getLibrariesByUserId(parseInt(localStorage.getItem("loggedInUser")));
  }

}
