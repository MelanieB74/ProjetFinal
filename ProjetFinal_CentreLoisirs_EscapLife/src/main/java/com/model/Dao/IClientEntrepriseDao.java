package com.model.Dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.model.ClientEntreprise;

public interface IClientEntrepriseDao extends JpaRepository<ClientEntreprise, Integer>{

public ClientEntreprise findById(int id);
	
	public ClientEntreprise findByNom(String nom);
	
}
