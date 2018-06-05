import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UserviewPendingLibrariesComponent } from './userview-pending-libraries.component';

describe('UserviewPendingLibrariesComponent', () => {
  let component: UserviewPendingLibrariesComponent;
  let fixture: ComponentFixture<UserviewPendingLibrariesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UserviewPendingLibrariesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UserviewPendingLibrariesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
