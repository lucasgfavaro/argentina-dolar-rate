import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { DollarRateService } from './dollarRate.service';

import { AppComponent }  from './app.component';

@NgModule({
  imports:      [ BrowserModule ],
  declarations: [ AppComponent ],
  bootstrap:    [ AppComponent ],
  providers: [DollarRateService]
})
export class AppModule { }
