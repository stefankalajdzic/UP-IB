package com.tim15.ProjektniZadatak.services.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tim15.ProjektniZadatak.entities.KlinickiCentar;
import com.tim15.ProjektniZadatak.entities.dtos.KlinickiCentarDTO;
import com.tim15.ProjektniZadatak.entities.dtos.post.KlinickiCentarDTOPost;
import com.tim15.ProjektniZadatak.repositories.KlinickiCentarRepo;
import com.tim15.ProjektniZadatak.services.KlinickiCentarService;

@Service
public class KlinickiCentarServiceImplementation implements KlinickiCentarService{

	@Autowired
	KlinickiCentarRepo kcr;
	
	@Override
	public KlinickiCentar vratiJedan(Integer kcId) {
		return kcr.findById(kcId).orElse(null);
	}

	@Override
	public List<KlinickiCentar> vratiSve() {
		return kcr.findAll();
	}

	@Override
	public KlinickiCentar sacuvajJedan(KlinickiCentar kc) {
		return kcr.save(kc);
	}

	@Override
	public void obrisiJedan(Integer kcId) {
		kcr.deleteById(kcId);
	}

	@Override
	public List<KlinickiCentarDTO> vratiSveKaoDTO() {
		List<KlinickiCentarDTO> kcoviDTO = new ArrayList<KlinickiCentarDTO>();
		for (KlinickiCentar kc : kcr.findAll()) {
			kcoviDTO.add(new KlinickiCentarDTO(kc));

		}return kcoviDTO;
	}

	@Override
	public KlinickiCentar napraviKCodDTOPosta(KlinickiCentarDTOPost kcDTOPost) {
		KlinickiCentar kc = new KlinickiCentar();
		kc.setAdresa(kcDTOPost.getAdresa());
		kc.setIme(kcDTOPost.getIme());
		
		return kc;
	}

}
