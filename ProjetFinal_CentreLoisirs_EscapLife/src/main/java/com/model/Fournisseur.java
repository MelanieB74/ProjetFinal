package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="fournisseur_infos")
public class Fournisseur extends Personne {
	
	
	// ============================ ATTRIBUTS ========================================
	@Column(name="nom_Entreprise")
	private String nomEnt;
	
	
	// ============================ CONSTRUCTEURS ====================================
	public Fournisseur() {
		super();
	}

	public Fournisseur(String nomEnt) {
		super();
		this.nomEnt = nomEnt;
	}

	public Fournisseur(String nom, long tel, String mail, String nomEnt) {
		super(nom, tel, mail);
		this.nomEnt = nomEnt;
	}

	
	// ========================== GETTERS ET SETTERS ================================	
	public String getNomEnt() {
		return nomEnt;
	}
	public void setNomEnt(String nomEnt) {
		this.nomEnt = nomEnt;
	}

	
}
