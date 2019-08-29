package com.xoolibeut.ndeki.model.transform;

import java.util.function.Function;

import com.xoolibeut.ndeki.entities.Livreur;
import com.xoolibeut.ndeki.model.LivreurDTO;

public class TransformLivreur implements Function<LivreurDTO, Livreur> {

	@Override
	public Livreur apply(LivreurDTO livreurDTO) {
		var livreur = new Livreur();
		livreur.setAdresseLigne1(livreurDTO.getAdresseLigne1());
		livreur.setAdresseLigne2(livreurDTO.getAdresseLigne2());
		livreur.setAdresseLigne3(livreurDTO.getAdresseLigne3());
		livreur.setTypeAdresse(livreurDTO.getTypeAdresse());
		livreur.setTelephone1(livreurDTO.getTelephone1());
		livreur.setTelephone2(livreurDTO.getTelephone2());
		livreur.setGpsLatitude(livreurDTO.getGpsLatitude());
		livreur.setGpsLongitude(livreurDTO.getGpsLongitude());
		livreur.setIdentifiant(livreurDTO.getIdentifiant());
		livreur.setNom(livreur.getNom());
		livreur.setPrenom(livreurDTO.getPrenom());
		livreur.setMatricule(livreurDTO.getMatricule());
		livreur.setPassword(livreurDTO.getPassword());
		return livreur;
	}

}
