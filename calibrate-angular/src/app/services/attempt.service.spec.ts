import { TestBed, inject } from '@angular/core/testing';
import { AttemptService } from './attempt.service';
import { HttpClientModule } from '@angular/common/http';
import { HttpModule } from '@angular/http';

describe('AttemptService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpModule, HttpClientModule],
      providers: [AttemptService]
    });
  });

  it('should be created', inject([AttemptService], (service: AttemptService) => {
    expect(service).toBeTruthy();
  }));
});
