package fr.uvsq.datasclale.modele;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Adresses")
public class Adresse {

    @Id
    @GeneratedValue
    @Column
    private int idAdresse;
    @Column
    private String typeAdresse;
    @Column
    private int codePostal;
    @Column
    private String ville;
    @Column
    private String adresse;

    public int getIdAdresse() {
	return idAdresse;
    }

    public void setIdAdresse(int idAdresse) {
	this.idAdresse = idAdresse;
    }

    public String getTypeAdresse() {
	return typeAdresse;
    }

    public void setTypeAdresse(String typeAdresse) {
	this.typeAdresse = typeAdresse;
    }

    public int getCodePostal() {
	return codePostal;
    }

    public void setCodePostal(int codePostal) {
	this.codePostal = codePostal;
    }

    public String getVille() {
	return ville;
    }

    public void setVille(String ville) {
	this.ville = ville;
    }

    public String getAdresse() {
	return adresse;
    }

    public void setAdresse(String adresse) {
	this.adresse = adresse;
    }

    public Adresse(int idAdresse, String typeAdresse, int codePostal, String ville, String adresse) {
	super();
	this.idAdresse = idAdresse;
	this.typeAdresse = typeAdresse;
	this.codePostal = codePostal;
	this.ville = ville;
	this.adresse = adresse;
    }

    public Adresse() {
	super();
	// TODO Auto-generated constructor stub
    }

}
