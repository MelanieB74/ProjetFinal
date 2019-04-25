package com.model.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Employe;



public interface IEmployeDao extends JpaRepository<Employe, Integer> {

public Employe findById(int id);
	
	public Employe findByNom(String nom);
	
}
