package fr.uvsq.datasclale.modele;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
    private float prixTotal;

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

    public float getPrixTotal() {
	return prixTotal;
    }

    public void setPrixTotal(float prixTotal) {
	this.prixTotal = prixTotal;
    }

    public Panier(int idPannier, int nbArticle, float prixTotal) {
	super();
	this.idPannier = idPannier;
	this.nbArticle = nbArticle;
	this.prixTotal = prixTotal;
    }

    public Panier() {
	super();
	// TODO Auto-generated constructor stub
    }

}
