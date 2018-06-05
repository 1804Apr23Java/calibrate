import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SidebarQuizzesItemsComponent } from './sidebar-quizzes-items.component';

describe('QuizzesComponent', () => {
  let component: SidebarQuizzesItemsComponent;
  let fixture: ComponentFixture<SidebarQuizzesItemsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SidebarQuizzesItemsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SidebarQuizzesItemsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
