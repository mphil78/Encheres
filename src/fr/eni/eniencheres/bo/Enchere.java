package fr.eni.eniencheres.bo;

import java.time.LocalDate;

public class Enchere {
	
	//Attributs d'instance
	private LocalDate dateEnchere;
	private int montant_enchere;
	private Utilisateur encherisseur;
	private ArticleVendu acticleVendu;
	
	
	//Getters et setters
	public LocalDate getDateEnchere() {
		return dateEnchere;
	}
	public void setDateEnchere(LocalDate dateEnchere) {
		this.dateEnchere = dateEnchere;
	}
	public int getMontant_enchere() {
		return montant_enchere;
	}
	public void setMontant_enchere(int montant_enchere) {
		this.montant_enchere = montant_enchere;
	}
	public Utilisateur getEncherisseur() {
		return encherisseur;
	}
	public void setEncherisseur(Utilisateur encherisseur) {
		this.encherisseur = encherisseur;
	}
	public ArticleVendu getActicleVendu() {
		return acticleVendu;
	}
	public void setActicleVendu(ArticleVendu acticleVendu) {
		this.acticleVendu = acticleVendu;
	}
	
	//constructeurs
	public Enchere(LocalDate dateEnchere, int montant_enchere, Utilisateur encherisseur, ArticleVendu acticleVendu) {
		super();
		this.dateEnchere = dateEnchere;
		this.montant_enchere = montant_enchere;
		this.encherisseur = encherisseur;
		this.acticleVendu = acticleVendu;
	}
	public Enchere() {
		super();
		
	}

	//override toString
	@Override
	public String toString() {
		return "Enchere [dateEnchere=" + dateEnchere + ", montant_enchere=" + montant_enchere + ", encherisseur="
				+ encherisseur + ", acticleVendu=" + acticleVendu + "]";
	}
	
	
}
