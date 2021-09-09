package com.tim15.ProjektniZadatak.services.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tim15.ProjektniZadatak.entities.Klinika;
import com.tim15.ProjektniZadatak.entities.dtos.KlinikaDTO;
import com.tim15.ProjektniZadatak.entities.dtos.post.KlinikaDTOPost;
import com.tim15.ProjektniZadatak.repositories.KlinikaRepo;
import com.tim15.ProjektniZadatak.services.KlinickiCentarService;
import com.tim15.ProjektniZadatak.services.KlinikaService;


@Service
public class KlinikaServiceImplementation implements KlinikaService{

	@Autowired
	KlinikaRepo kr;
	
	@Autowired
	KlinickiCentarService kcs;
	
	@Override
	public Klinika vratiJednu(Integer klinikaId) {
		return kr.findById(klinikaId).orElse(null);
	}

	@Override
	public List<Klinika> vratiSve() {
		return kr.findAll();
	}

	@Override
	public Klinika sacuvajJednu(Klinika klinika) {
		return kr.save(klinika);
	}

	@Override
	public void obrisiJednu(Integer klinikaId) {
		kr.deleteById(klinikaId);
	}

	@Override
	public List<KlinikaDTO> vratiSveKaoDTO() {
		List<KlinikaDTO> koviDTO = new ArrayList<KlinikaDTO>();
		for (Klinika kc : kr.findAll()) {
			koviDTO.add(new KlinikaDTO(kc));
		}return koviDTO;
	}

	@Override
	public Klinika napraviKlinikuOdDTOPosta(KlinikaDTOPost kDTOPost) {
		Klinika k = new Klinika();
        k.setNaziv(kDTOPost.getNaziv());
        k.setAdresa(kDTOPost.getAdresa());
        k.setOpis(kDTOPost.getOpis());
        k.setKlinickiCentarKomPripada(kcs.vratiJedan(kDTOPost.getKcId()));
        k.setCenovnik(kDTOPost.getCenovnik());
        return k;
	}
	
	

}
