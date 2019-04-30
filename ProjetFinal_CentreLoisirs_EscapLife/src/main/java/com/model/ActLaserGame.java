package com.model;

import java.util.List;

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
	private String theme;

	
	// ===================== CONSTRUCTEURS =====================
	public ActLaserGame() {
		super();
	}

	/**
	 * Constructeur contenant les variables de la classe mere Activite et celui
	 * de cette classe.
	 */
	public ActLaserGame(float tarifEtudiant, float tarifNormal, float tarifJeune, float tarifEntreprise, int nbMax,
			int nbMin, List<Reservation> reservations, String theme) {
		super(tarifEtudiant, tarifNormal, tarifJeune, tarifEntreprise, nbMax, nbMin, reservations);
		this.theme = theme;
	}

	public ActLaserGame(float tarifEtudiant, float tarifNormal, float tarifJeune, float tarifEntreprise, int nbMax,
			int nbMin, String theme) {
		super(tarifEtudiant, tarifNormal, tarifJeune, tarifEntreprise, nbMax, nbMin);
		this.theme = theme;
	}
	

	// ===================== GETTERS ET SETTERS =====================
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}

}
