import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { QuizSessionComponent } from './quiz-session.component';
import { NavbarSimpleComponent } from '../navbar-simple/navbar-simple.component';
import { QuizSessionQuestionComponent } from '../quiz-session-question/quiz-session-question.component';
import { QuizSessionSidebarComponent } from '../quiz-session-sidebar/quiz-session-sidebar.component';
import { HttpClientModule } from '@angular/common/http';
import { HttpModule } from '@angular/http';

describe('QuizSessionComponent', () => {
  let component: QuizSessionComponent;
  let fixture: ComponentFixture<QuizSessionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ QuizSessionComponent, 
        NavbarSimpleComponent, 
        QuizSessionQuestionComponent, 
        QuizSessionSidebarComponent, ],
        imports: [
        HttpClientModule,
      HttpModule ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(QuizSessionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
