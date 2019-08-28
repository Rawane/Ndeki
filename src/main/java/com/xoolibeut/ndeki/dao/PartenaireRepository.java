package com.xoolibeut.ndeki.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.xoolibeut.ndeki.entities.Partenaire;

public interface PartenaireRepository extends CrudRepository<Partenaire, Long> {
	Partenaire findByNom(String nom);

	Page<Partenaire> findAll(Pageable pageable);
}
