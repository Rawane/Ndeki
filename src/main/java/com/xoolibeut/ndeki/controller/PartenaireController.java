package com.xoolibeut.ndeki.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoolibeut.ndeki.dao.PartenaireRepository;
import com.xoolibeut.ndeki.entities.Partenaire;

@RestController( )
@RequestMapping("/partenaire/{version}")
public class PartenaireController {
	@Autowired
	private PartenaireRepository partenaireRepository;

	@GetMapping("/list")
	Iterable<Partenaire> findAll() {
		return partenaireRepository.findAll();
	}
}
