package com.hardik.currencyconversion;

import org.springdoc.api.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class CurrencyConverterExceptionHandler {

    @ExceptionHandler(value = InputParameterErrors.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ErrorMessage> resourceNotFoundException(InputParameterErrors ex, WebRequest request) {
        ErrorMessage message = new ErrorMessage(
                String.format("Please check all input parameters !!! %s", ex.getMessage())
        );

        return new ResponseEntity<ErrorMessage>(message, HttpStatus.BAD_REQUEST);
    }
}
