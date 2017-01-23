package fr.uvsq.datasclale.modele;

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
}
