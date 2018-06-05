import { Component, OnInit } from '@angular/core';
import { Library } from '../../classes/library';
import { LibraryService } from '../../services/library.service';

@Component({
  selector: 'app-sidebar-library-items',
  templateUrl: './sidebar-library-items.component.html',
  styleUrls: ['./sidebar-library-items.component.css']
})
export class SidebarLibraryItemsComponent implements OnInit {

  libraries: Library[];
  //libs:Array<Library> = [];

  selectedLib: Library;

  onSelect(lib: Library): void {
    this.selectedLib = lib;
  }



  getLibraries(): void {
    this.libraries = this.libraryService.getLibraries();
  }

  constructor(private libraryService: LibraryService) { }

  ngOnInit() {

    //Call some service to get real data
    this.getLibraries();
  }

}
