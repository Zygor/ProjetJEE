package fr.uvsq.datasclale.modele;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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

    public Promotion(int idPromo, Date dateDebut, Date dateFin, int remise) {
	super();
	this.idPromo = idPromo;
	this.dateDebut = dateDebut;
	this.dateFin = dateFin;
	this.remise = remise;
    }

    public Promotion() {
	super();
	// TODO Auto-generated constructor stub
    }

}
