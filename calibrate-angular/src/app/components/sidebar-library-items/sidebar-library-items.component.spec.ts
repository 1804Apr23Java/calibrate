import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { SidebarLibraryItemsComponent } from './sidebar-library-items.component';
import { HttpClientModule } from '@angular/common/http';
import { HttpModule } from '@angular/http';

describe('SideBarLibraryItemsComponent', () => {
  let component: SidebarLibraryItemsComponent;
  let fixture: ComponentFixture<SidebarLibraryItemsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SidebarLibraryItemsComponent ],
      imports: [HttpClientModule, HttpModule]
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
