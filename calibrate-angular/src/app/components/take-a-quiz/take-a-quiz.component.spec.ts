import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TakeAQuizComponent } from './take-a-quiz.component';

describe('TakeAQuizComponent', () => {
  let component: TakeAQuizComponent;
  let fixture: ComponentFixture<TakeAQuizComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TakeAQuizComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TakeAQuizComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
