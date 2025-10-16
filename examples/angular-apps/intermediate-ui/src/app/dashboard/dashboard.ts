import { Component, inject, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-dashboard',
  standalone: false,
  templateUrl: './dashboard.html',
  styleUrl: './dashboard.css'
})
export class Dashboard implements OnInit{
  _activatedRoute = inject(ActivatedRoute);
  id : number | undefined = undefined;
  ngOnInit(): void {
      this._activatedRoute.paramMap.subscribe({
        next : value => this.id = Number(value.get('id')),
        error : err => console.log('error: ', err)
      })
  }
}
