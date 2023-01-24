package com.hardik.currencyconversion.beans;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Component
public class CurrencyConverterRequest {
    @Size(max = 3, min=3, message = "Correct from Currency code.")
    @NotNull
    @NotEmpty
    private String from;
    @Size(max = 3, min=3, message = "Correct from Currency code.")
    @NotNull
    @NotEmpty
    private String to;

    private BigDecimal unit;

    public CurrencyConverterRequest() {
    }

    public CurrencyConverterRequest(String from, String to, BigDecimal unit) {
        this.from = from;
        this.to = to;
        this.unit = unit;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getUnit() {
        return unit;
    }

    public void setUnit(BigDecimal unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "CurrencyConverterRequest{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", unit=" + unit +
                '}';
    }
}
