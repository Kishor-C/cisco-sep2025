import { Component, inject, OnInit } from '@angular/core';
import { User } from '../user';

@Component({
  selector: 'app-list-demo',
  standalone: false,
  templateUrl: './list-demo.html',
  styleUrl: './list-demo.css'
})
export class ListDemo implements OnInit {
  _service = inject(User);

  usersList : any = undefined;

  // this method is automatically when the component is initialized
  ngOnInit() {
    this.usersList = this._service.list();
  }
}
