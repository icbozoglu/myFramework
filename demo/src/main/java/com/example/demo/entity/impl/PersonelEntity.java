package com.example.demo.entity.impl;

import com.example.demo.entity.abst.KisiBaseEntity;
import com.example.demo.enums.Department;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity(name = "personel")
public class PersonelEntity extends KisiBaseEntity<Integer> {

    @Enumerated(EnumType.STRING)
    private Department bolum;
    private double maas;

    public Department getBolum() {
        return bolum;
    }

    public void setBolum(Department bolum) {
        this.bolum = bolum;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }
}
