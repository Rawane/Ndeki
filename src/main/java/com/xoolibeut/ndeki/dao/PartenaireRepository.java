package com.xoolibeut.ndeki.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.xoolibeut.ndeki.entities.Partenaire;

public interface PartenaireRepository extends CrudRepository<Partenaire, Long> {
	Partenaire getPartenaireByNom(String nom);

	Partenaire getPartenaireByIdentifiant(String identifiant);

	Partenaire getPartenaireByNumero(String numero);

	Page<Partenaire> findAll(Pageable pageable);

	List<Partenaire> findAll();
}
