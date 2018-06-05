import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UserMainContentComponent } from './user-main-content.component';

describe('UserMainContentComponent', () => {
  let component: UserMainContentComponent;
  let fixture: ComponentFixture<UserMainContentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UserMainContentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UserMainContentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
