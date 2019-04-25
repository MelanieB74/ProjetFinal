package com.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@DiscriminatorValue("escapeGame")

@Entity
@Table(name = "activite_infos")
public class ActEscapeGame extends Activite {

	// ============================ ATTRIBUTS
	// ========================================
	private String mission;



	// ============================ CONSTRUCTEURS
	// ====================================
	public ActEscapeGame() {
		super();
	}

	public ActEscapeGame(float tarifEtudiant, float tarifNormal, float tarifJeune, float tarifEntreprise, int nbMax,
			int nbMin, String mission) {
		super(tarifEtudiant, tarifNormal, tarifJeune, tarifEntreprise, nbMax, nbMin);
		this.mission = mission;
		
	}

	// ========================== GETTERS ET SETTERS
	// =================================
	public String getMission() {
		return mission;
	}

	public void setMission(String mission) {
		this.mission = mission;
	}



}