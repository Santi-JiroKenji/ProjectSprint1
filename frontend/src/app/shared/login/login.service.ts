import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { Observable } from '../../../../node_modules/rxjs';
@Injectable({
  providedIn: 'root'
})
export class LoginService {
  public API = '//localhost:8080';
  constructor(
    private http: HttpClient,
    private router: Router
  ) { }

  login(user: User){
    this.http.get(this.API + '/login/' + user.username + '/' + user.password).subscribe((res) => {
      console.log(res);
      if(res == false){
        window.alert('Username หรือ Password ไม่ถูกต้อง');
      }else{
        this.router.navigate(['/home']);
      }
    });
  }
  logout(){
    this.router.navigate(['/login']);
  }
}

export class User{
  username: string;
  password: string;
}