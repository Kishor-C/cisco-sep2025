import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-child1',
  standalone: false,
  templateUrl: './child1.html',
  styleUrl: './child1.css'
})
export class Child1 {

  @Input()
  user : any = undefined;

  @Output()
  like : EventEmitter<number> = new EventEmitter<number>();

  @Output()
  disLike : EventEmitter<number> = new EventEmitter<number>();

  likeCounter = 0;
  dislikeCounter = 0;
  
  likeIncr() {
    this.like.emit(++this.likeCounter)
    console.log(this.likeCounter);
  }
  disLikeIncr() {
    this.disLike.emit(++this.dislikeCounter)
    console.log(this.dislikeCounter)
  }
}
