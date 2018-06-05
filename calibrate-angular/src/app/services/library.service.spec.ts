import { TestBed, inject } from '@angular/core/testing';

import { LibraryService } from './library.service';

describe('LibraryserviceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [LibraryService]
    });
  });

  it('should be created', inject([LibraryService], (service: LibraryService) => {
    expect(service).toBeTruthy();
  }));
});