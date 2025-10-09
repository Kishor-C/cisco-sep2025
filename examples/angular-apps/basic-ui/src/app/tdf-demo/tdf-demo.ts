import { Component } from '@angular/core';

@Component({
  selector: 'app-tdf-demo',
  standalone: false,
  templateUrl: './tdf-demo.html',
  styleUrl: './tdf-demo.css'
})
export class TdfDemo {
  firstname : string = "";
  lastname : string = "";
  dob : Date | undefined = undefined;
  handleSubmit() {
    // pass the data to the backend service to maintain in the db
    alert(this.firstname+" "+this.lastname+" "+this.dob);
    this.firstname = ""; 
    this.lastname = ""; 
    this.dob = undefined;
  }
}
