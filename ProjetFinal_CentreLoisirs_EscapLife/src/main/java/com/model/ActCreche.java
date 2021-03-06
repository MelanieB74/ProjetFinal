package com.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Classe pour declarer l'activite type Creche (@DicriminatorValue). 
 * Elle herite de la classe Activite par le Single_Table.
 */

@DiscriminatorValue("creche")

@Entity
public class ActCreche extends Activite {

	// ===================== ATTRIBUTS =====================
	@Column(name = "nb_enfants")
	private int nbEnf;

	
	// ===================== CONSTRUCTEURS =====================
	public ActCreche() {
		super();
	}

	/**
	 * Constructeur contenant les variables de la classe mere Activite et celui de cette classe.
	 */
	public ActCreche(int nbEnf, float tarifEtudiant, float tarifNormal, float tarifJeune, 
			float tarifEntreprise, int nbMax, int nbMin) {
		super(tarifEtudiant, tarifNormal, tarifJeune, tarifEntreprise, nbMax, nbMin);
		this.nbEnf = nbEnf;
	}

	
	// ===================== GETTERS ET SETTERS =====================
	public int getNbEnf() {
		return nbEnf;
	}
	public void setNbEnf(int nbEnf) {
		this.nbEnf = nbEnf;
	}
	
}
