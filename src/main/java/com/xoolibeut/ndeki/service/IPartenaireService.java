package com.xoolibeut.ndeki.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.xoolibeut.ndeki.entities.Partenaire;

public interface IPartenaireService {

	Partenaire addPartenaire(Partenaire partenaire);

	Partenaire updatePartenaire(Partenaire partenaire);

	void deletePartenaire(Long partenaireId);

	Iterable<Partenaire> findAll();

	Page<Partenaire> getListPartenaires(Pageable pageable);
}
