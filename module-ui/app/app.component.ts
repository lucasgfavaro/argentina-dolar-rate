import { Component } from '@angular/core';
import { RateItem }  from './rate-item';
import { DollarRateService } from './dollarRate.service';

@Component({
  selector: 'my-app',
  template: `<h1>Hello!!!! {{name}}</h1>`,
})
export class AppComponent {

  name = 'Angular';

  historicalRate: RateItem[];

  constructor(private service: DollarRateService) { }

   getHistoricalDollarRate(): void {
    this.historicalRate = this.service.getRates();
  }

}
