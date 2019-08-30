package com.xoolibeut.ndeki.model.transform;

import java.util.function.Function;

import com.xoolibeut.ndeki.entities.Ville;
import com.xoolibeut.ndeki.model.VilleDTO;

public class TransformVille implements Function<VilleDTO, Ville> {

	@Override
	public Ville apply(VilleDTO villeDTO) {
		Ville ville = new Ville();
		ville.setCode(villeDTO.getCode());
		if (villeDTO.getVilleId() != null) {
			ville.setVilleId(villeDTO.getVilleId());
		}
		ville.setNom(villeDTO.getNom());
		return ville;
	}

}
