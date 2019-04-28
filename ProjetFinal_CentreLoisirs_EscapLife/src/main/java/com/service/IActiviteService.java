package com.service;

import java.util.List;

import com.model.Activite;

public interface IActiviteService {

	public Activite save(Activite activite);
    
    public Activite update(Activite activite);
    
    public void delete(Activite activite);
    
    public List<Activite> findAll();
    
    public Activite findById(Integer id);

	//public Activite findByNom(String nom);
    
	
}
