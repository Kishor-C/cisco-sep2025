import { Component } from '@angular/core';

@Component({
  selector: 'app-parent1',
  standalone: false,
  templateUrl: './parent1.html',
  styleUrl: './parent1.css'
})
export class Parent1 {
  userArray = [{name:"Ajay", phone:399293}, {name:"Yuvraj",phone:9999}]

  plike : number = 0;
  pdislike : number = 0;

  updateLikes(v: number) {
    console.log('updateLikes: '+v);
    this.plike = v;
  }
  updateDisLikes2(v: number) {
    this.pdislike = v;
  }
}
