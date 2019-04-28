package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Activite;

/**
 * Classe instanciee comme Dao avec @Repository. 
 * Les differentes methodes concernant le client y sont declarees : 
 * elle herite de la classe JpaRepository qui contient les methodes par defaut 
 * que l'application utilisera : 
 * save (pour l'ajout d'une activite), 
 * update (pour modifier une activite), 
 * delete (pour supprimer une activite) et 
 * getAll (pour consulter la liste des activites contenues dans la base de donnees).
 */

@Repository
public interface IActiviteDao extends JpaRepository<Activite, Integer> {
	
	/**
	 * findById permet de rechercher une activite via son id.
	 */
	public Activite findById(int id);
	
}
