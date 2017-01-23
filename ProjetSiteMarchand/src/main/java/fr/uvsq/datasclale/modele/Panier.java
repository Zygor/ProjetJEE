package fr.uvsq.datasclale.modele;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Paniers")
public class Panier {

    @Id
    @GeneratedValue
    @Column
    private int idPannier;
    @Column
    private int nbArticle;
    @Column
    private float prixTotal;
}
