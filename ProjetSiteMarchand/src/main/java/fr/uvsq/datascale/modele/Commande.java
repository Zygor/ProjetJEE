package fr.uvsq.datascale.modele;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Commandes")
public class Commande {

    @Id
    @GeneratedValue
    @Column
    private int idCommande;
    @Column
    private Date dateCommande;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;
    @OneToOne
    private Facture factureCommande;
    @OneToOne
    private Livraison livraison;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<CoordBancaire> listeArticles;

    public int getIdCommande() {
	return idCommande;
    }

    public void setIdCommande(int idCommande) {
	this.idCommande = idCommande;
    }

    public Date getDateCommande() {
	return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
	this.dateCommande = dateCommande;
    }

    public Client getClient() {
	return client;
    }

    public void setClient(Client client) {
	this.client = client;
    }

    public Facture getFactureCommande() {
	return factureCommande;
    }

    public void setFactureCommande(Facture factureCommande) {
	this.factureCommande = factureCommande;
    }

    public Livraison getLivraison() {
	return livraison;
    }

    public void setLivraison(Livraison livraison) {
	this.livraison = livraison;
    }

    public Set<CoordBancaire> getListeArticles() {
	return listeArticles;
    }

    public void setListeArticles(Set<CoordBancaire> listeArticles) {
	this.listeArticles = listeArticles;
    }

    public Commande(int idCommande, Date dateCommande, Client client, Facture factureCommande, Livraison livraison,
	    Set<CoordBancaire> listeArticles) {
	super();
	this.idCommande = idCommande;
	this.dateCommande = dateCommande;
	this.client = client;
	this.factureCommande = factureCommande;
	this.livraison = livraison;
	this.listeArticles = listeArticles;
    }

    public Commande() {
	super();
	// TODO Auto-generated constructor stub
    }

}
