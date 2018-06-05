import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ReviewQuizzesComponent } from './review-quizzes.component';

describe('ReviewQuizzesComponent', () => {
  let component: ReviewQuizzesComponent;
  let fixture: ComponentFixture<ReviewQuizzesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ReviewQuizzesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ReviewQuizzesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
