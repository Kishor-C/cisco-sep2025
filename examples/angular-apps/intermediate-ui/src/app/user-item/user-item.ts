import { Component, inject } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { UserService } from '../user-service';

@Component({
  selector: 'app-user-item',
  standalone: false,
  templateUrl: './user-item.html',
  styleUrl: './user-item.css'
})
export class UserItem {
  _builder = inject(FormBuilder);
  idForm = this._builder.group({id: []});
  _service = inject(UserService);
  user : any = undefined;
  error : any = undefined;
  search() {
    let id = this.idForm.value.id;
    this._service.getUserById(Number(id))
    .subscribe({
      next : data => {
          this.user = data;
          this.error = undefined;
      },
      error : err => {
        this.error = 'User with an id '+id+' not found';   
        this.user = undefined; 
      }
    });
  }
}
