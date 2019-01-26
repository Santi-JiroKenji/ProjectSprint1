import { Component, OnInit } from '@angular/core';
import { LoginService, User} from '../../shared/login/login.service';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  
  user: User = new User();
  constructor(
    private loginServie: LoginService
  ){}

  ngOnInit() {
  }

  login(){
    this.loginServie.login(this.user);
  }
}
