import { inject } from '@angular/core';
import { CanActivateFn, Router } from '@angular/router';

export const authDemoGuard: CanActivateFn = (route, state) => {
  let id = sessionStorage.getItem('user');
  let routedId = route.paramMap.get('id');
  let router = inject(Router);
  if(id == routedId)  return true;
  else {
    alert('You must login first');
    router.navigate(['/login']);
    return false;
  }
};
