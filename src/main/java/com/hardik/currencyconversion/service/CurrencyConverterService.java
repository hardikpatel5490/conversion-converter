package com.hardik.currencyconversion.service;

import com.hardik.currencyconversion.InputParameterErrors;
import com.hardik.currencyconversion.beans.CurrencyConverterRequest;
import com.hardik.currencyconversion.beans.ExchangeRates;
import com.hardik.currencyconversion.repository.CurrencyConverterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CurrencyConverterService {
    private static String USD = "USD";

    @Autowired
    private CurrencyConverterRepository currencyConverterRepository;

    public BigDecimal convert(CurrencyConverterRequest parameters) {
        BigDecimal units = parameters.getUnit();
        String fromCurrency = parameters.getFrom().toUpperCase();
        String toCurrency = parameters.getTo().toUpperCase();

        if(fromCurrency.equals(toCurrency)){
            throw new InputParameterErrors("correct from currency or to currency");
        }

        Float currencyRate;
        if (fromCurrency.equals(USD)) {
            currencyRate = currencyConverterRepository.findByFromCurrencyAndToCurrency(USD, toCurrency).getExchangeRate();
        } else if (toCurrency.equals(USD)) {
            currencyRate = 1 / currencyConverterRepository.findByFromCurrencyAndToCurrency(USD, fromCurrency).getExchangeRate();
        } else {
            currencyRate = this.getCurrencyNonUsdRate(fromCurrency, toCurrency);
        }

        System.out.println(currencyRate);
        return units.multiply(BigDecimal.valueOf(currencyRate));
    }

    private Float getCurrencyNonUsdRate(String fromCurrency, String toCurrency) {
        ExchangeRates fromUsdRate = currencyConverterRepository.findByFromCurrencyAndToCurrency(USD, fromCurrency);
        ExchangeRates usdToRate = currencyConverterRepository.findByFromCurrencyAndToCurrency(USD, toCurrency);
        if(fromUsdRate == null || usdToRate == null){
            throw new InputParameterErrors("To or From Currency code not found.");
        }
        return (1 / fromUsdRate.getExchangeRate()) * usdToRate.getExchangeRate();
    }
}
