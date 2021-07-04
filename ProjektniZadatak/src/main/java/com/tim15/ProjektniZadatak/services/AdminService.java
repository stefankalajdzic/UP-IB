package com.tim15.ProjektniZadatak.services;

import java.util.List;

import com.tim15.ProjektniZadatak.entities.Administrator;
import com.tim15.ProjektniZadatak.entities.dtos.AdminDTO;
import com.tim15.ProjektniZadatak.entities.dtos.post.AdminDTOPost;

public interface AdminService {
	
	Administrator vratiJednog(String korisnickoIme);
	
	Administrator vratiJednog(Integer adminId);

	List<Administrator> vratiSve();

	Administrator sacuvajJednog(Administrator adminId);

	void obrisiJednog(Integer id);

	Administrator napraviAdminaOdDTOPosta(AdminDTOPost adminDTO);

	List<AdminDTO> vratiSveKaoDTO();
	

}
