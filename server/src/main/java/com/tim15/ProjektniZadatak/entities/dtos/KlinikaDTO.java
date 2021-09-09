package com.tim15.ProjektniZadatak.entities.dtos;

import com.tim15.ProjektniZadatak.entities.Klinika;

public class KlinikaDTO {
	
	private int id;
	private String naziv;
	private String adresa;
	private String opis;
	private KlinickiCentarDTO klinickiCentar;
	private String cenovnik;
	
	
	
	public KlinikaDTO(String naziv, String adresa, String opis, KlinickiCentarDTO kcDTO, String cenovnik) {
		super();
		this.naziv = naziv;
		this.adresa = adresa;
		this.opis = opis;
		this.klinickiCentar = kcDTO;
		this.cenovnik = cenovnik;
	}



	public KlinikaDTO(Klinika k) {
		this.id = k.getId();
		this.naziv = k.getNaziv();
		this.adresa = k.getAdresa();
		this.opis = k.getOpis();
		this.klinickiCentar = new KlinickiCentarDTO(k.getKlinickiCentarKomPripada());
		this.cenovnik = k.getCenovnik();
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



	public KlinickiCentarDTO getKcDTO() {
		return klinickiCentar;
	}



	public void setKcDTO(KlinickiCentarDTO kcDTO) {
		this.klinickiCentar = kcDTO;
	}



	public String getCenovnik() {
		return cenovnik;
	}



	public void setCenovnik(String cenovnik) {
		this.cenovnik = cenovnik;
	}

	
	
}
