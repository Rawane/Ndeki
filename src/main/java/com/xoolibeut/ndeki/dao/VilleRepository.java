package com.xoolibeut.ndeki.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.xoolibeut.ndeki.entities.Ville;

public interface VilleRepository extends CrudRepository<Ville, Long> {
	
	Page<Ville> findAll(Pageable pageable);

	List<Ville> findAll();	

	Ville getVilleByNom(String nom);

	Ville getVilleByCode(String code);
}
