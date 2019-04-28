package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type_clt", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("physique")

@Entity
@Table(name="client_infos")
public class Client extends Personne {
	
	
	// ============================ ATTRIBUTS ========================================
	//statut du client : �tudiant, s�nior, moins de 25 ans
	@Column(name="statut")
	private String statut;
	
	//jointure avec la table Utilisateur pour lui affecter un r�le (selon son id_utilisateur)
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_utilisateur")
	Utilisateur utilisateur;
	
	
	// ============================ CONSTRUCTEURS ====================================	
	public Client() {
		super();
	}
	
	public Client(String nom, long tel, String mail, Utilisateur utilisateur) {
		super(nom, tel, mail);
		this.utilisateur = utilisateur;
	}

	public Client(String nom, long tel, String mail, String statut, Utilisateur utilisateur) {
		super(nom, tel, mail);
		this.statut = statut;
		this.utilisateur = utilisateur;
	}
	

	// ========================== GETTERS ET SETTERS ================================	
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}


}