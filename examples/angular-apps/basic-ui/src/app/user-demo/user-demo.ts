import { Component, inject } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
@Component({
  selector: 'app-user-demo',
  standalone: false,
  templateUrl: './user-demo.html',
  styleUrl: './user-demo.css'
})
export class UserDemo {
  private _builder = inject(FormBuilder);
  // the group function takesn an object of form-controls
  // each form-control can have default values & validators in the form of an array
  userForm = this._builder.group({
    username : ['', [Validators.required]],
    phone: ['', [Validators.required, Validators.maxLength(10)]],
    dob: ['', [Validators.required]], 
    email: ['', [Validators.required]]
  });
  isFormValid: boolean = true;
  handleForm() {
    if(this.userForm.invalid) {
      alert("Some fields are mandatory");
      this.isFormValid = false;
    } else {
      console.log(this.userForm.value);
      this.isFormValid = true;
    }
  }
}
