package com.xoolibeut.ndeki.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.xoolibeut.ndeki.entities.Quartier;

public interface IQuartierService {

	Quartier addQuartier(Quartier quartier);

	Quartier updateQuartier(Quartier quartier);

	void deleteQuartier(Long quartierId);

	Page<Quartier> findAll(Pageable pageable);

	List<Quartier> findAll();

	Quartier getQuartierByQuartierId(Long nom);

	Quartier getQuartierByNom(String nom);

	Quartier getQuartierByAutreNom(String autreNom);

	List<Quartier> getListQuartierByVilleId(Long quartierId);

	List<Quartier> getListQuartierByPartenaireId(Long partenaireId);

	List<Quartier> getListQuartierByLivreurId(Long livreurId);

}
