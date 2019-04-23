package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
//import javax.persistence.DiscriminatorColumn;
//import javax.persistence.DiscriminatorType;
//import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
//import javax.persistence.Inheritance;
//import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="type_emp", discriminatorType=DiscriminatorType.STRING)
//@DiscriminatorValue("employe")

@Entity
@Table(name="employe_infos")
public class Employe extends Personne {
	
	
	// ============================ ATTRIBUTS ========================================
	@Column(name="type_emp")
	private String type;
	
	private String prenom;
	
	private int matricule;
	
	//jointure avec la table Utilisateur pour lui affecter un r�le (selon son id_utilisateur)
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_utilisateur")
	Utilisateur utilisateur;

	
	// ============================ CONSTRUCTEURS ====================================
	public Employe() {
		super();
	}

	public Employe(String prenom, int matricule) {
		super();
		this.prenom = prenom;
		this.matricule = matricule;
	}


	public Employe(String type, String nom, String prenom, int matricule, long tel, String mail, Utilisateur utilisateur) {
		super(nom, tel, mail);
		this.type= type;
		this.prenom = prenom;
		this.matricule = matricule;
		this.utilisateur = utilisateur;
	}

	
	// ========================== GETTERS ET SETTERS ================================	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getMatricule() {
		return matricule;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	

}