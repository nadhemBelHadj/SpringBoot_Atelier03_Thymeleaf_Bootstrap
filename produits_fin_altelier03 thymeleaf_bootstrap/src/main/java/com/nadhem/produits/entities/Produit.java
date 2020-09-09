package com.nadhem.produits.entities;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity  
public class Produit implements Serializable{
	
	@Id 
	@GeneratedValue (strategy=GenerationType.IDENTITY) 
	private Long idProduit;
	private String nomProduit;
	private Double prixProduit;
	private Date dateCreation;
	
	
	@ManyToOne
	private Categorie categorie;
	
	
	public Produit() {
		super();
	}
	public Produit(String nomProduit, Double prix, Date dateCreation) {
		super();
		this.nomProduit = nomProduit;
		this.prixProduit = prix;
		this.dateCreation=dateCreation;
	}
	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public Double getPrixProduit() {
		return prixProduit;
	}
	public void setPrixProduit(Double prix) {
		this.prixProduit = prix;
	}
	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", nomProduit=" + nomProduit + ", prix=" + prixProduit + "]";
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
}
