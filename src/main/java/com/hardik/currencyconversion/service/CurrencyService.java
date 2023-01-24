package com.hardik.currencyconversion.service;

import com.hardik.currencyconversion.beans.Currencies;
import com.hardik.currencyconversion.repository.CurrenciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyService {

    @Autowired
    private CurrenciesRepository currenciesRepository;

    public List<Currencies> getAllCurrencies(){
        return currenciesRepository.findAll();
    }
}
