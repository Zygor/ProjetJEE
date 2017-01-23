package fr.uvsq.datasclale.modele;

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
}
