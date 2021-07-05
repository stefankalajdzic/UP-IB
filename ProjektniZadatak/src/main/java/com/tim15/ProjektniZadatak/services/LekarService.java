package com.tim15.ProjektniZadatak.services;

import java.util.List;

import com.tim15.ProjektniZadatak.entities.Lekar;
import com.tim15.ProjektniZadatak.entities.dtos.LekarDTO;
import com.tim15.ProjektniZadatak.entities.dtos.post.LekarDTOPost;


public interface LekarService {

	Lekar vratiJednog(Integer lekarId);

	List<Lekar> vratiSve();

	Lekar sacuvajJednog(Lekar lekarId);

	void obrisiJednog(Integer id);

	Lekar vratiJednog(String username);

	List<LekarDTO> vratiSveKaoDTO();

	Lekar napraviLekaraOdDTOPost(LekarDTOPost lDTOPost);
	
}
