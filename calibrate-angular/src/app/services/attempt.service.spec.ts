import { TestBed, inject } from '@angular/core/testing';

import { AttemptService } from './attempt.service';

describe('AttemptService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [AttemptService]
    });
  });

  it('should be created', inject([AttemptService], (service: AttemptService) => {
    expect(service).toBeTruthy();
  }));
});
