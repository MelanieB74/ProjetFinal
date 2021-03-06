package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Activite;
import com.service.ActiviteServiceImpl;
import com.service.IActiviteService;

@RestController
@CrossOrigin
@RequestMapping("/activite")
public class ActiviteController {

	// ===================== CONFIGURATION =====================
	@Autowired
	IActiviteService activiteService;

	public ActiviteController(ActiviteServiceImpl activiteServiceImpl) {
		activiteService = activiteServiceImpl;
	}

	
	// ===================== METHODE CREATE =====================
	@PostMapping(value = "/createActivite")
	public Activite createActivite(@RequestBody Activite activite) {
		return this.activiteService.save(activite);
	}

	
	// ===================== METHODE UPDATE =====================
	@PutMapping("/updateActivite")
	public Activite updateActivite(@RequestBody Activite activite) {
		return activiteService.update(activite);
	}

	
	// ===================== METHODE DELETE BY ID =====================
	@DeleteMapping("/deleteById/{id}")
	public void deleteActivite(@PathVariable int id) {
		if (activiteService.findById(id) != null) {
			activiteService.delete(activiteService.findById(id));
		}
	}

	
	// ===================== METHODE DELETE BY NOM =====================
//	@DeleteMapping("/deleteByNom/{nom}")
//	public void deleteActivite(@PathVariable String nom) {
//		if (activiteService.findByNom(nom) != null) {
//			activiteService.delete(activiteService.findByNom(nom));
//		}
//	}

	
	// ===================== METHODE FIND ALL =====================
	@GetMapping(value = "/all")
	public List<Activite> getAllActivites() {
		return activiteService.findAll();
	}

	
	// ===================== METHODE FIND BY ID =====================
	@GetMapping("/getById/{id}")
	public Activite findActiviteById(@RequestBody Activite activite, @PathVariable int id) {
		if (activiteService.findById(id) == null) {
			return null;
		} else {
			return activiteService.findById(id);
		}
	}

	
	// ===================== METHODE FIND BY NOM =====================
//	@GetMapping("/getByNom/{nom}")
//	public Activite findActiviteByNom(@RequestBody Activite activite, @PathVariable String nom) {
//		if (activiteService.findByNom(nom) == null) {
//			return null;
//		} else {
//			return activiteService.findByNom(nom);
//		}
//	}
	

}
