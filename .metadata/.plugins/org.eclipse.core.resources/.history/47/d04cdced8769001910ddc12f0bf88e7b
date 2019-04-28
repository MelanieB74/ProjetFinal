package com.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue("creche")

@Entity
public class ActCreche extends Activite {

	// ============================ ATTRIBUTS
	// ========================================
	@Column(name = "nb_enfants")
	private int nbEnf;

	// ============================ CONSTRUCTEURS
	// ====================================
	public ActCreche() {
		super();
	}

	public ActCreche(float tarifEtudiant, float tarifNormal, float tarifJeune, float tarifEntreprise, int nbMax,
			int nbMin, int nbEnf) {
		super(tarifEtudiant, tarifNormal, tarifJeune, tarifEntreprise, nbMax, nbMin);
		this.nbEnf = nbEnf;
	}

	// ========================== GETTERS ET SETTERS
	// =================================
	public int getNbEnf() {
		return nbEnf;
	}

	public void setNbEnf(int nbEnf) {
		this.nbEnf = nbEnf;
	}

}
