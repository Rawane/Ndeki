package com.xoolibeut.ndeki.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.xoolibeut.ndeki.entities.Gestionnaire;

public interface IGestionnaireService {
	
	Gestionnaire addGestionnaire(Gestionnaire gestionnaire);

	Gestionnaire updateGestionnaire(Gestionnaire gestionnaire);

	void deleteGestionnaire(Long gestionnaireId);

	List<Gestionnaire> findAll();

	Page<Gestionnaire> getListGestionnaires(Pageable pageable);

	Gestionnaire getGestionnaireById(Long gestionnaireId);
}
