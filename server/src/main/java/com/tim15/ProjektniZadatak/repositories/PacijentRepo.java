package com.tim15.ProjektniZadatak.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tim15.ProjektniZadatak.entities.Pacijent;


public interface PacijentRepo extends JpaRepository<Pacijent, Integer>{

}
