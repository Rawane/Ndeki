package com.xoolibeut.ndeki.model.transform;

import java.util.function.Function;

import com.xoolibeut.ndeki.entities.Ville;
import com.xoolibeut.ndeki.model.VilleDTO;

public class TransformVilleDTO implements Function<Ville, VilleDTO> {

	@Override
	public VilleDTO apply(Ville ville) {
		VilleDTO villeDTO = new VilleDTO();
		villeDTO.setCode(ville.getCode());
		villeDTO.setVilleId(ville.getVilleId());
		villeDTO.setNom(ville.getNom());
		return villeDTO;
	}

}
