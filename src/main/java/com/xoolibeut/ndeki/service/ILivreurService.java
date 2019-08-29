package com.xoolibeut.ndeki.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.xoolibeut.ndeki.entities.Livreur;

public interface ILivreurService {

	Livreur addLivreur(Livreur livreur);

	Livreur updateLivreur(Livreur livreur);

	void deleteLivreur(Long livreurId);

	List<Livreur> findAll();

	Page<Livreur> getListLivreurs(Pageable pageable);
}
