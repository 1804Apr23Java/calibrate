import { Component, OnInit } from '@angular/core';

import { LibraryService } from '../../services/library.service';
import { Library } from '../../classes/library';

@Component({
  selector: 'app-userview-pending-libraries',
  templateUrl: './userview-pending-libraries.component.html',
  styleUrls: ['../userview/userview.component.css']
})
export class UserviewPendingLibrariesComponent implements OnInit {

  libraryList: Library[] = [];
  libraryListString: String;

  constructor(private libraryService: LibraryService) { }

    getAllPendingLibraries(): void{
      this.libraryService.getLibrariesByStatus("pending").subscribe(
        (list: any) => { 
          this.libraryList = list; 
          this.libraryListString = JSON.stringify(this.libraryList);
         }
      );
    }

  ngOnInit() {
    this.getAllPendingLibraries();
  }

}
