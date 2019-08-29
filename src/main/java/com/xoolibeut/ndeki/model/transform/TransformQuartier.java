package com.xoolibeut.ndeki.model.transform;

import java.util.function.Function;

import com.xoolibeut.ndeki.entities.Quartier;
import com.xoolibeut.ndeki.model.QuartierDTO;


public class TransformQuartier implements Function<QuartierDTO, Quartier> {

	@Override
	public Quartier apply(QuartierDTO quartierDTO) {
		Quartier quartier = new Quartier();
		quartier.setDescription(quartierDTO.getDescription());
		quartier.setAutreNom(quartierDTO.getAutreNom());
		quartier.setNom(quartierDTO.getNom());		
		return quartier;
	}

}
