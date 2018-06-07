import { Component, OnInit } from '@angular/core';
import { AccountService } from '../../services/account.service';
import { Account } from '../../classes/account';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';

import { LibraryService } from '../../services/library.service';
import { Library } from '../../classes/library';

@Component({
  selector: 'app-userview',
  templateUrl: './userview.component.html',
  styleUrls: ['./userview.component.css']
})
export class UserviewComponent implements OnInit {
  
  accountId: number;
  user: Account;
  userstring: String;

  library: Library;
  librarystring: String;
  libraryList: any;
  libraryListString: String;

  constructor(
    private accountService: AccountService, private libraryService: LibraryService, private router: Router ) { }

  // getAccountById(accountId: number): void {
  //   this.accountService.getAccountById(accountId).subscribe(
  //     (account: Account) => { this.user = account; this.userstring = JSON.stringify(this.user) }, error => console.log(`Error: ${error} `)
  //   );
  // }

  // getLibraryById(libraryId: number): void{
  //   this.libraryService.getLibraryById(libraryId).subscribe(
  //     (library: any) => { this.library = library; this.librarystring = JSON.stringify(this.library) }
  //   );
  // }

  // getLibrariesByStatus(status: number): void{
  //   this.libraryService.getLibrariesByStatus("public").subscribe(
  //     (list: any) => { this.libraryList = list; this.libraryListString = JSON.stringify(this.libraryList) }
  //   );
  // }

  ngOnInit() {

    if(localStorage.getItem('accountId') == ''){
      this.router.navigate(['login']);
    }

    
    // this.getAccountById(81);
    // this.getLibraryById(81);
    // this.getLibrariesByStatus(2);
    // localStorage.setItem("userObject", "hello");
    // console.log(localStorage.getItem("userObject"));
    // localStorage.clear();
    // console.log(localStorage.getItem("userObject"));
  }

}
