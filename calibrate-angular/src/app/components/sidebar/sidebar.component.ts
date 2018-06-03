import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.css']
})
export class SidebarComponent implements OnInit {

  sidebarToggle: boolean;

  constructor() { }


  ngOnInit() {

    this.sidebarToggle = true;
  }

  showLibraries(){
    this.sidebarToggle = true;
  }

  showQuizzes(){
    this.sidebarToggle = false;
  }

}
