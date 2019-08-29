package com.xoolibeut.ndeki.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.xoolibeut.ndeki.entities.Quartier;

public interface QuartierRepository extends CrudRepository<Quartier, Long> {
	
	Page<Quartier> findAll(Pageable pageable);

	List<Quartier> findAll();	

	Quartier getQuartierByNom(String nom);

	Quartier getQuartierByAutreNom(String autreNom);
	
	//List<Quartier> getListQuartierByVilleVilleId();	
	
	//List<Quartier> getListQuartierByPartenairePartenaireId();	
	
	//List<Quartier> getListQuartierByLivreurLivreurId();	
}
