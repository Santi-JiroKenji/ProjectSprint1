import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { 
  MatButtonModule,
  MatCardModule,
  MatInputModule,
  MatListModule,
  MatToolbarModule,
  MatFormFieldModule,
  MatSelectModule,
  MatTableModule,
  MatRadioModule,
  MatCheckboxModule,
  MatDatepickerModule,
  MatNativeDateModule
} from '@angular/material';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { LoginService } from './shared/login/login.service';
import { LogonComponent } from './components/logon/logon.component';
import { LogonService } from './shared/logon/logon.service';
import { NavbarComponent } from './components/navbar/navbar.component';
import { NavborComponent } from './components/navbor/navbor.component';
import { HomeComponent } from './components/home/home.component';
import { HomemainComponent } from './components/homemain/homemain.component';
import { HometoComponent } from './components/hometo/hometo.component';
import { WorkScheduleRegComponent } from './components/workSchedule-reg/workSchedule-reg.component';
import { WorkScheduleRegService } from './shared/workSchedule-reg/workSchedule-reg.service';
const appRoutes: Routes = [
  {path: '', redirectTo: '/homemain', pathMatch: 'full'},
  {path: 'login', component: LoginComponent},
  {path: 'logon', component: LogonComponent},
  {path: 'home', component: HomeComponent},
  {path: 'homemain', component: HomemainComponent},
  {path: 'hometo', component: HometoComponent},
  {path: 'workSchedule-register', component: WorkScheduleRegComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    LogonComponent,
    NavbarComponent,
    NavborComponent,
    HomeComponent,
    HomemainComponent,
    HometoComponent,
    WorkScheduleRegComponent
  ],
  imports: [
    HttpModule,
    BrowserModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatCardModule,
    MatInputModule,
    MatListModule,
    MatToolbarModule,
    FormsModule,
    MatFormFieldModule,
    MatSelectModule,
    MatTableModule,
    MatRadioModule,
    MatCheckboxModule,
    ReactiveFormsModule,
    MatDatepickerModule,
    MatNativeDateModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [
    LoginService,
    LogonService,
    WorkScheduleRegService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
