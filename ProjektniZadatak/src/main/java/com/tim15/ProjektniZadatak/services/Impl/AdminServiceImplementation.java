package com.tim15.ProjektniZadatak.services.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.tim15.ProjektniZadatak.entities.Administrator;
import com.tim15.ProjektniZadatak.entities.dtos.AdminDTO;
import com.tim15.ProjektniZadatak.entities.dtos.post.AdminDTOPost;
import com.tim15.ProjektniZadatak.repositories.AdminRepo;
import com.tim15.ProjektniZadatak.services.AdminService;
import com.tim15.ProjektniZadatak.services.KlinikaService;


@Service
public class AdminServiceImplementation implements AdminService{

	@Autowired
	AdminRepo ar;
	
	@Autowired
	KlinikaService ks;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public Administrator vratiJednog(Integer adminId) {
		return ar.findById(adminId).orElse(null);
	}

	@Override
	public List<Administrator> vratiSve() {
		return ar.findAll();
	}

	@Override
	public Administrator sacuvajJednog(Administrator admin) {
		return ar.save(admin);
	}

	@Override
	public void obrisiJednog(Integer id) {
		ar.deleteById(id);
		
	}

	@Override
	public Administrator vratiJednog(String korisnickoIme) {
		for(Administrator a : ar.findAll()) {
			if(a.getKorisnik().getKorisnickoIme().equalsIgnoreCase(korisnickoIme)) {
				return a;
			}
		}return null;
	}
	
	@Override
    public Administrator napraviAdminaOdDTOPosta(AdminDTOPost userDTO) {

        for(Administrator adm : ar.findAll()) {
        	if(adm.getKorisnik().getKorisnickoIme().equalsIgnoreCase(userDTO.getKorisnickoIme())) {
        		return null;
        	}
        }


        Administrator a = new Administrator();
        a.getKorisnik().setIme(userDTO.getIme());
        a.getKorisnik().setPrezime(userDTO.getPrezime());
        a.getKorisnik().setKorisnickoIme(userDTO.getKorisnickoIme());
        a.getKorisnik().setLozinka(passwordEncoder.encode(userDTO.getLozinka()));
        a.getKorisnik().setEmail(userDTO.getEmail());
        a.getKorisnik().setPol(userDTO.getPol());
        a.getKorisnik().setAdresa(userDTO.getAdresa());
        a.getKorisnik().setTelefon(userDTO.getTelefon());
        a.setKlinikaKojeJeAdmin(ks.vratiJednu(userDTO.getKlinikaID()));

        return a;
    }
	
	public Administrator azurirajAdminaOdDTOa(AdminDTO userDTO) {
		

        Administrator a = new Administrator();
        a.setId(userDTO.getId());
        a.getKorisnik().setIme(userDTO.getKorisnik().getIme());
        a.getKorisnik().setPrezime(userDTO.getKorisnik().getPrezime());
        a.getKorisnik().setKorisnickoIme(userDTO.getKorisnik().getKorisnickoIme());
        a.getKorisnik().setLozinka(passwordEncoder.encode(userDTO.getKorisnik().getLozinka()));
        a.getKorisnik().setEmail(userDTO.getKorisnik().getEmail());
        a.getKorisnik().setPol(userDTO.getKorisnik().getPol());
        a.getKorisnik().setAdresa(userDTO.getKorisnik().getAdresa());
        a.getKorisnik().setTelefon(userDTO.getKorisnik().getTelefon());
        a.setKlinikaKojeJeAdmin(ks.vratiJednu(userDTO.getKlinika().getId()));

        return a;
    }

	@Override
	public List<AdminDTO> vratiSveKaoDTO() {
		List<AdminDTO> aoviDTO = new ArrayList<AdminDTO>();
		for (Administrator a : ar.findAll()) {
			aoviDTO.add(new AdminDTO(a));
		}
		return aoviDTO;
	}

}
