import { Component, OnInit } from '@angular/core';
import { LogonService, User} from '../../shared/logon/logon.service';
@Component({
  selector: 'app-logon',
  templateUrl: './logon.component.html',
  styleUrls: ['./logon.component.css']
})
export class LogonComponent implements OnInit {
  
  user: User = new User();
  constructor(
    private logonServie: LogonService
  ){}

  ngOnInit() {
  }

  logon(){
    this.logonServie.logon(this.user);
  }
}
