package com.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue("entreprise")

@Entity
public class ClientEntreprise extends Client {
	
	
	// ============================ ATTRIBUTS ========================================
	private long siret;

	
	// ============================ CONSTRUCTEURS ====================================	
	public ClientEntreprise() {
		super();
	}

	public ClientEntreprise(long siret) {
		super();
		this.siret = siret;
	}	

	public ClientEntreprise(String nom, long siret, long tel, String mail, Utilisateur utilisateur) {
		super(nom, tel, mail, utilisateur);
		this.siret = siret;
	}

	
	// ========================== GETTERS ET SETTERS ================================	
	public long getSiret() {
		return siret;
	}
	public void setSiret(long siret) {
		this.siret = siret;
	}

	
}