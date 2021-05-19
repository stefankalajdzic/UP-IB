package com.tim15.ProjektniZadatak.entities;


public class MedicinskaSestra {
	
	private Korisnik korisnik;
	private Klinika klinika;
	
	public MedicinskaSestra() {
		super();
	}

	public MedicinskaSestra(Korisnik korisnik, Klinika klinika) {
		super();
		this.korisnik = korisnik;
		this.klinika = klinika;
	}

	public Korisnik getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}

	public Klinika getKarton() {
		return klinika;
	}

	public void setKarton(Klinika klinika) {
		this.klinika = klinika;
	}

	

}
