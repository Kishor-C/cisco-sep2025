import { Injectable } from '@angular/core';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  users : User[] = [];
  store(user : User | any) : void {
    this.users.push(user);
  }
  login(id: number, password: string) : boolean {
    for(let u of this.users) {
      if(u.id == id && u.password == password) {
        return true;
      }
    }
    return false;
  }
}
