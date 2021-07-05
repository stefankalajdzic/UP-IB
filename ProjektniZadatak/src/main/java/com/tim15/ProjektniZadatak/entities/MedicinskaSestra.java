package com.tim15.ProjektniZadatak.entities;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MedicinskaSestra {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "medicinska_sestra_id")
	private int id;
	@Embedded
	private Korisnik korisnik;
	@ManyToOne
	@JoinColumn(name = "klinika_id", referencedColumnName = "klinika_id", nullable = false)
	private Klinika klinikaUKojojRadi;
	
	public MedicinskaSestra() {
		super();
	}
	
	public MedicinskaSestra(Korisnik korisnik, Klinika klinika) {
		super();
		this.korisnik = korisnik;
		this.klinikaUKojojRadi = klinika;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Klinika getKlinikaUKojojRadi() {
		return klinikaUKojojRadi;
	}

	public void setKlinikaUKojojRadi(Klinika klinikaUKojojRadi) {
		this.klinikaUKojojRadi = klinikaUKojojRadi;
	}

	public Korisnik getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}

}
