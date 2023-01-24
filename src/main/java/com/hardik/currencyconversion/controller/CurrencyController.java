package com.hardik.currencyconversion.controller;

import com.hardik.currencyconversion.beans.Currencies;
import com.hardik.currencyconversion.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping(value = "/currencies", produces = MediaType.APPLICATION_JSON_VALUE)
public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public List<Currencies> getAllCurrency()
    {
        System.out.println('t');
        return currencyService.getAllCurrencies();
    }
}
