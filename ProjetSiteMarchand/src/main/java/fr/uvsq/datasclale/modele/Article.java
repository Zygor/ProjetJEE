package fr.uvsq.datasclale.modele;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Articles")
public class Article {

    @Id
    @GeneratedValue
    @Column
    private int idArticle;
    @Column
    private String nom;
    @Column
    private String description;
    @Column
    private float prix;
    @Column
    private boolean disponibilite;
    @ManyToOne(fetch = FetchType.LAZY)
    private Promotion promotion;
    @OneToOne(cascade = CascadeType.ALL)
    private Categorie categorie;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<AvisClient> avisClients;

}
