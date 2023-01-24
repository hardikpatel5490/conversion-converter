package com.hardik.currencyconversion.beans;

import javax.persistence.*;
import java.util.Date;

@Entity
public class ExchangeRates
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String fromCurrency;

    @Column
    private String toCurrency;

    @Column
    private Float exchangeRate;

    public ExchangeRates() {
    }

    public ExchangeRates(Long id, String fromCurrency, String toCurrency, Float exchangeRate) {
        this.id = id;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.exchangeRate = exchangeRate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Float getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Float exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @Override
    public String toString() {
        return "ExchangeRates{" +
                "id=" + id +
                ", fromCurrency='" + fromCurrency + '\'' +
                ", toCurrency='" + toCurrency + '\'' +
                ", exchangeRate=" + exchangeRate +
                '}';
    }
}
