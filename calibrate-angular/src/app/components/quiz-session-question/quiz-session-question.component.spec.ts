import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { QuizSessionQuestionComponent } from './quiz-session-question.component';

describe('QuizSessionQuestionComponent', () => {
  let component: QuizSessionQuestionComponent;
  let fixture: ComponentFixture<QuizSessionQuestionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ QuizSessionQuestionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(QuizSessionQuestionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
