package com.xoolibeut.ndeki.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.xoolibeut.ndeki.entities.Quartier;

public interface IQuartierService {
	
	Page<Quartier> findAll(Pageable pageable);

	List<Quartier> findAll();

	Quartier getQuartierByNom(String nom);

	Quartier getQuartierByAutreNom(String autreNom);

	List<Quartier> getListQuartierByVilleId(Long villeId);

	List<Quartier> getListQuartierByPartenaireId(Long partenaireId);

	List<Quartier> getListQuartierByLivreurId(Long livreurId);
}
