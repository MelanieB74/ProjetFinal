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

/**
 * Classe pour déclarer les employés du centre de loisirs. Cette classe permet de
 * créer la table "employe_infos" dans la base de donnée par @Entity et @Table.
 * Elle hérite de la classe Personne.
 */

//je pense qu'il faudra enlever Single_Table car inutile : le responsable n'aura pas d'attribut en plus de cetlle-ci. 

//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="type_emp", discriminatorType=DiscriminatorType.STRING)
//@DiscriminatorValue("employe")

@Entity
@Table(name="employe_infos")
public class Employe extends Personne {
	
	
	// ===================== ATTRIBUTS =====================
	/**
	 * La variable "type" permet de différencier les employés selon l'activité gérée 
	 * et le responsable du centre de loirsirs.
	 */
	@Column(name="type_emp")
	private String type;
	
	private String prenom;
	
	private int matricule;
	
	/**
	 * Jointure avec la table Utilisateur (via id_utilisateur) pour affecter un
	 * login et un mot de passe à l'employé afin qu'il puisse accéder aux services 
	 * auxquels il est autorisé d'accéder. 
	 * Relation OneToOne : 1 employé ne peut avoir qu'un login et un mot de passe.
	 */
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_utilisateur")
	Utilisateur utilisateur;

	
	// ===================== CONSTRUCTEURS =====================
	public Employe() {
		super();
	}

	public Employe(String type, String nom, String prenom, int matricule, long tel, String mail, Utilisateur utilisateur) {
		super(nom, tel, mail);
		this.type = type;
		this.prenom = prenom;
		this.matricule = matricule;
		this.utilisateur = utilisateur;
	}

	
	// ===================== GETTERS ET SETTERS =====================
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