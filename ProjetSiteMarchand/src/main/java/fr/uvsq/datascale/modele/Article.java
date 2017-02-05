package fr.uvsq.datascale.modele;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Articles")
public class Article {

    @Id
    @GeneratedValue
    @Column
    private int idArticle;
    @Column
    private String nom;
    @Column
    private String description;
    @Column
    private float prix;
    @Column
    private boolean disponibilite;
    @ManyToOne(fetch = FetchType.LAZY)
    private Promotion promotion;
    @ManyToOne(cascade = CascadeType.ALL)
    private Categorie categorie;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<AvisClient> avisClients;

    public int getIdArticle() {
	return idArticle;
    }

    public void setIdArticle(int idArticle) {
	this.idArticle = idArticle;
    }

    public String getNom() {
	return nom;
    }

    public void setNom(String nom) {
	this.nom = nom;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public float getPrix() {
	return prix;
    }

    public void setPrix(float prix) {
	this.prix = prix;
    }

    public boolean isDisponibilite() {
	return disponibilite;
    }

    public void setDisponibilite(boolean disponibilite) {
	this.disponibilite = disponibilite;
    }

    public Promotion getPromotion() {
	return promotion;
    }

    public void setPromotion(Promotion promotion) {
	this.promotion = promotion;
    }

    public Categorie getCategorie() {
	return categorie;
    }

    public void setCategorie(Categorie categorie) {
	this.categorie = categorie;
    }

    public Set<AvisClient> getAvisClients() {
	return avisClients;
    }

    public void setAvisClients(Set<AvisClient> avisClients) {
	this.avisClients = avisClients;
    }

    public Article(int idArticle, String nom, String description, float prix, boolean disponibilite,
	    Promotion promotion, Categorie categorie, Set<AvisClient> avisClients) {
	super();
	this.idArticle = idArticle;
	this.nom = nom;
	this.description = description;
	this.prix = prix;
	this.disponibilite = disponibilite;
	this.promotion = promotion;
	this.categorie = categorie;
	this.avisClients = avisClients;
    }

    public Article() {
	super();
	// TODO Auto-generated constructor stub
    }

}
