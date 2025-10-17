import { inject, Injectable } from '@angular/core';
import { User } from './user';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  http = inject(HttpClient); // supplies the HttpClient object

  getUsers() : Observable<any> {
    let url = 'https://jsonplaceholder.typicode.com/users';
    return this.http.get(url);
  }

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
