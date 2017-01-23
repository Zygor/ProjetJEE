package fr.uvsq.datascale.modele;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Clients")
public class Client {

    @Id
    @GeneratedValue
    @Column
    private int idClient;
    @Column
    private String nom;
    @Column
    private String prenom;
    @Column
    private String mail;
    @Column
    private String password;
    @Column
    private int telephone;
    @Column
    private int pointDeFidelite;
    @Column
    private String gender;
    @OneToOne(cascade = CascadeType.ALL)
    private Panier panierClient;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Adresse> adressesClient;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<CoordBancaire> coordBancairesClient;

    @OneToMany(mappedBy = "client")
    private Set<Commande> commandesClient;

    public int getIdClient() {
	return idClient;
    }

    public void setIdClient(int idClient) {
	this.idClient = idClient;
    }

    public String getNom() {
	return nom;
    }

    public void setNom(String nom) {
	this.nom = nom;
    }

    public String getPrenom() {
	return prenom;
    }

    public void setPrenom(String prenom) {
	this.prenom = prenom;
    }

    public String getMail() {
	return mail;
    }

    public void setMail(String mail) {
	this.mail = mail;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public int getTelephone() {
	return telephone;
    }

    public void setTelephone(int telephone) {
	this.telephone = telephone;
    }

    public int getPointDeFidelite() {
	return pointDeFidelite;
    }

    public void setPointDeFidelite(int pointDeFidelite) {
	this.pointDeFidelite = pointDeFidelite;
    }

    public String getGender() {
	return gender;
    }

    public void setGender(String gender) {
	this.gender = gender;
    }

    public Panier getPanierClient() {
	return panierClient;
    }

    public void setPanierClient(Panier panierClient) {
	this.panierClient = panierClient;
    }

    public Set<Adresse> getAdressesClient() {
	return adressesClient;
    }

    public void setAdressesClient(Set<Adresse> adressesClient) {
	this.adressesClient = adressesClient;
    }

    public Set<CoordBancaire> getCoordBancairesClient() {
	return coordBancairesClient;
    }

    public void setCoordBancairesClient(Set<CoordBancaire> coordBancairesClient) {
	this.coordBancairesClient = coordBancairesClient;
    }

    public Set<Commande> getCommandesClient() {
	return commandesClient;
    }

    public void setCommandesClient(Set<Commande> commandesClient) {
	this.commandesClient = commandesClient;
    }

    public Client(int idClient, String nom, String prenom, String mail, String password, int telephone,
	    int pointDeFidelite, String gender, Panier panierClient, Set<Adresse> adressesClient,
	    Set<CoordBancaire> coordBancairesClient, Set<Commande> commandesClient) {
	super();
	this.idClient = idClient;
	this.nom = nom;
	this.prenom = prenom;
	this.mail = mail;
	this.password = password;
	this.telephone = telephone;
	this.pointDeFidelite = pointDeFidelite;
	this.gender = gender;
	this.panierClient = panierClient;
	this.adressesClient = adressesClient;
	this.coordBancairesClient = coordBancairesClient;
	this.commandesClient = commandesClient;
    }

    public Client() {
	super();
	// TODO Auto-generated constructor stub
    }

}
