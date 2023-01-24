package com.hardik.currencyconversion.repository;

import com.hardik.currencyconversion.beans.Currencies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrenciesRepository extends JpaRepository<Currencies, Long> {
}
