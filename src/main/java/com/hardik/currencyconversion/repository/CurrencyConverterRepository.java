package com.hardik.currencyconversion.repository;

import com.hardik.currencyconversion.beans.ExchangeRates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyConverterRepository extends JpaRepository<ExchangeRates, Long> {
    ExchangeRates findByFromCurrencyAndToCurrency(String from, String to);
    ExchangeRates findByToCurrencyAndFromCurrency(String to, String from);
}
