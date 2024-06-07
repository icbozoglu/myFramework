package com.example.demo.dto.abst;

import com.example.demo.enums.Status;
import jakarta.persistence.Column;
import jakarta.persistence.Version;
import lombok.Data;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;


public abstract class BaseDto<T>{
    private T id;
    @Column(nullable = false, updatable = false)
    private LocalDateTime eklenmeZamani;
    private String ekleyenKullanici;

    private LocalDateTime sonGuncellenmeZamani;
    private String sonGuncelleyenKullanici;
    private Status durum;

    private Long versiyon;

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public LocalDateTime getEklenmeZamani() {
        return eklenmeZamani;
    }

    public void setEklenmeZamani(LocalDateTime eklenmeZamani) {
        this.eklenmeZamani = eklenmeZamani;
    }

    public String getEkleyenKullanici() {
        return ekleyenKullanici;
    }

    public void setEkleyenKullanici(String ekleyenKullanici) {
        this.ekleyenKullanici = ekleyenKullanici;
    }

    public LocalDateTime getSonGuncellenmeZamani() {
        return sonGuncellenmeZamani;
    }

    public void setSonGuncellenmeZamani(LocalDateTime sonGuncellenmeZamani) {
        this.sonGuncellenmeZamani = sonGuncellenmeZamani;
    }

    public String getSonGuncelleyenKullanici() {
        return sonGuncelleyenKullanici;
    }

    public void setSonGuncelleyenKullanici(String sonGuncelleyenKullanici) {
        this.sonGuncelleyenKullanici = sonGuncelleyenKullanici;
    }

    public Status getDurum() {
        return durum;
    }

    public void setDurum(Status durum) {
        this.durum = durum;
    }

    public Long getVersiyon() {
        return versiyon;
    }

    public void setVersiyon(Long versiyon) {
        this.versiyon = versiyon;
    }
}
