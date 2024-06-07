package com.example.demo.dto.impl;

import com.example.demo.dto.abst.KisiDto;
import com.example.demo.enums.Department;


public class PersonelDto extends KisiDto<Integer> {
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
