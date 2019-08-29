package com.xoolibeut.ndeki.model.transform;

import java.util.function.Function;

import com.xoolibeut.ndeki.entities.Livreur;
import com.xoolibeut.ndeki.model.LivreurDTO;

public class TransformLivreurDTO implements Function<Livreur, LivreurDTO> {

	@Override
	public LivreurDTO apply(Livreur livreur) {
		var livreurDTO = new LivreurDTO();
		livreurDTO.setAdresseLigne1(livreur.getAdresseLigne1());
		livreurDTO.setAdresseLigne2(livreur.getAdresseLigne2());
		livreurDTO.setAdresseLigne3(livreur.getAdresseLigne3());
		livreurDTO.setTypeAdresse(livreur.getTypeAdresse());
		livreurDTO.setTelephone1(livreur.getTelephone1());
		livreurDTO.setTelephone2(livreur.getTelephone2());
		livreurDTO.setGpsLatitude(livreur.getGpsLatitude());
		livreurDTO.setGpsLongitude(livreur.getGpsLongitude());
		livreurDTO.setIdentifiant(livreur.getIdentifiant());
		livreurDTO.setNom(livreur.getNom());
		livreurDTO.setPrenom(livreur.getPrenom());
		livreurDTO.setMatricule(livreur.getMatricule());
		livreurDTO.setPassword(livreur.getPassword());
		livreurDTO.setLivreurId(livreur.getLivreurId());
		return livreurDTO;
	}

}
