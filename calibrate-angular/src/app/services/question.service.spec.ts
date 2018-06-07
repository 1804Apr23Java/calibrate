import { TestBed, inject } from '@angular/core/testing';
import { QuestionService } from './question.service';
import { HttpClientModule } from '@angular/common/http';
import { HttpModule } from '@angular/http';

describe('QuestionService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientModule, HttpModule],
      providers: [QuestionService]
    });
  });

  it('should be created', inject([QuestionService], (service: QuestionService) => {
    expect(service).toBeTruthy();
  }));
});
