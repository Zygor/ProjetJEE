package fr.uvsq.datasclale.modele;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AvisClients")
public class AvisClient {

    @Id
    @OneToOne
    private Client client;
    @Id
    @OneToOne
    private Article article;
    @Column
    private Date dateDuPost;
    @Column
    private String commentaire;
}
