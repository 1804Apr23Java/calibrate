import { Component, OnInit } from '@angular/core';

import { LibraryService } from '../../services/library.service';
import { Library } from '../../classes/library';

@Component({
  selector: 'app-userview-public-libraries',
  templateUrl: './userview-public-libraries.component.html',
  styleUrls: ['../userview/userview.component.css']
})
export class UserviewPublicLibrariesComponent implements OnInit {

  libraryList: Library[] = [];
  libraryListString: String;

  constructor(private libraryService: LibraryService) { }

  getAllPublicLibraries(): void{
    this.libraryService.getLibrariesByStatus("public").subscribe(
      (list: any) => { 
        this.libraryList = list; 
        this.libraryListString = JSON.stringify(this.libraryList);
        //console.log(this.libraryList);
       }
    );
  }

  ngOnInit() {
    this.getAllPublicLibraries();
  }

}
