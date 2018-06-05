import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SidebarLibraryItemsComponent } from './sidebar-library-items.component';

describe('LibraryComponent', () => {
  let component: SidebarLibraryItemsComponent;
  let fixture: ComponentFixture<SidebarLibraryItemsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SidebarLibraryItemsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SidebarLibraryItemsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
