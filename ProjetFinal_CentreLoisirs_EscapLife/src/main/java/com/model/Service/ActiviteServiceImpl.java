package com.model.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.ActEscapeGame;
import com.model.Activite;
import com.model.Reservation;
import com.model.Dao.IActiviteDao;
import com.model.Dao.IClientDao;

@Service("serviceActivite")
public class ActiviteServiceImpl implements IActiviteService{

	
	@Autowired
	IActiviteDao activiteDao;

	public ActiviteServiceImpl(IActiviteDao activiteDao) {
		super();
		this.activiteDao = activiteDao;
	}
	
	@Override
	public Activite save(Activite activite) {
	
		
	//	ActEscapeGame escapegame = new ActEscapeGame(10, 9, 8, 7, 8, 4,"james bond");
		// TODO Auto-generated method stub
		return null;
		//return activiteDao.save(escapegame);
	}

	@Override
	public Activite update(Activite activite) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Activite activite) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Activite findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Activite> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Activite findByNom(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

}
