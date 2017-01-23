package fr.uvsq.datasclale.modele;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CoordBancaires")
public class CoordBancaire {

    @Id
    @GeneratedValue
    @Column
    private int idCoordBancaire;

    @Column
    private String numero;

    @Column
    private int cryptogramme;

    public int getIdCoordBancaire() {
	return idCoordBancaire;
    }

    public void setIdCoordBancaire(int idCoordBancaire) {
	this.idCoordBancaire = idCoordBancaire;
    }

    public String getNumero() {
	return numero;
    }

    public void setNumero(String numero) {
	this.numero = numero;
    }

    public int getCryptogramme() {
	return cryptogramme;
    }

    public void setCryptogramme(int cryptogramme) {
	this.cryptogramme = cryptogramme;
    }

    public CoordBancaire(int idCoordBancaire, String numero, int cryptogramme) {
	super();
	this.idCoordBancaire = idCoordBancaire;
	this.numero = numero;
	this.cryptogramme = cryptogramme;
    }

    public CoordBancaire() {
	super();
	// TODO Auto-generated constructor stub
    }
}
