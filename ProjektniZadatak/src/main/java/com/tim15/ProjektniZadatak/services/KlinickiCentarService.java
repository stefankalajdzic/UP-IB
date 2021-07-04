package com.tim15.ProjektniZadatak.services;

import java.util.List;

import com.tim15.ProjektniZadatak.entities.KlinickiCentar;
import com.tim15.ProjektniZadatak.entities.dtos.KlinickiCentarDTO;
import com.tim15.ProjektniZadatak.entities.dtos.post.KlinickiCentarDTOPost;

public interface KlinickiCentarService {

	 KlinickiCentar vratiJedan(Integer kcId);

	 List<KlinickiCentar> vratiSve();

	 KlinickiCentar sacuvajJedan(KlinickiCentar kc);

	 void obrisiJedan(Integer kcId);

	List<KlinickiCentarDTO> vratiSveKaoDTO();

	KlinickiCentar napraviKCodDTOPosta(KlinickiCentarDTOPost kcDTOPost);
	
}
