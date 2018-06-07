import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { TakeAQuizComponent } from './take-a-quiz.component';
import { HttpClientModule } from '@angular/common/http';
import { HttpModule } from '@angular/http';

describe('TakeAQuizComponent', () => {
  let component: TakeAQuizComponent;
  let fixture: ComponentFixture<TakeAQuizComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TakeAQuizComponent ],
      imports: [HttpModule, HttpClientModule]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TakeAQuizComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
