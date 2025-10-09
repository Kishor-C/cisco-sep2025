import { Component } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  standalone: false,
  templateUrl: './data-binding.html',
  styleUrl: './data-binding.css'
})
export class DataBinding {

  username : string = "Guest";
  myStyles : any = {"color":"red", "border":"5px dotted black", "margin":"25px"}
  applyClass: boolean = false;
  isHidden : boolean = false;
  isDisabled : boolean = false;
  counter : number = 0;
  toggleProperties() {
    this.applyClass = !this.applyClass;
    this.isDisabled = !this.isDisabled;
    this.counter++;
    if(this.counter % 3 == 0) {
      this.isHidden = !this.isHidden;
      this.username = this.username + this.counter;
    }
  }
}
