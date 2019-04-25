package com.model.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Employe;
import com.model.Dao.IEmployeDao;

@Service
public class EmployeServiceImpl implements IEmployeService {


	@Autowired
	IEmployeDao EmployeDao;

	public EmployeServiceImpl(IEmployeDao EmployeDao) {
		super();
		this.EmployeDao = EmployeDao;
	}

	@Override
	public Employe save(Employe Employe) {

		return EmployeDao.save(Employe);
	}

	@Override
	public Employe update(Employe Employe) {

		return EmployeDao.save(Employe);
	}

	@Override
	public void delete(Employe Employe) {
		// TODO Auto-generated method stub
		EmployeDao.delete(Employe);
	}

	@Override
	public Employe findById(Integer id) {
		Optional<Employe> Employe = EmployeDao.findById(id);
		return (Employe == null ? null : Employe.orElse(null));
	}

	@Override
	public List<Employe> findAll() {
		// TODO Auto-generated method stub
		return EmployeDao.findAll();
	}

	@Override
	public Employe findByNom(String nom) {
		// TODO Auto-generated method stub
		return EmployeDao.findByNom(nom);
	}

	
	
}
