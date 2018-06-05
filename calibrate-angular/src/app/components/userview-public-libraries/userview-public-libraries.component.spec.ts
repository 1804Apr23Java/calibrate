import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UserviewPublicLibrariesComponent } from './userview-public-libraries.component';

describe('UserviewPublicLibrariesComponent', () => {
  let component: UserviewPublicLibrariesComponent;
  let fixture: ComponentFixture<UserviewPublicLibrariesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UserviewPublicLibrariesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UserviewPublicLibrariesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
