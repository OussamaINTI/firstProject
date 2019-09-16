package com.inti.gestionmagasin.entities;

import com.inti.exception.MagasinPleineException;

public class Magasin {
	private int id;
	private String nom;
	private int capaciteProduit = 0;
	private String adresse;
	private ProduitAlimentaire[] tabProduit = new ProduitAlimentaire[50];

	public Magasin() {

	}

	public Magasin(int id, String adresse) {
		this.adresse = adresse;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCapaciteProduit() {
		return capaciteProduit;
	}

	public void setCapaciteProduit(int capaciteProduit) {
		this.capaciteProduit = capaciteProduit;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public ProduitAlimentaire[] getTabProduit() {
		return tabProduit;
	}

	public void setTabProduit(ProduitAlimentaire[] tabProduit) {
		this.tabProduit = tabProduit;
	}

	public int chercher(ProduitAlimentaire p) {
		for (int i = 0; i < capaciteProduit; i++) {
			if (tabProduit[i].comparer(p)) {
				return i;
			}
		}
		return -1;
	}

	public void ajouter(ProduitAlimentaire p) throws MagasinPleineException {
		if (this.chercher(p) == -1) {
			if (this.capaciteProduit >= 1)
				throw new MagasinPleineException();
			{

				tabProduit[capaciteProduit] = p;
				capaciteProduit++;
			}
		}
	}

	public void afficher() {
		System.out.println("Magasin:\n" + "id:" + id + " adresse: " + adresse + " capacite: " + capaciteProduit);
		for (int i = 0; i < capaciteProduit; i++) {
			System.out.println("produit " + (i + 1) + "\n libelle:" + tabProduit[i].getLibelle() + " prix:"
					+ tabProduit[i].getPrix());
		}

	}
}
