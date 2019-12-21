package fr.eni.eniencheres.bo;

public class Retrait {
	//attributs d'instance
	private String rue;
	private String code_postal;
	private String ville;
	private ArticleVendu articleVendu;
	
	//Getters et setters
	public String getRue() {
		return rue;
	}
	
	public void setRue(String rue) {
		this.rue = rue;
	}
	
	public String getCode_postal() {
		return code_postal;
	}
	
	public void setCode_postal(String code_postal) {
		this.code_postal = code_postal;
	}
	
	public String getVille() {
		return ville;
	}
	
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public ArticleVendu getArticleVendu() {
		return articleVendu;
	}
	
	public void setArticleVendu(ArticleVendu articleVendu) {
		this.articleVendu = articleVendu;
	}
	
	//Constructeurs
	public Retrait(String rue, String code_postal, String ville, ArticleVendu articleVendu) {
		super();
		this.rue = rue;
		this.code_postal = code_postal;
		this.ville = ville;
		this.articleVendu = articleVendu;
			
	}
	
	public Retrait() {
		super();
		
	}
	
	
	
	public Retrait(String rue, String code_postal, String ville) {
		super();
		this.rue = rue;
		this.code_postal = code_postal;
		this.ville = ville;
	}

	//toString
	@Override
	public String toString() {
		return "Retrait [rue=" + rue + ", code_postal=" + code_postal + ", ville=" + ville + ", noArticle=" + articleVendu
				+ "]";
	}
	
}
