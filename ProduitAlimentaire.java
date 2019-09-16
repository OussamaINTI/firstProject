package com.inti.gestionmagasin.entities;

import java.util.Date;

public class ProduitAlimentaire {
	private int identifiant;
	private String libelle;
	private Date dateFabrication;
	private String marque;
	private float prix;
	static int nbrProduit;
	private Date dateExpiration;

	public ProduitAlimentaire() {

	}

	public ProduitAlimentaire(int identifiant, String libelle, String marque, Date dateExpiration) {
		this.identifiant = identifiant;
		this.libelle = libelle;
		this.marque = marque;
		this.dateExpiration = dateExpiration;
		nbrProduit++;
	}

	public ProduitAlimentaire(int identifiant, String libelle, String marque, float prix) {
		this.identifiant = identifiant;
		this.libelle = libelle;
		this.marque = marque;
		this.prix = prix;
	}

	public void afficher() {
		System.out.println("Produit:\n" + "identifiant: " + identifiant + "\n" + "Libellé: " + libelle + "\n"
				+ "marque: " + marque + "\nprix: " + prix + "\ndate expiration" + dateExpiration);

	}

	@Override
	public String toString() {
		return "ProduitAlimentaire [libelle=" + libelle + ", marque=" + marque + ", prix=" + prix + "]";
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public Date getDateExpiration() {
		return dateExpiration;
	}

	public void setDateExpiration(Date dateExpiration) {
		this.dateExpiration = dateExpiration;
	}

	public boolean comparer(ProduitAlimentaire p) {
		return (p.identifiant == this.identifiant && p.prix == this.prix && 
				p.libelle.equals(this.libelle));
	}
}
