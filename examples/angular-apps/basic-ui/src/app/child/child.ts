import { Component, EventEmitter, Input, Output } from '@angular/core';
@Component({
  selector: 'app-child',
  standalone: false,
  templateUrl: './child.html',
  styleUrl: './child.css'
})
export class Child {
  @Input()
  user : string = "Guest";
  @Output()
  counter : EventEmitter<number> = new EventEmitter<number>();
  //click counter
  clickCounter : number = 0;
  handleClick() {
    this.clickCounter++;
    this.counter.emit(this.clickCounter);
  }
}
