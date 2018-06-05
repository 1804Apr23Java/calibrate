import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UserviewMyLibrariesComponent } from './userview-my-libraries.component';

describe('UserviewMyLibrariesComponent', () => {
  let component: UserviewMyLibrariesComponent;
  let fixture: ComponentFixture<UserviewMyLibrariesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UserviewMyLibrariesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UserviewMyLibrariesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
