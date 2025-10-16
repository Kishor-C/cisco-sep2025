import { NgModule, provideBrowserGlobalErrorListeners } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing-module';
import { App } from './app';
import { Login } from './login/login';
import { Register } from './register/register';
import { Success } from './success/success';
import { Add } from './add/add';
import { Search } from './search/search';
import { Settings } from './settings/settings';
import { Dashboard } from './dashboard/dashboard';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
@NgModule({
  declarations: [
    App,
    Login,
    Register,
    Success,
    Add,
    Search,
    Settings,
    Dashboard
  ],
  imports: [
    BrowserModule,
    AppRoutingModule, FormsModule, ReactiveFormsModule
  ],
  providers: [
    provideBrowserGlobalErrorListeners()
  ],
  bootstrap: [App]
})
export class AppModule { }
