package com.hardik.currencyconversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.math.BigDecimal;

@SpringBootApplication
//@EnableJpaRepositories
public class CurrencyConversionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionApplication.class, args);
	}

	@Bean
	public BigDecimal getBigDecimal(){
		return BigDecimal.ZERO;
	}
}
