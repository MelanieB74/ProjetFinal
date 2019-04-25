package com.model.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Activite;




	@Repository
	public interface IActiviteDao extends JpaRepository<Activite, Integer>{

		public Activite findById(int id);
		
		
	
}
