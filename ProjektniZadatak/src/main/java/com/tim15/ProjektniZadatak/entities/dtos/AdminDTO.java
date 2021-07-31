package com.tim15.ProjektniZadatak.entities.dtos;

import com.tim15.ProjektniZadatak.entities.Administrator;

public class AdminDTO {
	
	private int id;
	private KorisnikDTO korisnik;
	private KlinikaDTO klinika;

	public AdminDTO(Administrator a) {
		this.id = a.getId();
		this.korisnik = new KorisnikDTO(a.getKorisnik());
		this.klinika = new KlinikaDTO(a.getKlinikaKojeJeAdmin());
	}

	public AdminDTO(int id, KorisnikDTO korisnik, KlinikaDTO klinika) {
		super();
		this.id = id;
		this.korisnik = korisnik;
		this.klinika = klinika;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public KorisnikDTO getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(KorisnikDTO korisnik) {
		this.korisnik = korisnik;
	}

	public KlinikaDTO getKlinika() {
		return klinika;
	}

	public void setKlinika(KlinikaDTO klinika) {
		this.klinika = klinika;
	}
	
	
	
}
