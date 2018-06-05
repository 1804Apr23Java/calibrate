import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { LoginpageComponent } from './components/loginpage/loginpage.component';
import { UserviewComponent } from './components/userview/userview.component';
import { UserviewMyLibrariesComponent } from './components/userview-my-libraries/userview-my-libraries.component';
import { UserviewPublicLibrariesComponent } from './components/userview-public-libraries/userview-public-libraries.component';
import { UserviewPendingLibrariesComponent } from './components/userview-pending-libraries/userview-pending-libraries.component';
import { TakeAQuizComponent } from './components/take-a-quiz/take-a-quiz.component';
import { ReviewQuizzesComponent } from './components/review-quizzes/review-quizzes.component';


const appRoutes: Routes = [

  { path: 'login', component: LoginpageComponent},
  { path: 'user', 
    component: UserviewComponent,
    children: [
      { path: 'mylibraries', component: UserviewMyLibrariesComponent },
      { path: 'publiclibraries', component: UserviewPublicLibrariesComponent },
      { path: 'pendinglibraries', component: UserviewPendingLibrariesComponent },
      { path: 'take-a-quiz', component: TakeAQuizComponent },
      { path: 'review-quizzes', component: ReviewQuizzesComponent }
    ] 
  },

  { path: '',
    redirectTo: '/login',
    pathMatch: 'full'
  }
//  { path: '**', component: LoginpageComponent }
];

@NgModule({
  exports: [ RouterModule ],
  imports: [ RouterModule.forRoot(appRoutes)]
})

export class AppRoutingModule {}