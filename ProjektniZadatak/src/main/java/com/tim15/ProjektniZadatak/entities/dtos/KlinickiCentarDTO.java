package com.tim15.ProjektniZadatak.entities.dtos;

import com.tim15.ProjektniZadatak.entities.KlinickiCentar;

public class KlinickiCentarDTO {
	
	private int id;
	private String ime;
	private String adresa;

	
	public KlinickiCentarDTO(int id, String ime, String adresa) {
		this.id = id;
		this.ime = ime;
		this.adresa = adresa;
	}
	
	public KlinickiCentarDTO(KlinickiCentar kc) {
		this.id = kc.getId();
		this.ime = kc.getIme();
		this.adresa = kc.getAdresa();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
