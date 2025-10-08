import { Component } from '@angular/core';

@Component({
  selector: 'app-demo',
  standalone: false,
  templateUrl: './demo.html',
  styleUrl: './demo.css'
})
export class Demo {
  isHidden = true;
  fruits = ["apple", "orange", "grapes", "mango"];
  users = [
    {id: 20, name : "Ajay", salary:25000},
    {id: 22, name : "Charles", salary:35000}
  ]

  handleClick() {
    this.isHidden = !this.isHidden;
  }
  addItem(item : string) {
    this.fruits.push(item);
  }
}
