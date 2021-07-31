package com.tim15.ProjektniZadatak.entities.dtos;

import com.tim15.ProjektniZadatak.entities.Korisnik;

public class KorisnikDTO {
	
	private String ime;
	private String prezime;
	private String korisnickoIme;
	private String lozinka;
	private String email;
	private String pol;
	private String adresa;
	private String telefon;
	
	
	public KorisnikDTO(Korisnik k) {
		this.ime = k.getIme();
		this.prezime = k.getPrezime();
		this.korisnickoIme = k.getKorisnickoIme();
		this.lozinka = k.getLozinka();
		this.email = k.getEmail();
		this.pol = k.getPol();
		this.adresa = k.getAdresa();
		this.telefon = k.getTelefon();
	}


	public String getIme() {
		return ime;
	}


	public void setIme(String ime) {
		this.ime = ime;
	}


	public String getPrezime() {
		return prezime;
	}


	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}


	public String getKorisnickoIme() {
		return korisnickoIme;
	}


	public void setKorisnickoIme(String korisnickoIme) {
		this.korisnickoIme = korisnickoIme;
	}


	public String getLozinka() {
		return lozinka;
	}


	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPol() {
		return pol;
	}


	public void setPol(String pol) {
		this.pol = pol;
	}


	public String getAdresa() {
		return adresa;
	}


	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}


	public String getTelefon() {
		return telefon;
	}


	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	
	
}

