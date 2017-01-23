package fr.uvsq.datasclale.modele;

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
}
