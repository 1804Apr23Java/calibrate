import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router'

import { AppComponent } from './app.component';
import { LoginpageComponent } from './components/loginpage/loginpage.component';
import { NavbarSimpleComponent } from './components/navbar-simple/navbar-simple.component';
import { SidebarLibraryItemsComponent } from './components/sidebar-library-items/sidebar-library-items.component';
import { ProfileComponent } from './components/profile/profile.component';
import { UserviewComponent } from './components/userview/userview.component';
import { NavbarLoggedComponent } from './components/navbar-logged/navbar-logged.component';
import { SidebarComponent } from './components/sidebar/sidebar.component';
import { QuizzesComponent } from './components/quizzes/quizzes.component';
import { DisplayLibComponent } from './components/display-lib/display-lib.component';
import { LoginPortalComponent } from './components/login-portal/login-portal.component';

const appRoutes: Routes = [

  { path: 'login', component: LoginpageComponent },
  { path: 'loggedin', component: UserviewComponent },

  { path: '',
    redirectTo: '/login',
    pathMatch: 'full'
  }
//  { path: '**', component: LoginpageComponent }
];



@NgModule({
  declarations: [
    AppComponent,
    LoginpageComponent,
    NavbarSimpleComponent,
    SidebarLibraryItemsComponent,
    ProfileComponent,
    UserviewComponent,
    NavbarLoggedComponent,
    SidebarComponent,
    QuizzesComponent,
    DisplayLibComponent,
    LoginPortalComponent
    
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot(
      appRoutes,
      { enableTracing: true } // <-- debugging purposes only
    )
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
