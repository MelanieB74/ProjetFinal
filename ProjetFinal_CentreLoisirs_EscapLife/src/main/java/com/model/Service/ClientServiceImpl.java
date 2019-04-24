package com.model.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Client;
import com.model.Dao.IClientDao;



@Service("serviceClient")
public class ClientServiceImpl implements IClientService{
	
	@Autowired
	IClientDao clientDao;
	 

	public ClientServiceImpl(IClientDao clientDao) {
		super();
		this.clientDao = clientDao;
	}

	@Override
	public Client save(Client client) {
		
		return clientDao.save(client);
	}

	@Override
	public Client update(Client Client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Client Client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Client findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client findByFirstNameAndLastName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return null;
	}



}
