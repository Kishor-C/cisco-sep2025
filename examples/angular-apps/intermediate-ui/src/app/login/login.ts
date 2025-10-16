import { Component, inject } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  standalone: false,
  templateUrl: './login.html',
  styleUrl: './login.css'
})
export class Login {
  _router = inject(Router); // to programmatically navigate
  _formBuilder = inject(FormBuilder);//to create model drin form
  errorMessage : string | undefined = undefined;//message when authentication fails
  loginForm = this._formBuilder.group({id: [], password: []})//form controls
  
  // invoke when user hits login button
  authenticate() {
    let login = this.loginForm.value;
    // id can be anything however password must be 1234
    if(String(login.password) =='1234') {
      this._router.navigate(['success', login.id]) // success/:id
    } else {
      this.errorMessage = 'Invalid credentials';
      this.loginForm.reset({});
    }
  }

}
