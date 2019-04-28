package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

@DiscriminatorColumn(name="type_activ", discriminatorType=DiscriminatorType.STRING)
@Entity
@Table(name="activite_infos")
public class Activite {
	
	
	// ============================ ATTRIBUTS ========================================
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_activite")
	private int id;
	
	private float tarifEtudiant;
	
	private float tarifNormal;

	private float tarifJeune;
	
	private float tarifEntreprise;
	
	@Column(name="nbMax_personnes")
	private int nbMax;
	
	@Column(name="nbMin_personnes")
	private int nbMin;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_activite")
	Reservation reservation;
	
	
	
	// ============================ CONSTRUCTEURS ====================================	
	public Activite() {
		super();
	}

	
	public Activite(float tarifEtudiant, float tarifNormal, float tarifJeune, float tarifEntreprise, int nbMax,
			int nbMin) {
		
		
		this.tarifEtudiant = tarifEtudiant;
		this.tarifNormal = tarifNormal;
		this.tarifJeune = tarifJeune;
		this.tarifEntreprise = tarifEntreprise;
		this.nbMax = nbMax;
		this.nbMin = nbMin;
	
	}




	// ========================== GETTERS ET SETTERS ================================	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	public int getNbMax() {
		return nbMax;
	}
	public void setNbMax(int nbMax) {
		this.nbMax = nbMax;
	}

	public int getNbMin() {
		return nbMin;
	}
	public void setNbMin(int nbMin) {
		this.nbMin = nbMin;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public float getTarifEtudiant() {
		return tarifEtudiant;
	}

	public void setTarifEtudiant(float tarifEtudiant) {
		this.tarifEtudiant = tarifEtudiant;
	}

	public float getTarifNormal() {
		return tarifNormal;
	}

	public void setTarifNormal(float tarifNormal) {
		this.tarifNormal = tarifNormal;
	}

	public float getTarifJeune() {
		return tarifJeune;
	}

	public void setTarifJeune(float tarifJeune) {
		this.tarifJeune = tarifJeune;
	}

	public float getTarifEntreprise() {
		return tarifEntreprise;
	}

	public void setTarifEntreprise(float tarifEntreprise) {
		this.tarifEntreprise = tarifEntreprise;
	}
	
	

	
}
