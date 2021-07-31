package com.tim15.ProjektniZadatak.entities.dtos.post;


public class KlinikaDTOPost {

	private String naziv;
	private String adresa;
	private String opis;
	private int kcId;
	private String cenovnik;
	
	
	public KlinikaDTOPost(String naziv, String adresa, String opis, int kcId, String cenovnik) {
		super();
		this.naziv = naziv;
		this.adresa = adresa;
		this.opis = opis;
		this.kcId = kcId;
		this.cenovnik = cenovnik;
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


	public int getKcId() {
		return kcId;
	}


	public void setKcId(int kcId) {
		this.kcId = kcId;
	}


	public String getCenovnik() {
		return cenovnik;
	}


	public void setCenovnik(String cenovnik) {
		this.cenovnik = cenovnik;
	}
	
	
	
}
