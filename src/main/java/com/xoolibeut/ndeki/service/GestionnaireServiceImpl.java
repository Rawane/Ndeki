package com.xoolibeut.ndeki.service;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.xoolibeut.ndeki.dao.GestionnaireRepository;
import com.xoolibeut.ndeki.entities.Gestionnaire;

@Component
public class GestionnaireServiceImpl implements IGestionnaireService {
	private GestionnaireRepository gestionnaireRepository;

	@Override
	public Gestionnaire addGestionnaire(Gestionnaire gestionnaire) {
		gestionnaire.setCreationDate(new Date());
		gestionnaire.setModificationDate(gestionnaire.getModificationDate());
		gestionnaireRepository.save(gestionnaire);
		return gestionnaire;
	}

	@Override
	public Gestionnaire updateGestionnaire(Gestionnaire gestionnaire) {
		gestionnaire.setCreationDate(new Date());
		gestionnaireRepository.save(gestionnaire);
		return gestionnaire;
	}

	@Override
	public void deleteGestionnaire(Long gestionnaireId) {
		gestionnaireRepository.deleteById(gestionnaireId);

	}

	@Override
	public List<Gestionnaire> findAll() {
		return gestionnaireRepository.findAll();
	}

	@Override
	public Page<Gestionnaire> getListGestionnaires(Pageable pageable) {

		return gestionnaireRepository.findAll(pageable);
	}

	@Override
	public Gestionnaire getGestionnaireById(Long gestionnaireId) {

		return gestionnaireRepository.getOne(gestionnaireId);
	}

}
