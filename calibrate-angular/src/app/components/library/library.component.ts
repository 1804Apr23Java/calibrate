import { Component, OnInit } from '@angular/core';
import { Library } from '../../classes/library';
import { LibraryService } from '../../services/library.service';

@Component({
  selector: 'app-library',
  templateUrl: './library.component.html',
  styleUrls: ['./library.component.css']
})
export class LibraryComponent implements OnInit {

  libraries: Library[];
  //libs:Array<Library> = [];

  getLibraries(): void {
    this.libraries = this.libraryService.getLibraries();
  }
  
  constructor(private libraryService: LibraryService) { }

  ngOnInit() {

    //Call some service to get real data
    this.getLibraries();
  }

}
