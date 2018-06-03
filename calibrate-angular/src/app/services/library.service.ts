import { Injectable } from '@angular/core';
import { Library } from '../classes/library';
import { LIBS } from '../mock-libraries';

@Injectable({
  providedIn: 'root'
})
export class LibraryService {

  constructor() { }

getLibraries(): Library[] {

  //http request plz
  return LIBS;
}

}
