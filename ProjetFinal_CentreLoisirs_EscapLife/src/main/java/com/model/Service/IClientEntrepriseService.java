package com.model.Service;

import java.util.List;

import com.model.ClientEntreprise;

public interface IClientEntrepriseService {

public ClientEntreprise save(ClientEntreprise clientEntreprise);
    
    public ClientEntreprise update(ClientEntreprise clientEntreprise);
    
    public void delete(ClientEntreprise clientEntreprise);
    
    public ClientEntreprise findById(Integer id);
    
    public List<ClientEntreprise> findAll();
    

	public ClientEntreprise findByNom(String nom);
	
}
