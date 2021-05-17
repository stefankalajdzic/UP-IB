package com.tim15.ProjektniZadatak.entities;


public class Administrator {
	
	private Korisnik korisnik;
	private Klinika klinikaKojeJeAdmin;
	
	
	public Administrator() {
		super();
	}


	public Administrator(Korisnik korisnik, Klinika klinikaKojeJeAdmin) {
		super();
		this.korisnik = korisnik;
		this.klinikaKojeJeAdmin = klinikaKojeJeAdmin;
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
		return "Administrator [korisnik=" + korisnik + ", klinikaKojeJeAdmin=" + klinikaKojeJeAdmin + "]";
	}

	
	
}
