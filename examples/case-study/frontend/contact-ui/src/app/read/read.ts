import { Component, inject } from '@angular/core';
import { ProfileService } from '../profile-service';

@Component({
  selector: 'app-read',
  standalone: false,
  templateUrl: './read.html',
  styleUrl: './read.css',
})
export class Read {
  service = inject(ProfileService);
  profile : any = undefined;
  message : any = undefined;
  handleRefresh(id: number) {
    this.service.get(id).subscribe({
      next : (value) => this.profile = value,
      error : (err) => this.message = err
    });
  }
}
