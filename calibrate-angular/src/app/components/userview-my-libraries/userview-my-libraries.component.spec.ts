import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { UserviewMyLibrariesComponent } from './userview-my-libraries.component';
import { HttpClientModule } from '@angular/common/http';
import { HttpModule } from '@angular/http';

describe('UserviewMyLibrariesComponent', () => {
  let component: UserviewMyLibrariesComponent;
  let fixture: ComponentFixture<UserviewMyLibrariesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UserviewMyLibrariesComponent ],
      imports: [HttpModule, HttpClientModule]
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
