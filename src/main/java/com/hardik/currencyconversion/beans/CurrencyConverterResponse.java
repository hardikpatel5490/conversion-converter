package com.hardik.currencyconversion.beans;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class CurrencyConverterResponse {
    private String fromCurrency;

    private String toCurrency;

    private BigDecimal value;

    private BigDecimal convertedValue;

    public CurrencyConverterResponse(CurrencyConverterRequest currencyConverterRequest, BigDecimal conversionValue) {
        this.fromCurrency = currencyConverterRequest.getFrom();
        this.toCurrency = currencyConverterRequest.getTo();
        this.convertedValue = conversionValue;
        this.value = currencyConverterRequest.getUnit();
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getConvertedValue() {
        return convertedValue;
    }

    public void setConvertedValue(BigDecimal convertedValue) {
        this.convertedValue = convertedValue;
    }
}
