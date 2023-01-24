package com.hardik.currencyconversion.beans;

import org.hibernate.annotations.JoinColumnOrFormula;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Currencies {

    @Id
    private Long Id;

    @Column
    private String code;

    @Column
    private String description;

    public Currencies() {
    }

    public Currencies(Long id, String code, String description) {
        Id = id;
        this.code = code;
        this.description = description;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
