package com.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue("laserGame")

@Entity
public class ActLaserGame extends Activite {

	// ============================ ATTRIBUTS
	// ========================================



	@Column(name = "nom_salle")
	private int nomSalle;

	// ============================ CONSTRUCTEURS
	// ====================================
	public ActLaserGame() {
		super();
	}

	public ActLaserGame(float tarifEtudiant, float tarifNormal, float tarifJeune, float tarifEntreprise, int nbMax,
			int nbMin,  int nbSalle, int nomSalle) {
		super(tarifEtudiant, tarifNormal, tarifJeune, tarifEntreprise, nbMax, nbMin);
		
		this.nomSalle = nomSalle;
	}

	// ========================== GETTERS ET SETTERS
	// =================================
	public int getNomSalle() {
		return nomSalle;
	}

	public void setNomSalle(int nomSalle) {
		this.nomSalle = nomSalle;
	}



}
