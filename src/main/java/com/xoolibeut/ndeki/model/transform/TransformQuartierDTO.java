package com.xoolibeut.ndeki.model.transform;

import java.util.function.Function;

import com.xoolibeut.ndeki.entities.Quartier;
import com.xoolibeut.ndeki.model.QuartierDTO;


public class TransformQuartierDTO implements Function<Quartier, QuartierDTO> {

	@Override
	public QuartierDTO apply(Quartier quartier) {
		QuartierDTO quartierDTO = new QuartierDTO();
		quartierDTO.setDescription(quartier.getDescription());
		quartierDTO.setAutreNom(quartier.getAutreNom());
		quartierDTO.setNom(quartier.getNom());		
		return quartierDTO;
	}

}
