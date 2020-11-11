package task1.service.impl;

import task1.service.CurrencyService;

public class CurrencyServiceImpl implements CurrencyService {

    private double exchangeRate;


    @Override
    public double convert(double amount) {
        return amount / exchangeRate;
    }

    @Override
    public void setExchangeRate(double value) {
        this.exchangeRate = value;
    }
}
