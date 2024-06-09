package com.example.demo.entity.abst;

import com.example.demo.enums.Status;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.time.Instant;

@MappedSuperclass
public abstract class BaseEntity<T> {
	@Id
	@GeneratedValue
	private T id;

	@CreationTimestamp
	private Instant eklenmeZamani;
	private String ekleyenKullanici;

	@UpdateTimestamp
	private Instant sonGuncellenmeZamani;
	private String sonGuncelleyenKullanici;

	@Enumerated(EnumType.STRING)
	private Status durum;

	@Version
	private Long versiyon;

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public Instant getEklenmeZamani() {
		return eklenmeZamani;
	}

	public void setEklenmeZamani(Instant eklenmeZamani) {
		this.eklenmeZamani = eklenmeZamani;
	}

	public String getEkleyenKullanici() {
		return ekleyenKullanici;
	}

	public void setEkleyenKullanici(String ekleyenKullanici) {
		this.ekleyenKullanici = ekleyenKullanici;
	}

	public Instant getSonGuncellenmeZamani() {
		return sonGuncellenmeZamani;
	}

	public void setSonGuncellenmeZamani(Instant sonGuncellenmeZamani) {
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
