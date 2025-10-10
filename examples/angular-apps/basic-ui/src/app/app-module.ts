import { NgModule, provideBrowserGlobalErrorListeners } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing-module';
import { App } from './app';
import { DataBinding } from './data-binding/data-binding';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { PipeDemo } from './pipe-demo/pipe-demo';
import { NameFormatterPipe } from './name-formatter-pipe';
import { TdfDemo } from './tdf-demo/tdf-demo';
import { MdfDemo } from './mdf-demo/mdf-demo';
import { UserDemo } from './user-demo/user-demo';

@NgModule({
  declarations: [
    App,
    DataBinding,
    PipeDemo,
    NameFormatterPipe,
    TdfDemo,
    MdfDemo,
    UserDemo
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule, ReactiveFormsModule
  ],
  providers: [
    provideBrowserGlobalErrorListeners()
  ],
  bootstrap: [App]
})
export class AppModule { }
