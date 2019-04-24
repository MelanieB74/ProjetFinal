package com.model.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Client;
import com.model.Dao.IClientDao;

@Service("serviceClient")
public class ClientServiceImpl implements IClientService {

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
	public Client update(Client client) {

		return clientDao.save(client);
	}

	@Override
	public void delete(Client client) {
		// TODO Auto-generated method stub
		clientDao.delete(client);
	}

	@Override
	public Client findById(Integer id) {
		Optional<Client> client = clientDao.findById(id);
		return (client == null ? null : client.orElse(null));
	}

	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		return clientDao.findAll();
	}

	@Override
	public Client findByFirstNameAndLastName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
