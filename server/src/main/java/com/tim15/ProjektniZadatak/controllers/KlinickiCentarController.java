package com.tim15.ProjektniZadatak.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tim15.ProjektniZadatak.entities.KlinickiCentar;
import com.tim15.ProjektniZadatak.entities.dtos.KlinickiCentarDTO;
import com.tim15.ProjektniZadatak.entities.dtos.post.KlinickiCentarDTOPost;
import com.tim15.ProjektniZadatak.services.KlinickiCentarService;

@RestController
@RequestMapping("/klinickicentri")
public class KlinickiCentarController {

	@Autowired
	KlinickiCentarService kcs;
	
	@PreAuthorize("hasRole('PACIJENT')")
	@GetMapping("/svi")
	public ResponseEntity<List<KlinickiCentarDTO>> vratiSve(){
		List<KlinickiCentarDTO> kcoviDTO = kcs.vratiSveKaoDTO();
		
		return new ResponseEntity<>(kcoviDTO, HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<KlinickiCentarDTO> vratiJednog(@PathVariable("id") Integer id) {
		KlinickiCentar kc = kcs.vratiJedan(id);
	    if (kc == null) {
	    	return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }

	        return new ResponseEntity<>(new KlinickiCentarDTO(kc), HttpStatus.OK);
	    }
	
	
	
	@PreAuthorize("hasRole('ADMIN')")   
	@PostMapping(consumes = "application/json")
    public ResponseEntity<KlinickiCentarDTO> sacuvajJedan(@RequestBody KlinickiCentarDTOPost kcDTOPost) {
		KlinickiCentar kc = kcs.napraviKCodDTOPosta(kcDTOPost);

        kc = kcs.sacuvajJedan(kc);
        return new ResponseEntity<>(new KlinickiCentarDTO(kc), HttpStatus.CREATED);
    }
	
	
	@PutMapping(value = "/{id}", consumes = "application/json")
	public ResponseEntity<KlinickiCentarDTO> azurirajJedan(@RequestBody KlinickiCentarDTOPost kcDTO, @PathVariable("id") Integer id) {
		// A product must exist
		KlinickiCentar kc = kcs.vratiJedan(id);
		
	    if (kc == null) {
	        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	    }
	
	    kc.setIme(kcDTO.getIme());
	    kc.setAdresa(kcDTO.getAdresa());
	    
	    kc = kcs.sacuvajJedan(kc);
	
	    return new ResponseEntity<>(new KlinickiCentarDTO(kc), HttpStatus.OK);
	}
	
	 @DeleteMapping(value = "/{id}")
	 public ResponseEntity<?> obrisiJedan(@PathVariable("id") Integer id) {
		 KlinickiCentar kc = kcs.vratiJedan(id);
         if (kc != null) {
        	 kcs.obrisiJedan(id);
             return new ResponseEntity<>(HttpStatus.OK);
        } else {
             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
	
}
