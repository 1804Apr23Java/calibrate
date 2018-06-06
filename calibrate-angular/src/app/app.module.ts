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
import { SidebarQuizzesItemsComponent } from './components/sidebar-quizzes-items/sidebar-quizzes-items.component';
import { DisplayLibComponent } from './components/display-lib/display-lib.component';
import { LoginPortalComponent } from './components/login-portal/login-portal.component';
import { UserviewMyLibrariesComponent } from './components/userview-my-libraries/userview-my-libraries.component';
import { AppRoutingModule } from './/app-routing.module';
import { UserviewPublicLibrariesComponent } from './components/userview-public-libraries/userview-public-libraries.component';
import { UserviewPendingLibrariesComponent } from './components/userview-pending-libraries/userview-pending-libraries.component';
import { TakeAQuizComponent } from './components/take-a-quiz/take-a-quiz.component';
import { ReviewQuizzesComponent } from './components/review-quizzes/review-quizzes.component';
import { QuizSessionComponent } from './components/quiz-session/quiz-session.component';
import { QuizSessionQuestionComponent } from './components/quiz-session-question/quiz-session-question.component';
import { QuizSessionSidebarComponent } from './components/quiz-session-sidebar/quiz-session-sidebar.component';
import { HttpModule } from '@angular/http';
import { HttpClientModule } from '@angular/common/http';

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
    SidebarQuizzesItemsComponent,
    DisplayLibComponent,
    LoginPortalComponent,
    UserviewMyLibrariesComponent,
    UserviewPublicLibrariesComponent,
    UserviewPendingLibrariesComponent,
    TakeAQuizComponent,
    ReviewQuizzesComponent,
    QuizSessionComponent,
    QuizSessionQuestionComponent,
    QuizSessionSidebarComponent
    
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
