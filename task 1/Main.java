package task1;

import task1.service.CurrencyService;
import task1.service.impl.CurrencyServiceImpl;

public class Main {

    public static void main(String[] args) {

        CurrencyService currencyService = new CurrencyServiceImpl();
        currencyService.setExchangeRate(3);

        System.out.println(currencyService.convert(12));
        System.out.println(currencyService.convert(122.3));

    }

}
