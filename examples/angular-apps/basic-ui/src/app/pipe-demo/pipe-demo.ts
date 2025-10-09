import { Component } from '@angular/core';

@Component({
  selector: 'app-pipe-demo',
  standalone: false,
  templateUrl: './pipe-demo.html',
  styleUrl: './pipe-demo.css'
})
export class PipeDemo {
  employees : any = [
    {firstname : "Alex", dob : "2000-10-20", "gender":"Male", salary : 50000},
    {firstname : "Priya", dob : "2002-11-20", "gender":"Female", salary : 60000}
  ]
}
