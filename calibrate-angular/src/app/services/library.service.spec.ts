import { TestBed, inject } from '@angular/core/testing';
import { LibraryService } from './library.service';
import { HttpClientModule } from '@angular/common/http';
import { HttpModule } from '@angular/http';

describe('LibraryserviceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientModule, HttpModule],
      providers: [LibraryService]
    });
  });

  it('should be created', inject([LibraryService], (service: LibraryService) => {
    expect(service).toBeTruthy();
  }));
});
