package com.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Utilisateur {
	
	// ============================ ATTRIBUTS ========================================
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_utilisateur")
	private int id;
	
	//pour l'authentification
	@Column(name="login")
	private String userName;
	
	@Column(name="motDePasse")
	private String passWord;
	
	@Column(name="cpt_active")
	private boolean actived;
	
	@OneToOne(mappedBy="utilisateur")
	private Employe employe;
	
	//pour l'autorisation d'accès
	@OneToMany(mappedBy = "utilisateur")
	private List<Role> roles;
	

	// ============================ CONSTRUCTEURS ====================================
	public Utilisateur() {
		super();
	}

	public Utilisateur(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}

	public Utilisateur(String userName, String passWord, Employe employe) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.employe = employe;
	}

	
	// ========================== GETTERS ET SETTERS ================================	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public boolean isActived() {
		return actived;
	}
	public void setActived(boolean actived) {
		this.actived = actived;
	}

	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}


}
