package fr.uvsq.datascale.modele;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Factures")
public class Facture {

    @Id
    @GeneratedValue
    @Column
    private int idFacture;
    @Column
    private String description;
    @OneToOne
    private Adresse adresse;

    public int getIdFacture() {
	return idFacture;
    }

    public void setIdFacture(int idFacture) {
	this.idFacture = idFacture;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public Adresse getAdresse() {
	return adresse;
    }

    public void setAdresse(Adresse adresse) {
	this.adresse = adresse;
    }

    public Facture(int idFacture, String description, Adresse adresse) {
	super();
	this.idFacture = idFacture;
	this.description = description;
	this.adresse = adresse;
    }

    public Facture() {
	super();
	// TODO Auto-generated constructor stub
    }

}
