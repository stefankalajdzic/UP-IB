package com.tim15.ProjektniZadatak.entities;

import java.util.ArrayList;

public class Klinika {

	private int id;
	private String naziv;
	private String adresa;
	private String opis;
	private Pregled pregled;
	private ArrayList<Lekar> lekari;
	private String cenovnik;
	private ArrayList<Administrator> adminiKlinike;
	
	public Klinika() {
		super();
	}

	public Klinika(int id, String naziv, String adresa, String opis, Pregled pregled, ArrayList<Lekar> lekari,
			String cenovnik, ArrayList<Administrator> adminiKlinike) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.adresa = adresa;
		this.opis = opis;
		this.pregled = pregled;
		this.lekari = lekari;
		this.cenovnik = cenovnik;
		this.adminiKlinike = adminiKlinike;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public Pregled getPregled() {
		return pregled;
	}

	public void setPregled(Pregled pregled) {
		this.pregled = pregled;
	}

	public ArrayList<Lekar> getLekari() {
		return lekari;
	}

	public void setLekari(ArrayList<Lekar> lekari) {
		this.lekari = lekari;
	}

	public String getCenovnik() {
		return cenovnik;
	}

	public void setCenovnik(String cenovnik) {
		this.cenovnik = cenovnik;
	}

	public ArrayList<Administrator> getAdminKlinike() {
		return adminiKlinike;
	}

	public void setAdminKlinike(ArrayList<Administrator> adminiKlinike) {
		this.adminiKlinike = adminiKlinike;
	}

	@Override
	public String toString() {
		return "Klinika [id=" + id + ", naziv=" + naziv + ", adresa=" + adresa + ", opis=" + opis + ", pregled="
				+ pregled + ", lekari=" + lekari + ", cenovnik=" + cenovnik + ", adminKlinike=" + adminiKlinike + "]";
	}

	
	
}
