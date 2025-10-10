import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class User {
  users : any = []; // empty user objects

  store(user : any) : void {
    this.users.push(user); // adds object to the array
  }
  list() : any {
    return this.users;
  }
}
