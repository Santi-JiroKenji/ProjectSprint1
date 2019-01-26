import { Component, OnInit } from '@angular/core';
import { LoginService, User} from '../../shared/login/login.service';
@Component({
  selector: 'app-navbor',
  templateUrl: './navbor.component.html',
  styleUrls: ['./navbor.component.css']
})
export class NavborComponent implements OnInit {
  constructor(
    private loginServie: LoginService
  ){}
  ngOnInit(){
  }

  logout(){
    this.loginServie.logout();
  }
}
