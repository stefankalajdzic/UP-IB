package com.tim15.ProjektniZadatak.entities.dtos.post;

public class KlinickiCentarDTOPost {

	private String ime;
	private String adresa;
	
	public KlinickiCentarDTOPost(String ime, String adresa) {
		this.ime = ime;
		this.adresa = adresa;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	
	
	
}
