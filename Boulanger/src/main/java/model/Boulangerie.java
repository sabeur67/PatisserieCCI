package model;

import java.util.ArrayList;
import java.util.List;

public class Boulangerie {

	private List<Produit> produits = new ArrayList<>();
	private List<Commande> commandesValidees = new ArrayList<>();
	private Commande commandeEnCour = new Commande();
	private String nom;
	private String slogan;
	
	public Boulangerie() {
		this.nom = "chez Florent";
		this.slogan = "du pain chaud même la nuit";
	}
	
	
	
	public String getNom() {
		return nom;
	}

	public String getSlogan() {
		return slogan;
	}



	public void ajouterProduit(Produit p) {
		this.produits.add(p);
	}
	
	public List<Produit> getProduits(){
		return this.produits;
	}
	
	public void validerCommande(Commande c) {
		this.commandesValidees.add(c);
	}
	
	public List<Commande> getCommandes(){
		return this.commandesValidees;
	}
	
	public int calculerRecette() {
		int recette = 0;
		for (Commande commande : commandesValidees) {
			recette += commande.calculerPrix();
		}
		return recette;
	}

	public Commande getCommandeEnCour() {
		return commandeEnCour;
	}


	public void validerCommandeEncour() {
		this.commandesValidees.add(commandeEnCour);
		this.commandeEnCour = new Commande();
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Boulangerie " + nom +"\n");
		sb.append(this.slogan + "\n");
		sb.append("-----Produits-----\n");
		for (Produit p : produits) {
			sb.append(p +"\n");
		}
		sb.append("-----Commandes-----\n");
		for (Commande commande : commandesValidees) {
			sb.append(commande + "\n");
		}
		return sb.toString();
	}
}
