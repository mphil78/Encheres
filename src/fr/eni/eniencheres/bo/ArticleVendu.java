package fr.eni.eniencheres.bo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ArticleVendu {

	//Attributs de classe
	public static final int CREEE=0;
	public static final int ENCOURS=1;
	public static final int TERMINEE=2;
	public static final int RETIREE=3;
	public static final int ANNULEE=4;
	
	//Atrributs d'instance
	private int noArticle;
	private String nomArticle;
	private String description;
	private LocalDate dateDebutEncheres;
	private LocalDate dateFinEncheres;
	private int miseAPrix;
	private int prixVente;
	private int etatVente;
	private Categorie categorie;
	private List<Enchere> listeEncheres = new ArrayList<>();
	private Utilisateur acheteur;
	private Utilisateur vendeur;
	private Retrait lieuRetrait;
	private String urlImage="";
	
	//getters et setters
	public String getUrlImage() {
		return urlImage;
	}
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	public int getNoArticle() {
		return noArticle;
	}
	public void setNoArticle(int noArticle) {
		this.noArticle = noArticle;
	}
	public String getNomArticle() {
		return nomArticle;
	}
	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getDateDebutEncheres() {
		return dateDebutEncheres;
	}
	public void setDateDebutEncheres(LocalDate dateDebutEncheres) {
		this.dateDebutEncheres = dateDebutEncheres;
	}
	public LocalDate getDateFinEncheres() {
		return dateFinEncheres;
	}
	public void setDateFinEncheres(LocalDate dateFinEncheres) {
		this.dateFinEncheres = dateFinEncheres;
	}
	public int getMiseAPrix() {
		return miseAPrix;
	}
	public void setMiseAPrix(int miseAPrix) {
		this.miseAPrix = miseAPrix;
	}
	public int getPrixVente() {
		return prixVente;
	}
	public void setPrixVente(int prixVente) {
		this.prixVente = prixVente;
	}
	public int getEtatVente() {
		return etatVente;
	}
	public void setEtatVente(int etatVente) {
		this.etatVente = etatVente;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public List<Enchere> getListeEncheres() {
		return listeEncheres;
	}
	public void setListeEncheres(List<Enchere> listeEncheres) {
		this.listeEncheres = listeEncheres;
	}
	public Utilisateur getAcheteur() {
		return acheteur;
	}
	public void setAcheteur(Utilisateur acheteur) {
		this.acheteur = acheteur;
	}
	public Utilisateur getVendeur() {
		return vendeur;
	}
	public void setVendeur(Utilisateur vendeur) {
		this.vendeur = vendeur;
	}
	public Retrait getLieuRetrait() {
		return lieuRetrait;
	}
	public void setLieuRetrait(Retrait lieuRetrait) {
		this.lieuRetrait = lieuRetrait;
	}
	
	
	
	//override du toString
	@Override
	public String toString() {
		return "ArticleVendu [noArticle=" + noArticle + ", nomArticle=" + nomArticle + ", description=" + description
				+ ", dateDebutEncheres=" + dateDebutEncheres + ", dateFinEncheres=" + dateFinEncheres + ", miseAPrix="
				+ miseAPrix + ", prixVente=" + prixVente + ", etatVente=" + etatVente + ", categorie=" + categorie
				+ ", listeEncheres=" + listeEncheres + ", acheteur=" + acheteur + ", vendeur=" + vendeur
				+ ", lieuRetrait=" + lieuRetrait + "]";
	}
	
	//constructeurs
	public ArticleVendu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ArticleVendu(int noArticle, String nomArticle, String description, LocalDate dateDebutEncheres,
			LocalDate dateFinEncheres, int miseAPrix, int prixVente, int etatVente, Categorie categorie,
			List<Enchere> listeEncheres, Utilisateur acheteur, Utilisateur vendeur, Retrait lieuRetrait,
			String urlImage) {
		super();
		this.noArticle = noArticle;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.miseAPrix = miseAPrix;
		this.prixVente = prixVente;
		this.etatVente = etatVente;
		this.categorie = categorie;
		this.listeEncheres = listeEncheres;
		this.acheteur = acheteur;
		this.vendeur = vendeur;
		this.lieuRetrait = lieuRetrait;
		this.urlImage = urlImage;
	}
	public ArticleVendu(int noArticle, String nomArticle, String description, LocalDate dateDebutEncheres,
			LocalDate dateFinEncheres, int miseAPrix, int prixVente, int etatVente) {
		super();
		this.noArticle = noArticle;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.miseAPrix = miseAPrix;
		this.prixVente = prixVente;
		this.etatVente = etatVente;
	}

	
	
}
