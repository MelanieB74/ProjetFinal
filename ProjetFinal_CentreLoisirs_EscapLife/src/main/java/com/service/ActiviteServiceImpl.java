package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Activite;
import com.dao.IActiviteDao;

@Service("serviceActivite")
public class ActiviteServiceImpl implements IActiviteService {
	
	// ===================== CONFIGURATION =====================
	@Autowired
	IActiviteDao activiteDao;

	public ActiviteServiceImpl(IActiviteDao activiteDao) {
		super();
		this.activiteDao = activiteDao;
	}
	
	
	// ===================== METHODE CREATE =====================
	@Override
	public Activite save(Activite activite) {
		return activiteDao.save(activite);
	}
	
	
	// ===================== METHODE UPDATE =====================
	@Override
	public Activite update(Activite activite) {
		return this.activiteDao.save(activite);
	}
	
	
	// ===================== METHODE DELETE =====================
	@Override
	public void delete(Activite activite) {
		activiteDao.delete(activite);
	}
	
	
	// ===================== METHODE FIND ALL =====================
	@Override
	public List<Activite> findAll() {
		return activiteDao.findAll();
	}
	
	
	// ===================== METHODE FIND BY ID =====================
	@Override
	public Activite findById(Integer id) {
		Optional<Activite> activite = activiteDao.findById(id);
		return (activite == null ? null : activite.orElse(null));
	}
	
	
	// ===================== METHODE FIND BY NOM =====================
//	@Override
//	public Activite findByNom(String nom) {
//		return activiteDao.findByNom(nom);
//	}

}
