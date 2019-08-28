package com.xoolibeut.ndeki.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.xoolibeut.ndeki.entities.Partenaire;
import com.xoolibeut.ndeki.model.PartenaireDTO;
import com.xoolibeut.ndeki.model.transform.TransformPartenaire;
import com.xoolibeut.ndeki.service.IPartenaireService;

@RestController()
@RequestMapping("/administration/{version}")
public class AdminsitrationController {
	@Autowired
	private IPartenaireService partenaireService;

	@GetMapping("/list")
	Iterable<Partenaire> findAll() {
		return partenaireService.findAll();
	}

	@PostMapping(path = "/add/partenaire", consumes = "application/json", produces = "application/json")
	public void addPartenaire(@RequestBody PartenaireDTO part) {
		try {
			var partenaire = new TransformPartenaire().apply(part);
			partenaireService.addPartenaire(partenaire);
		} catch (Exception e) {
			 throw new ResponseStatusException(
			           HttpStatus.NOT_FOUND, "Erreur de mise à jour");
		}

	}
}
