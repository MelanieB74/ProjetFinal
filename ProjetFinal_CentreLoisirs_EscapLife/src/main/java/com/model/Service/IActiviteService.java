package com.model.Service;

import java.util.List;

import com.model.Activite;

public interface IActiviteService {

public Activite save(Activite activite);
    
    public Activite update(Activite activite);
    
    public void delete(Activite activite);
    
    public Activite findById(Integer id);
    
    public List<Activite> findAll();
    

	public Activite findByNom(String nom);
    
	
}
