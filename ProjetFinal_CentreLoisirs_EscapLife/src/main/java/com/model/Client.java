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

/**
 * Classe pour déclarer les clients du centre de loisirs. Cette classe permet de
 * créer la table "client_infos" dans la base de donnée par @Entity et @Table.
 * Elle hérite de la classe Personne. L'Inheritance single_table avec la classe
 * clientEntreprise pour rassembler les clients physiques et moraux tout en les
 * différenciant par leur type grâce au DiscrimintorColumn et DiscriminatorValue.
 */

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_clt", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("physique")

@Entity
@Table(name = "client_infos")
public class Client extends Personne {

	// ===================== ATTRIBUTS =====================
	/**
	 * la variable statut permet de différencier les clients pysiques étudiants, 
	 * moins de 25 ans et autres.
	 */
	@Column(name = "statut")
	private String statut;

	/**
	 * Jointure avec la table Utilisateur (via id_utilisateur) pour affecter un
	 * login et un mot de passe au client afin qu'il puisse accéder aux services 
	 * clients uniquement de l'application. 
	 * Relation OneToOne : 1 client ne peut avoir qu'un login et un mot de passe.
	 */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_utilisateur")
	Utilisateur utilisateur;

	
	// ===================== CONSTRUCTEURS =====================
	public Client() {
		super();
	}
	
	/**
	 * Constructeur 2 avec les variables de cette classe et ceux de la classe Personne.
	 */
	public Client(String nom, long tel, String mail, String statut, Utilisateur utilisateur) {
		super(nom, tel, mail);
		this.statut = statut;
		this.utilisateur = utilisateur;
	}

	/**
	 * Constructeur contenant 3 les entiers qui serviront dans la classe clientEntreprise.
	 */
	public Client(String nom, long tel, String mail, Utilisateur utilisateur) {
		super(nom, tel, mail);
		this.utilisateur = utilisateur;
	}

	
	// ===================== GETTERS ET SETTERS =====================
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