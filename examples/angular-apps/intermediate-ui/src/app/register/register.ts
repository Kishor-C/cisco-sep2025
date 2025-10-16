import { Component, inject } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { UserService } from '../user-service';
import { User } from '../user';

@Component({
  selector: 'app-register',
  standalone: false,
  templateUrl: './register.html',
  styleUrl: './register.css'
})
export class Register {
  _builder = inject(FormBuilder);
  _service = inject(UserService);
  registerForm = this._builder.group({
    id: [], name : [], password: [], phone : []
  });
  register() {
    let user  = this.registerForm.value;
    this._service.store(user);
    this.registerForm.reset({});
  }
}
