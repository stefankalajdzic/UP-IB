package com.tim15.ProjektniZadatak.services;

import java.util.List;

import com.tim15.ProjektniZadatak.entities.Pacijent;
import com.tim15.ProjektniZadatak.entities.dtos.PacijentDTO;
import com.tim15.ProjektniZadatak.entities.dtos.post.PacijentDTOPost;

public interface PacijentService {
	
	Pacijent vratiJednog(Integer pacijentId);

	List<Pacijent> vratiSve();

	Pacijent sacuvajJednog(Pacijent pacijentId);

	void obrisiJednog(Integer id);

	Pacijent vratiJednog(String username);

	List<PacijentDTO> vratiSveKaoDTO();

	Pacijent napraviPacijentaOdDTOPosta(PacijentDTOPost pDTOPost);
	


}
