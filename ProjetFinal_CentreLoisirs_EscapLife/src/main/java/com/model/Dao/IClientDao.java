package com.model.Dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Client;

@Repository
public interface IClientDao extends JpaRepository<Client, Integer>{

	public Client findById(long id);
	
}
