import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplayLibComponent } from './display-lib.component';

describe('DisplayLibComponent', () => {
  let component: DisplayLibComponent;
  let fixture: ComponentFixture<DisplayLibComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DisplayLibComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DisplayLibComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
