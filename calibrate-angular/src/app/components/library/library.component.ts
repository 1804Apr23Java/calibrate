import { Component, OnInit } from '@angular/core';
import { Library } from '../../classes/library';

@Component({
  selector: 'app-library',
  templateUrl: './library.component.html',
  styleUrls: ['./library.component.css']
})
export class LibraryComponent implements OnInit {

  libraries : Library[] = [];

  constructor() { }

  ngOnInit() {

    //Call some service to get real data    

    this.libraries[0].libraryId = 1;
    this.libraries[0].name = "Java Core";
    this.libraries[0].status = 0;
    this.libraries[1].libraryId = 2;
    this.libraries[1].name = "Angular";
    this.libraries[1].status = 0;
    this.libraries[2].libraryId = 3;
    this.libraries[2].name = "Servlets";
    this.libraries[2].status = 1;


  }

}
