import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router'
import { HttpModule } from '@angular/http';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { LoginpageComponent } from './components/loginpage/loginpage.component';
import { NavbarSimpleComponent } from './components/navbar-simple/navbar-simple.component';
import { LibraryComponent } from './components/library/library.component';
import { ProfileComponent } from './components/profile/profile.component';
import { UserviewComponent } from './components/userview/userview.component';
import { NavbarLoggedComponent } from './components/navbar-logged/navbar-logged.component';
import { SidebarComponent } from './components/sidebar/sidebar.component';
import { QuizzesComponent } from './components/quizzes/quizzes.component';
import { DisplayLibComponent } from './components/display-lib/display-lib.component';
import { AccountService } from './services/account.service';

const appRoutes: Routes = [

  { path: 'login', component: LoginpageComponent },
  { path: 'loggedin', component: UserviewComponent },

  { path: '',
    redirectTo: '/login',
    pathMatch: 'full'
  }
 // { path: '**', component: PageNotFoundComponent }
];



@NgModule({
  declarations: [
    AppComponent,
    LoginpageComponent,
    NavbarSimpleComponent,
    LibraryComponent,
    ProfileComponent,
    UserviewComponent,
    NavbarLoggedComponent,
    SidebarComponent,
    QuizzesComponent,
    DisplayLibComponent,
    
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    HttpClientModule,
    RouterModule.forRoot(
      appRoutes,
      { enableTracing: true } // <-- debugging purposes only
    )
  ],
  providers: [AccountService],
  bootstrap: [AppComponent]
})
export class AppModule { }
