package com.xoolibeut.ndeki.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.xoolibeut.ndeki.dao.QuartierRepository;
import com.xoolibeut.ndeki.entities.Quartier;

@Component
public class QuartierServiceImpl implements IQuartierService {
	@Autowired
	private QuartierRepository quartierRepository;

	@Override
	public Quartier addQuartier(Quartier quartier) {
		quartier.setCreationDate(new Date());
		quartier.setModificationDate(quartier.getCreationDate());
		quartierRepository.save(quartier);
		return quartier;
	}

	@Override
	public Quartier updateQuartier(Quartier quartier) {
		quartier.setModificationDate(new Date());
		quartierRepository.save(quartier);
		return quartier;
	}

	@Override
	public void deleteQuartier(Long quartierId) {
		quartierRepository.deleteById(quartierId);

	}

	@Override
	public Page<Quartier> findAll(Pageable pageable) {
		return quartierRepository.findAll(pageable);
	}

	@Override
	public List<Quartier> findAll() {
		return quartierRepository.findAll();
	}

	@Override
	public Quartier getQuartierByNom(String nom) {
		return quartierRepository.getQuartierByNom(nom);
	}

	@Override
	public Quartier getQuartierByAutreNom(String autreNom) {
		return quartierRepository.getQuartierByAutreNom(autreNom);
	}

	@Override
	public List<Quartier> getListQuartierByPartenaireId(Long partenaireId) {

		return quartierRepository.getListQuartierByPartenairePartenaireId(partenaireId);
	}

	@Override
	public List<Quartier> getListQuartierByLivreurId(Long livreurId) {
		return quartierRepository.getListQuartierByLivreurLivreurId(livreurId);
	}

	@Override
	public List<Quartier> getListQuartierByVilleId(Long villeId) {

		return quartierRepository.getListQuartierByVilleVilleId(villeId);
	}

	@Override
	public Quartier getQuartierByQuartierId(Long  quartierId) {
		return quartierRepository.findById(quartierId).get();
	}

}
