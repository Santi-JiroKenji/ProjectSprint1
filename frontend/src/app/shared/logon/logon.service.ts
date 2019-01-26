import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { Observable } from '../../../../node_modules/rxjs';
@Injectable({
  providedIn: 'root'
})
export class LogonService {
  public API = '//localhost:8080';
  constructor(
    private http: HttpClient,
    private router: Router
  ) { }

  logon(user: User){
    this.http.get(this.API + '/logon/' + user.username + '/' + user.password).subscribe((res) => {
      console.log(res);
      if(res == false){
        window.alert('Username หรือ Password ไม่ถูกต้อง');
      }else{
        this.router.navigate(['/home']);
      }
    });
  }
  logout(){
    this.router.navigate(['/logon']);
  }
}

export class User{
  username: string;
  password: string;
}