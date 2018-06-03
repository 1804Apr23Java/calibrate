import { Component, OnInit } from '@angular/core';
import { Library } from '../../classes/library';

@Component({
  selector: 'app-library',
  templateUrl: './library.component.html',
  styleUrls: ['./library.component.css']
})
export class LibraryComponent implements OnInit {

  libraries : Library[] = [];
  libs:Array<Library> = [];


  constructor() { }

  ngOnInit() {

    //Call some service to get real data
    
    this.libs[0] = new Library();
    this.libs[0].accountId = 0;
    this.libs[0].libraryId = 0;
    this.libs[0].name = 'Core Java';
    this.libs[0].question = [];
    this.libs[0].status = 0;

    this.libs[1] = new Library();
    this.libs[1].accountId = 0;
    this.libs[1].libraryId = 1;
    this.libs[1].name = 'Servlets';
    this.libs[1].question = [];
    this.libs[1].status = 1;

    this.libs[2] = new Library();
    this.libs[2].accountId = 0;
    this.libs[2].libraryId = 2;
    this.libs[2].name = 'Angular';
    this.libs[2].question = [];
    this.libs[2].status = 2;


  }

}
