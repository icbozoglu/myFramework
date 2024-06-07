package com.example.demo.dto.abst;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;


public abstract class KisiDto<T> extends BaseDto<T>{

    @NotBlank
    private String ad;
    @NotBlank
    private String soyad;
    @NotBlank
    @Size(min=11, max=11)
    private String TCKimlikNo;
    private LocalDate dogumTarihi;

    public @NotBlank String getAd() {
        return ad;
    }

    public void setAd(@NotBlank String ad) {
        this.ad = ad;
    }

    public @NotBlank String getSoyad() {
        return soyad;
    }

    public void setSoyad(@NotBlank String soyad) {
        this.soyad = soyad;
    }

    public @NotBlank @Size(min = 11, max = 11) String getTCKimlikNo() {
        return TCKimlikNo;
    }

    public void setTCKimlikNo(@NotBlank @Size(min = 11, max = 11) String TCKimlikNo) {
        this.TCKimlikNo = TCKimlikNo;
    }

    public LocalDate getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(LocalDate dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }
}
