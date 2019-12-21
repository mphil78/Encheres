package fr.eni.eniencheres.bo;

import java.util.ArrayList;
import java.util.List;

public class Categorie {

	//atributs d'instance
	private int noCategorie;
	private String libelle;
	private List<ArticleVendu> categorieArticle = new ArrayList<>();
	
	//getters et setters
	public int getNoCategorie() {
		return noCategorie;
	}
	public void setNoCategorie(int noCategorie) {
		this.noCategorie = noCategorie;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public List<ArticleVendu> getCategorieArticle() {
		return categorieArticle;
	}
	public void setCategorieArticle(List<ArticleVendu> categorieArticle) {
		this.categorieArticle = categorieArticle;
	}

	
	//constructeurs
	public Categorie(int noCategorie, String libelle, List<ArticleVendu> categorieArticle) {
		super();
		this.noCategorie = noCategorie;
		this.libelle = libelle;
		this.categorieArticle = categorieArticle;
	}
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Categorie(int noCategorie, String libelle) {
		super();
		this.noCategorie = noCategorie;
		this.libelle = libelle;
	}
	
	

	
}
