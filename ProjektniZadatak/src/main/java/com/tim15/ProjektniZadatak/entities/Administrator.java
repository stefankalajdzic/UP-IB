package com.tim15.ProjektniZadatak.entities;


import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Administrator{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Embedded
	private Korisnik korisnik;
	@ManyToOne
	@JoinColumn(name = "klinika_id", referencedColumnName = "klinika_id", nullable = false)
	private Klinika klinikaKojeJeAdmin;
	
	
	public Administrator() {
		super();
		this.korisnik = new Korisnik();
	}


	public Administrator(int id, Korisnik korisnik, Klinika klinikaKojeJeAdmin) {
		super();
		this.id = id;
		this.korisnik = korisnik;
		this.klinikaKojeJeAdmin = klinikaKojeJeAdmin;
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


	public Klinika getKlinikaKojeJeAdmin() {
		return klinikaKojeJeAdmin;
	}


	public void setKlinikaKojeJeAdmin(Klinika klinikaKojeJeAdmin) {
		this.klinikaKojeJeAdmin = klinikaKojeJeAdmin;
	}


	@Override
	public String toString() {
		return "Administrator [id=" + id + ", korisnik=" + korisnik + ", klinikaKojeJeAdmin=" + klinikaKojeJeAdmin
				+ "]";
	}

	
}
