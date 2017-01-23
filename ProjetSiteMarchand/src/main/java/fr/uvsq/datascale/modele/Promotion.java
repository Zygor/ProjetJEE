package fr.uvsq.datascale.modele;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Promotions")
public class Promotion {

    @Id
    @GeneratedValue
    @Column
    private int idPromo;
    @Column
    private Date dateDebut;
    @Column
    private Date dateFin;
    @Column
    private int remise;
    @OneToMany
    private Set<Article> articles;

    public int getIdPromo() {
	return idPromo;
    }

    public void setIdPromo(int idPromo) {
	this.idPromo = idPromo;
    }

    public Date getDateDebut() {
	return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
	this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
	return dateFin;
    }

    public void setDateFin(Date dateFin) {
	this.dateFin = dateFin;
    }

    public int getRemise() {
	return remise;
    }

    public void setRemise(int remise) {
	this.remise = remise;
    }

    public Set<Article> getArticles() {
	return articles;
    }

    public void setArticles(Set<Article> articles) {
	this.articles = articles;
    }

    public Promotion(int idPromo, Date dateDebut, Date dateFin, int remise, Set<Article> articles) {
	super();
	this.idPromo = idPromo;
	this.dateDebut = dateDebut;
	this.dateFin = dateFin;
	this.remise = remise;
	this.articles = articles;
    }

    public Promotion() {
	super();
	// TODO Auto-generated constructor stub
    }

}
