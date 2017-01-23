package fr.uvsq.datasclale.modele;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Promotions")
public class Promotion {

    @Id
    @GeneratedValue
    @Column
    private int idPromo;
    @Column
    private Date dateDebut;
    @Column
    private Date dateFin;
    @Column
    private int remise;
    @OneToMany
    private Set<Article> articles;

}
