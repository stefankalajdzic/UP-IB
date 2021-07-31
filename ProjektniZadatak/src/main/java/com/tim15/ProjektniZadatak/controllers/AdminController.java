package com.tim15.ProjektniZadatak.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tim15.ProjektniZadatak.entities.Administrator;
import com.tim15.ProjektniZadatak.entities.dtos.AdminDTO;
import com.tim15.ProjektniZadatak.entities.dtos.post.AdminDTOPost;
import com.tim15.ProjektniZadatak.services.AdminService;
import com.tim15.ProjektniZadatak.services.KlinikaService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/admini")
public class AdminController {
	
	@Autowired
	AdminService as;
	
	@Autowired
	KlinikaService ks;
	
	@GetMapping("/svi")
	public ResponseEntity<List<AdminDTO>> vratiSve(){
		List<AdminDTO> aoviDTO = as.vratiSveKaoDTO();
		return new ResponseEntity<>(aoviDTO, HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<AdminDTO> vratiJednog(@PathVariable("id") Integer id) {
		Administrator a = as.vratiJednog(id);
	    if (a == null) {
	    	return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }

	    return new ResponseEntity<>(new AdminDTO(a), HttpStatus.OK);
	    }
	
	@PostMapping(consumes = "application/json")
    public ResponseEntity<AdminDTO> sacuvajJednog(@RequestBody AdminDTOPost aDTOPost) {
		Administrator a = as.napraviAdminaOdDTOPosta(aDTOPost);
		if(a == null) {
            return new ResponseEntity<>(null, HttpStatus.NOT_ACCEPTABLE);
		}
        a = as.sacuvajJednog(a);
        return new ResponseEntity<>(new AdminDTO(a), HttpStatus.CREATED);
    }
	
	
	@PutMapping(value = "/{id}", consumes = "application/json")
	public ResponseEntity<AdminDTO> azurirajJednog(@RequestBody AdminDTO aDTO, @PathVariable("id") Integer id) {
	
	    
	    Administrator a = as.azurirajAdminaOdDTOa(aDTO);
        a = as.sacuvajJednog(a);
        
	    return new ResponseEntity<>(new AdminDTO(a), HttpStatus.OK);
	}
	
	 @DeleteMapping(value = "/{id}")
	 public ResponseEntity<?> obrisiJednog(@PathVariable("id") Integer id) {
		 Administrator a = as.vratiJednog(id);
         if (a != null) {
        	 as.obrisiJednog(id);
             return new ResponseEntity<>(HttpStatus.OK);
        } else {
             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
