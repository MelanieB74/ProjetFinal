package com.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Classe pour declarer l'activite type Laser Game (@DicriminatorValue). 
 * Elle herite de la classe Activite par le Single_Table.
 */

@DiscriminatorValue("laserGame")

@Entity
public class ActLaserGame extends Activite {

	// ===================== ATTRIBUTS =====================
	@Column(name = "nom_salle")
	private int nomSalle;

	
	// ===================== CONSTRUCTEURS =====================
	public ActLaserGame() {
		super();
	}

	/**
	 * Constructeur contenant les variables de la classe mere Activite et celui
	 * de cette classe.
	 */
	public ActLaserGame(int nomSalle, float tarifEtudiant, float tarifNormal, float tarifJeune, 
			float tarifEntreprise, int nbMax, int nbMin, int nbSalle) {
		super(tarifEtudiant, tarifNormal, tarifJeune, tarifEntreprise, nbMax, nbMin);
		this.nomSalle = nomSalle;
	}

	
	// ===================== GETTERS ET SETTERS =====================
	public int getNomSalle() {
		return nomSalle;
	}

	public void setNomSalle(int nomSalle) {
		this.nomSalle = nomSalle;
	}

}
