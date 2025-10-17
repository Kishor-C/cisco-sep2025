import { TestBed } from '@angular/core/testing';
import { CanActivateFn } from '@angular/router';

import { authDemoGuard } from './auth-demo-guard';

describe('authDemoGuard', () => {
  const executeGuard: CanActivateFn = (...guardParameters) => 
      TestBed.runInInjectionContext(() => authDemoGuard(...guardParameters));

  beforeEach(() => {
    TestBed.configureTestingModule({});
  });

  it('should be created', () => {
    expect(executeGuard).toBeTruthy();
  });
});
