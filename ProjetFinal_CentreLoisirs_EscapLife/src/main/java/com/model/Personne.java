package com.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Classe pour déclarer les attributs en commun avec toutes les personnes de
 * l'aplication (id, nom, telephone et mail). @MappedSuperclass permet de
 * déclarer cette classe mais elle ne créera pas de table dans la base de donnée. 
 * Autrement dit, elle permet d'utiliser les varaibles dans d'autres classes : 
 * Client, ClientEntreprise, Employe.
 */

@MappedSuperclass
public class Personne {
	
	
	// ===================== ATTRIBUTS =====================
	/**
	 * l'id est une primary key et est auto-incrément.
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_pers")
	private int id;
	
	@Column(length=20)
	private String nom;
	
	@Column(name="telephone")
	private long tel;
	
	@Column(name="email")
	private String mail;
		
	
	// ===================== CONSTRUCTEURS =====================
	public Personne() {
		super();
	}

	public Personne(int id, String nom, long tel, String mail) {
		super();
		this.id = id;
		this.nom = nom;
		this.tel = tel;
		this.mail = mail;
	}

	public Personne(String nom, long tel, String mail) {
		super();
		this.nom = nom;
		this.tel = tel;
		this.mail = mail;
	}
	
	
	// ===================== GETTERS ET SETTERS =====================
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public long getTel() {
		return tel;
	}
	public void setTel(long tel) {
		this.tel = tel;
	}

	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}

	
}
