import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { QuizSessionSidebarComponent } from './quiz-session-sidebar.component';

describe('QuizSessionSidebarComponent', () => {
  let component: QuizSessionSidebarComponent;
  let fixture: ComponentFixture<QuizSessionSidebarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ QuizSessionSidebarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(QuizSessionSidebarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
