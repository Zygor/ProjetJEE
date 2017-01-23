package fr.uvsq.datasclale.modele;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Categories")
public class Categorie {

    @Id
    @GeneratedValue
    @Column
    private int idCategorie;
    @Column
    private String nomCategorie;
    @Column
    private String descriptionCategorie;

    public int getIdCategorie() {
	return idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
	this.idCategorie = idCategorie;
    }

    public String getNomCategorie() {
	return nomCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
	this.nomCategorie = nomCategorie;
    }

    public String getDescriptionCategorie() {
	return descriptionCategorie;
    }

    public void setDescriptionCategorie(String descriptionCategorie) {
	this.descriptionCategorie = descriptionCategorie;
    }

    public Categorie(int idCategorie, String nomCategorie, String descriptionCategorie) {
	super();
	this.idCategorie = idCategorie;
	this.nomCategorie = nomCategorie;
	this.descriptionCategorie = descriptionCategorie;
    }

    public Categorie() {
	super();
	// TODO Auto-generated constructor stub
    }

}
