import { Component, OnInit, Input } from '@angular/core';
import { Library } from '../../classes/library';
import { Question, Answers } from '../../classes/question';

@Component({
  selector: 'app-display-lib',
  templateUrl: './display-lib.component.html',
  styleUrls: ['./display-lib.component.css']
})
export class DisplayLibComponent implements OnInit {


  @Input() lib: Library;

  constructor() { }

  ngOnInit() {
  }

}
