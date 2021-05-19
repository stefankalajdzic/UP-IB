package com.tim15.ProjektniZadatak.entities;

public class Pregled {

	private int id;
	private String datum;
	private String vreme;
	private String trajanjePregleda;
	private Lekar lekar;
	private MedicinskaSestra medicinskaSestra;
	private double cena;
	
	public Pregled() {
		super();
	}

	public Pregled(int id, String datum, String vreme, String trajanjePregleda, Lekar lekar,
			MedicinskaSestra medicinskaSestra, double cena) {
		super();
		this.id = id;
		this.datum = datum;
		this.vreme = vreme;
		this.trajanjePregleda = trajanjePregleda;
		this.lekar = lekar;
		this.medicinskaSestra = medicinskaSestra;
		this.cena = cena;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public String getVreme() {
		return vreme;
	}

	public void setVreme(String vreme) {
		this.vreme = vreme;
	}

	public String getTrajanjePregleda() {
		return trajanjePregleda;
	}

	public void setTrajanjePregleda(String trajanjePregleda) {
		this.trajanjePregleda = trajanjePregleda;
	}

	public Lekar getLekar() {
		return lekar;
	}

	public void setLekar(Lekar lekar) {
		this.lekar = lekar;
	}

	public MedicinskaSestra getMedicinskaSestra() {
		return medicinskaSestra;
	}

	public void setMedicinskaSestra(MedicinskaSestra medicinskaSestra) {
		this.medicinskaSestra = medicinskaSestra;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	@Override
	public String toString() {
		return "Pregled [id=" + id + ", datum=" + datum + ", vreme=" + vreme + ", trajanjePregleda=" + trajanjePregleda
				+ ", lekar=" + lekar + ", medicinskaSestra=" + medicinskaSestra + ", cena=" + cena + "]";
	}
	
}
