package com.xoolibeut.ndeki.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.xoolibeut.ndeki.dao.VilleRepository;
import com.xoolibeut.ndeki.entities.Ville;

@Component
public class VilleServiceImpl implements IVilleService {
	@Autowired
	private VilleRepository villeRepository;

	@Override
	public Ville addVille(Ville ville) {
		ville.setCreationDate(new Date());
		ville.setModificationDate(ville.getCreationDate());
		villeRepository.save(ville);
		return ville;
	}

	@Override
	public Ville updateVille(Ville ville) {
		ville.setModificationDate(new Date());
		villeRepository.save(ville);
		return ville;
	}

	@Override
	public void deleteVille(Long villeId) {
		villeRepository.deleteById(villeId);

	}

	@Override
	public Page<Ville> findAll(Pageable pageable) {
		return villeRepository.findAll(pageable);
	}

	@Override
	public List<Ville> findAll() {
		return villeRepository.findAll();
	}

	@Override
	public Ville getVilleByNom(String nom) {

		return villeRepository.getVilleByNom(nom);
	}

	@Override
	public Ville getVilleByCode(String code) {
		return villeRepository.getVilleByCode(code);
	}

}
