package com.xoolibeut.ndeki.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.xoolibeut.ndeki.entities.Partenaire;

public interface IPartenaireService {

	Partenaire addPartenaire(Partenaire partenaire);

	Partenaire updatePartenaire(Partenaire partenaire);

	void deletePartenaire(Long partenaireId);

	List<Partenaire> findAll();

	Page<Partenaire> getListPartenaires(Pageable pageable);

	Partenaire getPartenaireById(Long partenaireId);
	
	Partenaire getPartenaireByNom(String nom);
	Partenaire getPartenaireByIdentifiant(String identifiant);
	Partenaire getPartenaireByNumero(String numero);
}
