import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { LoginpageComponent } from './components/loginpage/loginpage.component';
import { NavbarSimpleComponent } from './components/navbar-simple/navbar-simple.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginpageComponent,
    NavbarSimpleComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
