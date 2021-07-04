package com.tim15.ProjektniZadatak.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tim15.ProjektniZadatak.entities.Klinika;

@Repository
public interface KlinikaRepo extends JpaRepository<Klinika, Integer>{

}
