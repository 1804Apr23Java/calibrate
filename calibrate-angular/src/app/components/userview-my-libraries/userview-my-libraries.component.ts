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

  userLibraryList: Library[];

  constructor(private libraryService: LibraryService) { }
  
  getLibrariesByUserId(userId: number): void {
    this.libraryService.getLibrariesByUserId(userId).subscribe(
      //userLibraryList => list from service
    );
  }

  ngOnInit() {
    //call service to get libraries by localStorage - user - userId
  }

}
