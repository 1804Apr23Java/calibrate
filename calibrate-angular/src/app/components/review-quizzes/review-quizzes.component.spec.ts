import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { ReviewQuizzesComponent } from './review-quizzes.component';
import { HttpClientModule } from '@angular/common/http';
import { HttpModule } from '@angular/http';
import { SidebarComponent } from '../sidebar/sidebar.component';
import { SidebarLibraryItemsComponent } from '../sidebar-library-items/sidebar-library-items.component';
import { SidebarQuizzesItemsComponent } from '../sidebar-quizzes-items/sidebar-quizzes-items.component';

describe('ReviewQuizzesComponent', () => {
  let component: ReviewQuizzesComponent;
  let fixture: ComponentFixture<ReviewQuizzesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ReviewQuizzesComponent, 
        SidebarLibraryItemsComponent, 
        SidebarQuizzesItemsComponent ],
      imports: [ HttpClientModule, HttpModule]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ReviewQuizzesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
