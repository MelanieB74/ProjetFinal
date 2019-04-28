package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Role {
	
	// ============================ ATTRIBUTS ========================================
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	//pour l'autorisation des utilisateurs à accèder à certains services
	private String roleName;
	
	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id_utilisateur")
	private Utilisateur utilisateur;

	
	// ============================ CONSTRUCTEURS ====================================
	public Role() {
		super();
	}

	public Role(String roleName) {
		super();
		this.roleName = roleName;
	}

	public Role(String roleName, Utilisateur utilisateur) {
		super();
		this.roleName = roleName;
		this.utilisateur = utilisateur;
	}
	

	
	// ========================== GETTERS ET SETTERS ================================
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

}
