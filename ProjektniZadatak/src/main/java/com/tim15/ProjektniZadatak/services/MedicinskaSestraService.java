package com.tim15.ProjektniZadatak.services;

import java.util.List;

import com.tim15.ProjektniZadatak.entities.MedicinskaSestra;
import com.tim15.ProjektniZadatak.entities.dtos.MedicinskaSestraDTO;
import com.tim15.ProjektniZadatak.entities.dtos.post.MedicinskaSestraDTOPost;


public interface MedicinskaSestraService {
	
	MedicinskaSestra vratiJednu(Integer medSestraId);

	List<MedicinskaSestra> vratiSve();

	MedicinskaSestra sacuvajJednu(MedicinskaSestra medSestraId);

	void obrisiJednu(Integer id);
	
	MedicinskaSestra vratiJednu(String username);

	List<MedicinskaSestraDTO> vratiSveKaoDTO();

	MedicinskaSestra napraviMSestruOdDTOPosta(MedicinskaSestraDTOPost msDTOPost);
	
}
