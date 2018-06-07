import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { UserviewComponent } from './userview.component';
import { RouterTestingModule } from '@angular/router/testing';
import { NavbarLoggedComponent } from '../navbar-logged/navbar-logged.component';
import { SidebarComponent } from '../sidebar/sidebar.component';
import { SidebarLibraryItemsComponent } from '../sidebar-library-items/sidebar-library-items.component';
import { SidebarQuizzesItemsComponent } from '../sidebar-quizzes-items/sidebar-quizzes-items.component';
import { HttpClientModule } from '@angular/common/http';
import { HttpModule } from '@angular/http';

describe('UserviewComponent', () => {
  let component: UserviewComponent;
  let fixture: ComponentFixture<UserviewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UserviewComponent, NavbarLoggedComponent, SidebarComponent, SidebarLibraryItemsComponent, SidebarQuizzesItemsComponent ],
      imports: [RouterTestingModule, HttpModule, HttpClientModule]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UserviewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
