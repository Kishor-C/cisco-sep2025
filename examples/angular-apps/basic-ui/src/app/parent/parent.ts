import { Component } from '@angular/core';

@Component({
  selector: 'app-parent',
  standalone: false,
  templateUrl: './parent.html',
  styleUrl: './parent.css'
})
export class Parent {
  items : string[] = ['Alex', 'Charles', 'Kishor'];
  size : number = 0;
  modifySize(s : number) { 
    this.size = this.size + s;
  }
}
