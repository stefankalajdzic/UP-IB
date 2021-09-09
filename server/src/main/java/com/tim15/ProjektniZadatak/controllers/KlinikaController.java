package com.tim15.ProjektniZadatak.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tim15.ProjektniZadatak.entities.Klinika;
import com.tim15.ProjektniZadatak.entities.dtos.KlinikaDTO;
import com.tim15.ProjektniZadatak.entities.dtos.post.KlinikaDTOPost;
import com.tim15.ProjektniZadatak.services.KlinickiCentarService;
import com.tim15.ProjektniZadatak.services.KlinikaService;

@RestController
@RequestMapping("/klinike")
public class KlinikaController {
	
	@Autowired
	KlinikaService ks;
	
	@Autowired
	KlinickiCentarService kcs;
	
	@GetMapping("/svi")
	public ResponseEntity<List<KlinikaDTO>> vratiSve(){
		List<KlinikaDTO> koviDTO = ks.vratiSveKaoDTO();
		return new ResponseEntity<>(koviDTO, HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<KlinikaDTO> vratiJednu(@PathVariable("id") Integer id) {
		Klinika k = ks.vratiJednu(id);
	    if (k == null) {
	    	return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }

	        return new ResponseEntity<>(new KlinikaDTO(k), HttpStatus.OK);
	    }
	
	@PostMapping(consumes = "application/json")
    public ResponseEntity<KlinikaDTO> sacuvajJednu(@RequestBody KlinikaDTOPost kDTOPost) {
		Klinika k = ks.napraviKlinikuOdDTOPosta(kDTOPost);
        
        k = ks.sacuvajJednu(k);
        return new ResponseEntity<>(new KlinikaDTO(k), HttpStatus.CREATED);
    }
	
	
	@PutMapping(value = "/{id}", consumes = "application/json")
	public ResponseEntity<KlinikaDTO> azurirajJednu(@RequestBody KlinikaDTO kDTO, @PathVariable("id") Integer id) {
		// A product must exist
		Klinika k = ks.vratiJednu(id);
		
	    if (k == null) {
	        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	    }
	
	    k.setNaziv(kDTO.getNaziv());
        k.setAdresa(k.getAdresa());
        k.setOpis(kDTO.getOpis());
        k.setKlinickiCentarKomPripada(kcs.vratiJedan(kDTO.getKcDTO().getId()));
        
        k = ks.sacuvajJednu(k);
        
	    return new ResponseEntity<>(new KlinikaDTO(k), HttpStatus.OK);
	}
	
	 @DeleteMapping(value = "/{id}")
	 public ResponseEntity<?> obrisiJedan(@PathVariable("id") Integer id) {
		 Klinika k = ks.vratiJednu(id);
         if (k != null) {
        	 ks.obrisiJednu(id);
             return new ResponseEntity<>(HttpStatus.OK);
        } else {
             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
	
	
}
