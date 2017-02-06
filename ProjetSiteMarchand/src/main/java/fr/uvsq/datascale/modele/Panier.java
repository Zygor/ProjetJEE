package fr.uvsq.datascale.modele;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Paniers")
public class Panier {

	@Id
	@GeneratedValue
	@Column
	private int idPannier;
	@Column
	private int nbArticle;
	@Column
	private double prixTotal;

	/*@OneToOne(cascade = CascadeType.ALL) 
	private Client panierClient;*/


	@OneToMany(cascade = CascadeType.ALL)
	private Set<Article> ensembleArticles;

	

	public Set<Article> getEnsembleArticles() {
		return ensembleArticles;
	}

	public void setEnsembleArticles(Set<Article> ensembleArticles) {
		this.ensembleArticles = ensembleArticles;
	}

	public int getIdPannier() {
		return idPannier;
	}

	public void setIdPannier(int idPannier) {
		this.idPannier = idPannier;
	}

	public int getNbArticle() {
		return nbArticle;
	}

	public void setNbArticle(int nbArticle) {
		this.nbArticle = nbArticle;
	}

	public double getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(double prixTotal) {
		this.prixTotal = prixTotal;
	}
	/*public Client getPanierClient() {
		return panierClient;
	}

	public void setPanierClient(Client panierClient) {
		this.panierClient = panierClient;
	}*/

	public Panier(int idPannier, int nbArticle, double prixTotal) {
		super();
		this.idPannier = idPannier;
		this.nbArticle = nbArticle;
		this.prixTotal = prixTotal;
		//this.client = cl ;
	}

	public Panier() {
		super();
		// TODO Auto-generated constructor stub
	}

}
