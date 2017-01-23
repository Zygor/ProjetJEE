package fr.uvsq.datascale.modele;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Livraisons")
public class Livraison {

    @Id
    @GeneratedValue
    @Column
    private int idLivraison;
    @Column
    private Date datePrevue;
    @Column
    private String statutLivraison;
    @OneToOne(cascade = CascadeType.ALL)
    private TypeLivraison typeLivraison;

    public int getIdLivraison() {
	return idLivraison;
    }

    public void setIdLivraison(int idLivraison) {
	this.idLivraison = idLivraison;
    }

    public Date getDatePrevue() {
	return datePrevue;
    }

    public void setDatePrevue(Date datePrevue) {
	this.datePrevue = datePrevue;
    }

    public String getStatutLivraison() {
	return statutLivraison;
    }

    public void setStatutLivraison(String statutLivraison) {
	this.statutLivraison = statutLivraison;
    }

    public TypeLivraison getTypeLivraison() {
	return typeLivraison;
    }

    public void setTypeLivraison(TypeLivraison typeLivraison) {
	this.typeLivraison = typeLivraison;
    }

    public Livraison(int idLivraison, Date datePrevue, String statutLivraison, TypeLivraison typeLivraison) {
	super();
	this.idLivraison = idLivraison;
	this.datePrevue = datePrevue;
	this.statutLivraison = statutLivraison;
	this.typeLivraison = typeLivraison;
    }

    public Livraison() {
	super();
	// TODO Auto-generated constructor stub
    }

}
