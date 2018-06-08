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
  selectedLib: Library;
  accountIsAdmin: boolean = false;

  onSelect(lib: Library): void {
    this.selectedLib = lib;
  }

  checkIfAdmin(): void{
    if(localStorage.getItem("accountIsAdmin") === "true"){
      this.accountIsAdmin = true;
    }
  }


  constructor(private libraryService: LibraryService) { }

  ngOnInit() {
    this.checkIfAdmin();
  }

}
