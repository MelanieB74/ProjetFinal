package com.model.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Client;
import com.model.ClientEntreprise;
import com.model.Dao.IClientEntrepriseDao;



@Service
public class ClientEntrepriseServiceImpl implements IClientEntrepriseService {

	@Autowired
	IClientEntrepriseDao ClientEntrepriseDao;

	public ClientEntrepriseServiceImpl(IClientEntrepriseDao clientEntrepriseDao) {
		super();
		ClientEntrepriseDao = clientEntrepriseDao;
	}

	@Override
	public ClientEntreprise save(ClientEntreprise clientEntreprise) {
		// TODO Auto-generated method stub
		return ClientEntrepriseDao.save(clientEntreprise);
	}

	@Override
	public ClientEntreprise update(ClientEntreprise clientEntreprise) {
		// TODO Auto-generated method stub
		return ClientEntrepriseDao.save(clientEntreprise);
	}

	@Override
	public void delete(ClientEntreprise clientEntreprise) {
		// TODO Auto-generated method stub
		ClientEntrepriseDao.delete(clientEntreprise);
	}

	@Override
	public ClientEntreprise findById(Integer id) {
		// TODO Auto-generated method stub
		Optional<ClientEntreprise> clientEntreprise = ClientEntrepriseDao.findById(id);
		return (clientEntreprise == null ? null : clientEntreprise.orElse(null));
	}

	@Override
	public List<ClientEntreprise> findAll() {
		// TODO Auto-generated method stub
		return ClientEntrepriseDao.findAll();
	}

	@Override
	public ClientEntreprise findByNom(String nom) {
		// TODO Auto-generated method stub
		return ClientEntrepriseDao.findByNom(nom);
	}

	
	
	
}
