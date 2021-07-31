package com.tim15.ProjektniZadatak.entities.dtos.post;

import com.tim15.ProjektniZadatak.entities.Korisnik;

public class AdminDTOPost {

	private String ime;
	private String prezime;
	private String korisnickoIme;
	private String lozinka;
	private String email;
	private String pol;
	private String adresa;
	private String telefon;
	private int klinikaID;
	
	
	public static Korisnik napraviKorisnikaOdPostDTO(AdminDTOPost adp) {
		return new Korisnik(adp.ime, adp.prezime, adp.korisnickoIme, adp.lozinka, adp.email, adp.pol, adp.adresa, 
				adp.telefon);
	}
	
	

	public AdminDTOPost(String ime, String prezime, String korisnickoIme, String lozinka, String email, String pol,
			String adresa, String telefon, int klinikaID) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.korisnickoIme = korisnickoIme;
		this.lozinka = lozinka;
		this.email = email;
		this.pol = pol;
		this.adresa = adresa;
		this.telefon = telefon;
		this.klinikaID = klinikaID;
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
	public int getKlinikaID() {
		return klinikaID;
	}
	public void setKlinikaID(int klinikaID) {
		this.klinikaID = klinikaID;
	}



	@Override
	public String toString() {
		return "AdminDTOPost [ime=" + ime + ", prezime=" + prezime + ", korisnickoIme=" + korisnickoIme + ", lozinka="
				+ lozinka + ", email=" + email + ", pol=" + pol + ", adresa=" + adresa + ", telefon=" + telefon
				+ ", klinikaID=" + klinikaID + "]";
	}
	
	
	
}
