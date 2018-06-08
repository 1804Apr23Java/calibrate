import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { UserviewPublicLibrariesComponent } from './userview-public-libraries.component';
import { HttpClientModule } from '@angular/common/http';
import { HttpModule } from '@angular/http';

describe('UserviewPublicLibrariesComponent', () => {
  let component: UserviewPublicLibrariesComponent;
  let fixture: ComponentFixture<UserviewPublicLibrariesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UserviewPublicLibrariesComponent ],
      imports: [HttpModule, HttpClientModule]
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
