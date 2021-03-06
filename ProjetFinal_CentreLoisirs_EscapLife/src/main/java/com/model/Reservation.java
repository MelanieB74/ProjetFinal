package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Classe pour declarer les reservations du centre de loisirs. Cette classe permet de
 * creer la table "reservation_infos" dans la base de donnee par @Entity et @Table.
 * Elle permettra au client de faire une reservation directement sur le site web du
 * centre de loisirs.Elle permmettra aussi aux employes de les consulter et au 
 * responsable de les gerer.
 */

@Entity
@Table(name="reservation_infos")
public class Reservation {
	
	
	// ===================== ATTRIBUTS =====================
	/**
	 * l'id est une primary key et est auto-increment.
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="date_debut")
	private String dtDeb;
	
	@Column(name="heure_debut")
	private String hrDeb;
	
	/**
	 * Jointure avec la table Activite (via id_activite) pour pouvoir affecter 
	 * joindre la reservation a une activite. 
	 * Relation ManyToOne : 1,* reservations peuvent contenir 1 activite.
	 */
	@ManyToOne
	@JoinColumn(name="id_activite")
	private Activite activite;
	
//	//lien avec l'id de l'Activite choisie
//	@OneToOne(mappedBy="reservation")
//	private Activite activite;

		
	// ===================== CONSTRUCTEURS =====================
	public Reservation() {
		super();
	}
	/**
	 * Constructeur avec les variables de cette classe (sauf l'id car auto-increment)
	 */
	public Reservation(String dtDeb, String hrDeb, Activite activite) {
		this.dtDeb = dtDeb;
		this.hrDeb = hrDeb;
		this.activite = activite;
	}
	
	
	// ===================== GETTERS ET SETTERS =====================
	public int getId() {
		return id;
	}
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
