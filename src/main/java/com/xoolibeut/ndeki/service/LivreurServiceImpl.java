package com.xoolibeut.ndeki.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.xoolibeut.ndeki.dao.LivreurRepository;
import com.xoolibeut.ndeki.entities.Livreur;

@Component
public class LivreurServiceImpl implements ILivreurService {
	@Autowired
	private LivreurRepository livreurRepository;

	@Override
	public Livreur addLivreur(Livreur livreur) {
		livreur.setCreationDate(new Date());
		livreur.setModificationDate(livreur.getCreationDate());
		livreurRepository.save(livreur);
		return livreur;
	}

	@Override
	public Livreur updateLivreur(Livreur livreur) {
		livreur.setModificationDate(new Date());
		livreurRepository.save(livreur);
		return livreur;
	}

	@Override
	public void deleteLivreur(Long livreurId) {
		livreurRepository.deleteById(livreurId);

	}

	@Override
	public List<Livreur> findAll() {

		return livreurRepository.findAll();
	}

	@Override
	public Page<Livreur> getListLivreurs(Pageable pageable) {
		// TODO Auto-generated method stub
		return livreurRepository.findAll(pageable);
	}

}
