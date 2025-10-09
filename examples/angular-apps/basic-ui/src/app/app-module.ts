import { NgModule, provideBrowserGlobalErrorListeners } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing-module';
import { App } from './app';
import { DataBinding } from './data-binding/data-binding';
import { FormsModule } from '@angular/forms';
import { PipeDemo } from './pipe-demo/pipe-demo';
import { NameFormatterPipe } from './name-formatter-pipe';
import { TdfDemo } from './tdf-demo/tdf-demo';

@NgModule({
  declarations: [
    App,
    DataBinding,
    PipeDemo,
    NameFormatterPipe,
    TdfDemo
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [
    provideBrowserGlobalErrorListeners()
  ],
  bootstrap: [App]
})
export class AppModule { }
