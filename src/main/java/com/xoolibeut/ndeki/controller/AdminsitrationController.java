package com.xoolibeut.ndeki.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.support.PageableExecutionUtils;
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

import com.xoolibeut.ndeki.entities.Agent;
import com.xoolibeut.ndeki.entities.Livreur;
import com.xoolibeut.ndeki.entities.Partenaire;
import com.xoolibeut.ndeki.entities.Quartier;
import com.xoolibeut.ndeki.entities.Ville;
import com.xoolibeut.ndeki.model.AgentDTO;
import com.xoolibeut.ndeki.model.LivreurDTO;
import com.xoolibeut.ndeki.model.PartenaireDTO;
import com.xoolibeut.ndeki.model.QuartierDTO;
import com.xoolibeut.ndeki.model.VilleDTO;
import com.xoolibeut.ndeki.model.transform.TransformAgent;
import com.xoolibeut.ndeki.model.transform.TransformAgentDTO;
import com.xoolibeut.ndeki.model.transform.TransformLivreur;
import com.xoolibeut.ndeki.model.transform.TransformLivreurDTO;
import com.xoolibeut.ndeki.model.transform.TransformPartenaire;
import com.xoolibeut.ndeki.model.transform.TransformPartenaireDTO;
import com.xoolibeut.ndeki.model.transform.TransformQuartier;
import com.xoolibeut.ndeki.model.transform.TransformQuartierDTO;
import com.xoolibeut.ndeki.model.transform.TransformVille;
import com.xoolibeut.ndeki.model.transform.TransformVilleDTO;
import com.xoolibeut.ndeki.service.IAgentService;
import com.xoolibeut.ndeki.service.ILivreurService;
import com.xoolibeut.ndeki.service.IPartenaireService;
import com.xoolibeut.ndeki.service.IQuartierService;
import com.xoolibeut.ndeki.service.IVilleService;

@RestController()
@RequestMapping("/administration/{version}")
public class AdminsitrationController {
	@Autowired
	private IPartenaireService partenaireService;
	@Autowired
	private IAgentService agentService;
	@Autowired
	private ILivreurService livreurService;
	@Autowired
	private IQuartierService quartierService;
	@Autowired
	private IVilleService villeService;

	// START GESTION PARTENAIRE
	@GetMapping("/partenaire/id/{partenaireId}")
	public ResponseEntity<?> getPartenaireById(@PathVariable Long partenaireId) {
		Partenaire partenaire = partenaireService.getPartenaireById(partenaireId);
		PartenaireDTO partenaireDTO = new TransformPartenaireDTO().apply(partenaire);
		return new ResponseEntity<>(partenaireDTO, HttpStatus.OK);
	}

	@GetMapping("/partenaire/identifiant/{identifiant}")
	public ResponseEntity<?> getPartenaireByIdentifiant(@PathVariable String identifiant) {
		Partenaire partenaire = partenaireService.getPartenaireByIdentifiant(identifiant);
		PartenaireDTO partenaireDTO = new TransformPartenaireDTO().apply(partenaire);
		return new ResponseEntity<>(partenaireDTO, HttpStatus.OK);
	}

	@GetMapping("/partenaire/numero/{numero}")
	public ResponseEntity<?> getPartenaireByNumero(@PathVariable String numero) {
		Partenaire partenaire = partenaireService.getPartenaireByNumero(numero);
		PartenaireDTO partenaireDTO = new TransformPartenaireDTO().apply(partenaire);
		return new ResponseEntity<>(partenaireDTO, HttpStatus.OK);
	}

	@GetMapping("/partenaire/nom/{nom}")
	public ResponseEntity<?> getPartenaireByNom(@PathVariable String nom) {
		Partenaire partenaire = partenaireService.getPartenaireByNom(nom);
		PartenaireDTO partenaireDTO = new TransformPartenaireDTO().apply(partenaire);
		return new ResponseEntity<>(partenaireDTO, HttpStatus.OK);
	}

	@GetMapping("/partenaire/list")
	public ResponseEntity<?> findAllPartenaire() {
		List<Partenaire> partenaires = partenaireService.findAll();
		List<PartenaireDTO> partenaireDTOs = partenaires.stream()
				.map(partenaire -> new TransformPartenaireDTO().apply(partenaire)).collect(Collectors.toList());
		return new ResponseEntity<>(partenaireDTOs, HttpStatus.OK);
	}

	@GetMapping("/partenaire/list/{page}/{size}")
	public ResponseEntity<?> findAllPartenairePagination(@PathVariable int page, @PathVariable int size) {
		Pageable pageable = PageRequest.of(page - 1, size);
		Page<Partenaire> partPage = partenaireService.getListPartenaires(pageable);
		List<PartenaireDTO> partenaireDTOs = partPage.getContent().stream()
				.map(partenaire -> new TransformPartenaireDTO().apply(partenaire)).collect(Collectors.toList());
		Page<PartenaireDTO> partenaireDTOPage = PageableExecutionUtils.getPage(partenaireDTOs, pageable,
				partPage::getTotalElements);
		return new ResponseEntity<>(partenaireDTOPage, HttpStatus.OK);
	}

	@PostMapping(path = "/partenaire/add", consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> addPartenaire(@RequestBody PartenaireDTO part) {
		try {
			Partenaire partenaire = new TransformPartenaire().apply(part);
			partenaireService.addPartenaire(partenaire);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Erreur de mise à jour");
		}

	}

	@PostMapping(path = "/partenaire/update", consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> updatePartenaire(@RequestBody PartenaireDTO part) {
		try {
			Partenaire partenaire = new TransformPartenaire().apply(part);
			partenaireService.updatePartenaire(partenaire);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Erreur de mise à jour");
		}
	}

	@DeleteMapping(path = "/partenaire/delete/{partenaireId}")
	public ResponseEntity<?> deletePartenaire(@PathVariable("partenaireId") Long partenaireId) {
		try {
			partenaireService.deletePartenaire(partenaireId);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Erreur de mise à jour");
		}
	}
	// END GESTION PARTENAIRE

	// START GESTION AGENT
	@GetMapping("/agent/list")
	public ResponseEntity<?> findAllAgent() {
		List<Agent> agents = agentService.findAll();
		List<AgentDTO> agentDTOs = agents.stream().map(agent -> new TransformAgentDTO().apply(agent))
				.collect(Collectors.toList());
		return new ResponseEntity<>(agentDTOs, HttpStatus.OK);
	}

	@GetMapping("/agent/list/{page}/{size}")
	public ResponseEntity<?> findAllAgentPagination(@PathVariable int page, @PathVariable int size) {
		Pageable pageable = PageRequest.of(page - 1, size);
		Page<Agent> agentPage = agentService.getListAgents(pageable);
		List<AgentDTO> agentDTOs = agentPage.getContent().stream().map(agent -> new TransformAgentDTO().apply(agent))
				.collect(Collectors.toList());
		Page<AgentDTO> agentDTOPage = PageableExecutionUtils.getPage(agentDTOs, pageable, agentPage::getTotalElements);
		return new ResponseEntity<>(agentDTOPage, HttpStatus.OK);
	}

	@PostMapping(path = "/agent/add", consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> addAgent(@RequestBody AgentDTO agentDTO) {
		try {
			Agent agent = new TransformAgent().apply(agentDTO);
			agentService.addAgent(agent);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Erreur de mise à jour");
		}

	}

	@PostMapping(path = "/agent/update", consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> updateAgent(@RequestBody AgentDTO agentDTO) {
		try {
			Agent agent = new TransformAgent().apply(agentDTO);
			agentService.updateAgent(agent);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Erreur de mise à jour");
		}
	}

	@DeleteMapping(path = "/agent/delete/{agentId}")
	public ResponseEntity<?> deleteAgent(@PathVariable("agentId") Long agentId) {
		try {
			agentService.deleteAgent(agentId);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Erreur de mise à jour");
		}
	}
	// END GESTION AGENT

	// START GESTION LIVREUR
	@GetMapping("/livreur/list")
	public ResponseEntity<?> findAllLivreur() {
		List<Livreur> livreurs = livreurService.findAll();
		List<LivreurDTO> livreursDTO = livreurs.stream().map(livreur -> new TransformLivreurDTO().apply(livreur))
				.collect(Collectors.toList());
		return new ResponseEntity<>(livreursDTO, HttpStatus.OK);
	}

	@GetMapping("/livreur/list/{page}/{size}")
	public ResponseEntity<?> findAllLivreurPagination(@PathVariable int page, @PathVariable int size) {
		Pageable pageable = PageRequest.of(page - 1, size);
		Page<Livreur> livreurPage = livreurService.getListLivreurs(pageable);
		List<LivreurDTO> livreurDTOs = livreurPage.getContent().stream()
				.map(livreur -> new TransformLivreurDTO().apply(livreur)).collect(Collectors.toList());
		Page<LivreurDTO> livreurDTOPage = PageableExecutionUtils.getPage(livreurDTOs, pageable,
				livreurPage::getTotalElements);
		return new ResponseEntity<>(livreurDTOPage, HttpStatus.OK);
	}

	@PostMapping(path = "/livreur/add", consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> addLivreur(@RequestBody LivreurDTO livreurDTO) {
		try {
			Livreur livreur = new TransformLivreur().apply(livreurDTO);
			livreurService.addLivreur(livreur);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Erreur de mise à jour");
		}

	}

	@PostMapping(path = "/livreur/update", consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> updateLivreur(@RequestBody LivreurDTO livreurDTO) {
		try {
			Livreur livreur = new TransformLivreur().apply(livreurDTO);
			livreurService.updateLivreur(livreur);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Erreur de mise à jour");
		}
	}

	@DeleteMapping(path = "/livreur/delete/{livreurId}")
	public ResponseEntity<?> deleteLivreur(@PathVariable("livreurId") Long livreurId) {
		try {
			livreurService.deleteLivreur(livreurId);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Erreur de mise à jour");
		}
	}
	// END GESTION LIVREUR

	// START GESTION VILLE
	@GetMapping("/ville/list")
	public ResponseEntity<?> findAllVille() {
		List<Ville> villes = villeService.findAll();
		List<VilleDTO> villeDTOs = villes.stream().map(ville -> new TransformVilleDTO().apply(ville))
				.collect(Collectors.toList());
		return new ResponseEntity<>(villeDTOs, HttpStatus.OK);
	}

	@GetMapping("/ville/list/{page}/{size}")
	public ResponseEntity<?> findAllVillePagination(@PathVariable int page, @PathVariable int size) {
		Pageable pageable = PageRequest.of(page - 1, size);
		Page<Ville> villePage = villeService.findAll(pageable);
		List<VilleDTO> villeDTOs = villePage.getContent().stream().map(ville -> new TransformVilleDTO().apply(ville))
				.collect(Collectors.toList());
		Page<VilleDTO> villeDTOPage = PageableExecutionUtils.getPage(villeDTOs, pageable, villePage::getTotalElements);
		return new ResponseEntity<>(villeDTOPage, HttpStatus.OK);
	}

	@PostMapping(path = "/ville/add", consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> addVille(@RequestBody VilleDTO villeDTO) {
		try {
			Ville ville = new TransformVille().apply(villeDTO);
			villeService.addVille(ville);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Erreur de mise à jour");
		}

	}

	@PostMapping(path = "/ville/update", consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> updateVille(@RequestBody VilleDTO villeDTO) {
		try {
			Ville ville = new TransformVille().apply(villeDTO);
			villeService.updateVille(ville);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Erreur de mise à jour");
		}
	}

	@DeleteMapping(path = "/ville/delete/{villeId}")
	public ResponseEntity<?> deleteVille(@PathVariable("villeId") Long villeId) {
		try {
			villeService.deleteVille(villeId);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Erreur de mise à jour");
		}
	}
	// END GESTION VILLE
	// START GESTION QUARTIER
		@GetMapping("/quartier/list")
		public ResponseEntity<?> findAllQuartier() {
			List<Quartier> quartiers = quartierService.findAll();
			List<QuartierDTO> quartierDTOs = quartiers.stream().map(quartier -> new TransformQuartierDTO().apply(quartier))
					.collect(Collectors.toList());
			return new ResponseEntity<>(quartierDTOs, HttpStatus.OK);
		}

		@GetMapping("/quartier/list/{page}/{size}")
		public ResponseEntity<?> findAllQuartierPagination(@PathVariable int page, @PathVariable int size) {
			Pageable pageable = PageRequest.of(page - 1, size);
			Page<Quartier> quartierPage = quartierService.findAll(pageable);
			List<QuartierDTO> quartierDTOs = quartierPage.getContent().stream().map(quartier -> new TransformQuartierDTO().apply(quartier))
					.collect(Collectors.toList());
			Page<QuartierDTO> quartierDTOPage = PageableExecutionUtils.getPage(quartierDTOs, pageable, quartierPage::getTotalElements);
			return new ResponseEntity<>(quartierDTOPage, HttpStatus.OK);
		}

		@PostMapping(path = "/quartier/add", consumes = "application/json", produces = "application/json")
		public ResponseEntity<?> addQuartier(@RequestBody QuartierDTO quartierDTO) {
			try {
				Quartier quartier = new TransformQuartier().apply(quartierDTO);
				quartierService.addQuartier(quartier);
				return new ResponseEntity<>(HttpStatus.CREATED);
			} catch (Exception e) {
				throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Erreur de mise à jour");
			}

		}

		@PostMapping(path = "/quartier/update", consumes = "application/json", produces = "application/json")
		public ResponseEntity<?> updateQuartier(@RequestBody QuartierDTO quartierDTO) {
			try {
				Quartier quartier = new TransformQuartier().apply(quartierDTO);
				quartierService.updateQuartier(quartier);
				return new ResponseEntity<>(HttpStatus.OK);
			} catch (Exception e) {
				throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Erreur de mise à jour");
			}
		}

		@DeleteMapping(path = "/quartier/delete/{quartierId}")
		public ResponseEntity<?> deleteQuartier(@PathVariable("quartierId") Long quartierId) {
			try {
				quartierService.deleteQuartier(quartierId);
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			} catch (Exception e) {
				throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Erreur de mise à jour");
			}
		}
		// END GESTION QUARTIER
}
