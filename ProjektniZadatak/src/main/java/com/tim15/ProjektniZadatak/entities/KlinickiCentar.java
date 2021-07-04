package com.tim15.ProjektniZadatak.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class KlinickiCentar {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name = "klinicki_centar_id")
	private int id;
	private String ime;
	private String adresa;
	@OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "klinickiCentarKomPripada")
	private Set<Klinika> njegoveKlinike = new HashSet<Klinika>();
	
	
	public KlinickiCentar() {
		super();
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


	public Set<Klinika> getNjegoveKlinike() {
		return njegoveKlinike;
	}


	public void setNjegoveKlinike(Set<Klinika> njegoveKlinike) {
		this.njegoveKlinike = njegoveKlinike;
	}

	
	
}
