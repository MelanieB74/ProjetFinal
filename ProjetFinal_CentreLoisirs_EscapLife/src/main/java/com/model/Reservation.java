package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Reservation {
	
	
	// ============================ ATTRIBUTS ========================================
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="date_debut")
	private String dtDeb;
	
	@Column(name="heure_debut")
	private String hrDeb;
	
	
	//lien avec l'id de l'Activite choisie
	@OneToOne(mappedBy="reservation")
	private Activite activite;

		
	// ============================ CONSTRUCTEURS ====================================
	public Reservation() {
		super();
	}
	
	public Reservation(String dtDeb, String hrDeb, Activite activite) {
		super();
		this.dtDeb = dtDeb;
		this.hrDeb = hrDeb;
		this.activite = activite;
	}
	
	
	public Reservation(String dtDeb, String hrDeb) {
		
		this.dtDeb = dtDeb;
		this.hrDeb = hrDeb;
		
	}
	
	public int getId() {
		return id;
	}
	
	
	// ========================== GETTERS ET SETTERS ================================	
	public void setId(int id) {
		this.id = id;
	}

	public String getDtDeb() {
		return dtDeb;
	}
	public void setDtDeb(String dtDeb) {
		this.dtDeb = dtDeb;
	}

	public String getHrDeb() {
		return hrDeb;
	}
	public void setHrDeb(String hrDeb) {
		this.hrDeb = hrDeb;
	}

	public Activite getActivite() {
		return activite;
	}
	public void setActivite(Activite activite) {
		this.activite = activite;
	}
	
	
	
}
