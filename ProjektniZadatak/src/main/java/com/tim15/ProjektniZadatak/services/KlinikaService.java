package com.tim15.ProjektniZadatak.services;

import java.util.List;

import com.tim15.ProjektniZadatak.entities.Klinika;
import com.tim15.ProjektniZadatak.entities.dtos.KlinikaDTO;
import com.tim15.ProjektniZadatak.entities.dtos.post.KlinikaDTOPost;


public interface KlinikaService {

	Klinika vratiJednu(Integer klinikaId);

	List<Klinika> vratiSve();

	Klinika sacuvajJednu(Klinika klinikaId);

	void obrisiJednu(Integer klinikaId);

	List<KlinikaDTO> vratiSveKaoDTO();

	Klinika napraviKlinikuOdDTOPosta(KlinikaDTOPost kDTOPost);
	
	
}
