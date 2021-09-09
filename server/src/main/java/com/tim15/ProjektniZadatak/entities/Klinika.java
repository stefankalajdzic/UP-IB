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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Klinika {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name = "klinika_id")
	private int id;
	private String naziv;
	private String adresa;
	private String opis;
	private String cenovnik;
	@ManyToOne
	@JoinColumn(name = "klinicki_centar_id", referencedColumnName = "klinicki_centar_id", nullable = false)
	private KlinickiCentar klinickiCentarKomPripada;
	@OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "klinikaUKojojRadi")
	@JsonIgnore
	private Set<Lekar> lekari = new HashSet<Lekar>();
	@OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "klinikaUKojojRadi")
	@JsonIgnore
	private Set<MedicinskaSestra> medicinskeSestre = new HashSet<MedicinskaSestra>();
	@OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "klinikaKojeJeAdmin")
	@JsonIgnore
	private Set<Administrator> adminiKlinike = new HashSet<Administrator>();
	
	
	
	public Klinika() {
		super();
	}



	public Klinika(int id, String naziv, String adresa, String opis, KlinickiCentar klinickiCentarKomPripada,
			Set<Lekar> lekari, Set<MedicinskaSestra> medicinskeSestre, String cenovnik,
			Set<Administrator> adminiKlinike) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.adresa = adresa;
		this.opis = opis;
		this.klinickiCentarKomPripada = klinickiCentarKomPripada;
		this.lekari = lekari;
		this.medicinskeSestre = medicinskeSestre;
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



	public KlinickiCentar getKlinickiCentarKomPripada() {
		return klinickiCentarKomPripada;
	}



	public void setKlinickiCentarKomPripada(KlinickiCentar klinickiCentarKomPripada) {
		this.klinickiCentarKomPripada = klinickiCentarKomPripada;
	}



	public Set<Lekar> getLekari() {
		return lekari;
	}



	public void setLekari(Set<Lekar> lekari) {
		this.lekari = lekari;
	}



	public Set<MedicinskaSestra> getMedicinskeSestre() {
		return medicinskeSestre;
	}



	public void setMedicinskeSestre(Set<MedicinskaSestra> medicinskeSestre) {
		this.medicinskeSestre = medicinskeSestre;
	}



	public String getCenovnik() {
		return cenovnik;
	}



	public void setCenovnik(String cenovnik) {
		this.cenovnik = cenovnik;
	}



	public Set<Administrator> getAdminiKlinike() {
		return adminiKlinike;
	}



	public void setAdminiKlinike(Set<Administrator> adminiKlinike) {
		this.adminiKlinike = adminiKlinike;
	}



	@Override
	public String toString() {
		return "Klinika [id=" + id + ", naziv=" + naziv + ", adresa=" + adresa + ", opis=" + opis + ", cenovnik="
				+ cenovnik + ", klinickiCentarKomPripada=" + klinickiCentarKomPripada + ", lekari=" + lekari
				+ ", medicinskeSestre=" + medicinskeSestre + ", adminiKlinike=" + adminiKlinike + "]";
	}
	
	
	
}
