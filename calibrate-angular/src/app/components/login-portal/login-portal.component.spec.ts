import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { LoginPortalComponent } from './login-portal.component';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { HttpClientModule } from '@angular/common/http';
import { RouterTestingModule} from '@angular/router/testing';

describe('LoginPortalComponent', () => {
  let component: LoginPortalComponent;
  let fixture: ComponentFixture<LoginPortalComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LoginPortalComponent ],
      imports: [FormsModule, HttpModule, HttpClientModule, RouterTestingModule],
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LoginPortalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
