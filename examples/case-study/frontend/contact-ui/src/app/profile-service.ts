import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class ProfileService {
  
  backend_url = 'http://localhost:9090/api';
  http = inject(HttpClient);

  public save(profile : any) : Observable<any> {
    return this.http.post(this.backend_url+'/createProfile', profile); // HTTP POST BODY = {profile in json}
  }

  public get(id : number) : Observable<any> {
    return this.http.get(this.backend_url+"/profile/"+id);
  }
  

}
