package com.hardik.currencyconversion.controller;

import com.hardik.currencyconversion.beans.CurrencyConverterRequest;
import com.hardik.currencyconversion.beans.CurrencyConverterResponse;
import com.hardik.currencyconversion.service.CurrencyConverterService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController("Currency Converter")
@OpenAPIDefinition(info = @Info(title = "Currency Converter apis"))
@RequestMapping(value = "/currencyconverter", produces = MediaType.APPLICATION_JSON_VALUE)
public class CurrencyConverterController {

    @Autowired
    private CurrencyConverterService currencyConverterService;

    @GetMapping(value = "/{fromCurrency}/{toCurrency}/{units}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CurrencyConverterResponse convert(@RequestParam String fromCurrency, @RequestParam String toCurrency, @RequestParam Float units) {
        CurrencyConverterRequest currencyConverterRequest =
                new CurrencyConverterRequest(fromCurrency, toCurrency, BigDecimal.valueOf(units));
        BigDecimal conversionValue = currencyConverterService.convert(currencyConverterRequest);
        CurrencyConverterResponse currencyConverterResponse = new CurrencyConverterResponse(currencyConverterRequest, conversionValue);
        return currencyConverterResponse;
    }
}
