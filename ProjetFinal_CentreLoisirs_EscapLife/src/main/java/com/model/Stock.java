package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Produit_infos")
public class Stock {
	
	
	// ============================ ATTRIBUTS ========================================
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id_prod;
	
	//type de produits : mat�riels ou alimentaires
	@Column(name="type_prod") 
	private String type;
	
	private int quantite;
	
	@Column(name="date_livraison")
	private String date_liv;
	
	@Column(name="date_peremption")
	private String dcl;
	
	
	// ============================ RELATIONS ========================================
	
	
	
	// ============================ CONSTRUCTEURS ====================================	
	public Stock() {
		super();
	}

	public Stock(String type, int id_prod, int quantite, String date_liv, String dcl) {
		super();
		this.type = type;
		this.id_prod = id_prod;
		this.quantite = quantite;
		this.date_liv = date_liv;
		this.dcl = dcl;
	}

	
	// ========================== GETTERS ET SETTERS ================================	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public int getId_prod() {
		return id_prod;
	}
	public void setId_prod(int id_prod) {
		this.id_prod = id_prod;
	}

	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public String getDate_liv() {
		return date_liv;
	}
	public void setDate_liv(String date_liv) {
		this.date_liv = date_liv;
	}

	public String getDcl() {
		return dcl;
	}
	public void setDcl(String dcl) {
		this.dcl = dcl;
	}


}
