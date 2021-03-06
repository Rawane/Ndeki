package com.xoolibeut.ndeki.model.transform;

import java.util.function.Function;

import com.xoolibeut.ndeki.entities.Partenaire;
import com.xoolibeut.ndeki.model.PartenaireDTO;

public class TransformPartenaireDTO  implements Function<Partenaire, PartenaireDTO>{

	@Override
	public PartenaireDTO apply(Partenaire partenaire) {
		PartenaireDTO part=new PartenaireDTO();		
		part.setAdresseLigne1(partenaire.getAdresseLigne1());
		part.setAdresseLigne2(partenaire.getAdresseLigne2());
		part.setAdresseLigne3(partenaire.getAdresseLigne3());
		part.setTypeAdresse(partenaire.getTypeAdresse());
		part.setTelephone1(partenaire.getTelephone1());
		part.setTelephone2(partenaire.getTelephone2());
		part.setGpsLatitude(partenaire.getGpsLatitude());
		part.setGpsLongitude(partenaire.getGpsLongitude());
		part.setIdentifiant(partenaire.getIdentifiant());
		part.setInformationAccueil(partenaire.getInformationAccueil());
		part.setInscriptionDate(partenaire.getInscriptionDate());
		part.setNom(partenaire.getNom());
		part.setNumero(partenaire.getNumero());
		part.setPartenaireId(partenaire.getPartenaireId());		
		return part;
	}

}
