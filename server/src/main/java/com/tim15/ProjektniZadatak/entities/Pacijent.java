package com.tim15.ProjektniZadatak.entities;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pacijent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pacijent_id")
	private int id;
	@Embedded
	private Korisnik korisnik;
	
	public Pacijent() {
		super();
	}

	public Pacijent(int id, Korisnik korisnik) {
		super();
		this.korisnik = korisnik;
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

	
	
}
