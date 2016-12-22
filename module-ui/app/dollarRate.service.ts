import { RateItem }  from './rate-item';
import { Injectable }    from '@angular/core';

@Injectable()
export class DollarRateService {

  rates: RateItem[] = [ { rate: 11, date: 'Mr. Nice' },
                        { rate: 12, date: 'Narco' },
                        { rate: 13, date: 'Bombasto' }];

  getRates(): RateItem[] {
    return this.rates;
  }

}
