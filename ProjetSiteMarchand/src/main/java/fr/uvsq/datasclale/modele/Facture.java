package fr.uvsq.datasclale.modele;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Factures")
public class Facture {

    @Id
    @GeneratedValue
    @Column
    private int idFacture;
    @Column
    private Date dateCommande;
    @OneToOne
    private Adresse adresse;
}
