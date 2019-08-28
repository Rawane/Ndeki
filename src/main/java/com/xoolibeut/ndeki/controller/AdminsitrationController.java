package com.xoolibeut.ndeki.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@GetMapping("/list/partenaire")
	public ResponseEntity<?> findAll() {
		return new ResponseEntity<>(partenaireService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/list/partenaire/{page}/{size}")
	public ResponseEntity<?> findAllPagination(@PathVariable int page, @PathVariable int size) {
		Pageable pageable = PageRequest.of(page - 1, size);
		return new ResponseEntity<>(partenaireService.getListPartenaires(pageable), HttpStatus.OK);
	}

	@PostMapping(path = "/add/partenaire", consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> addPartenaire(@RequestBody PartenaireDTO part) {
		try {
			Partenaire partenaire = new TransformPartenaire().apply(part);
			partenaireService.addPartenaire(partenaire);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Erreur de mise � jour");
		}

	}

	@PostMapping(path = "/update/partenaire", consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> updatePartenaire(@RequestBody PartenaireDTO part) {
		try {
			Partenaire partenaire = new TransformPartenaire().apply(part);
			partenaireService.updatePartenaire(partenaire);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Erreur de mise � jour");
		}
	}

	@DeleteMapping(path = "/delete/partenaire/{partenaireId}")
	public ResponseEntity<?> deletePartenaire(@PathVariable("partenaireId") Long partenaireId) {
		try {
			partenaireService.deletePartenaire(partenaireId);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Erreur de mise � jour");
		}

	}

}
