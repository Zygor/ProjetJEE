package fr.uvsq.datasclale.modele;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Promotions")
public class TypeLivraison {

    @Id
    @GeneratedValue
    @Column
    private int idTypeLivraison;
    @Column
    private String nomTypeLivraison;
    @Column
    private boolean rapide;
    @Column
    private float fraisLivraison;

    public int getIdTypeLivraison() {
	return idTypeLivraison;
    }

    public void setIdTypeLivraison(int idTypeLivraison) {
	this.idTypeLivraison = idTypeLivraison;
    }

    public String getNomTypeLivraison() {
	return nomTypeLivraison;
    }

    public void setNomTypeLivraison(String nomTypeLivraison) {
	this.nomTypeLivraison = nomTypeLivraison;
    }

    public boolean isRapide() {
	return rapide;
    }

    public void setRapide(boolean rapide) {
	this.rapide = rapide;
    }

    public float getFraisLivraison() {
	return fraisLivraison;
    }

    public void setFraisLivraison(float fraisLivraison) {
	this.fraisLivraison = fraisLivraison;
    }

    public TypeLivraison(int idTypeLivraison, String nomTypeLivraison, boolean rapide, float fraisLivraison) {
	super();
	this.idTypeLivraison = idTypeLivraison;
	this.nomTypeLivraison = nomTypeLivraison;
	this.rapide = rapide;
	this.fraisLivraison = fraisLivraison;
    }

    public TypeLivraison() {
	super();
	// TODO Auto-generated constructor stub
    }

}
