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
public class Lekar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "lekar_id")
	private int id;
	//mozda listu svojih pacijenata
	@Embedded
	private Korisnik korisnik;
	
	@ManyToOne
	@JoinColumn(name = "klinika_id", referencedColumnName = "klinika_id", nullable = false)
	private Klinika klinikaUKojojRadi;
	
	public Lekar() {
		super();
	}

	public Lekar(int id, Korisnik korisnik, Klinika klinika) {
		super();
		this.id = id;
		this.korisnik = korisnik;
		this.klinikaUKojojRadi = klinika;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Korisnik getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}

	public Klinika getKlinika() {
		return klinikaUKojojRadi;
	}

	public void setKlinika(Klinika klinika) {
		this.klinikaUKojojRadi = klinika;
	}

	

}
