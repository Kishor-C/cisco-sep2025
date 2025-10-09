import { Component, inject } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
@Component({
  selector: 'app-mdf-demo',
  standalone: false,
  templateUrl: './mdf-demo.html',
  styleUrl: './mdf-demo.css'
})
export class MdfDemo {
  // inject() function injects the FormBuilder object
  builder = inject(FormBuilder);
  userForm = this.builder.group({
    firstname: ['', Validators.compose([Validators.required])], lastname: [''], dob : ['']
  });
  handleSubmit() {
    console.log(this.userForm.value);
    this.userForm.reset({});
    this.userForm.controls['lastname'].reset('Guest');
  }
}
