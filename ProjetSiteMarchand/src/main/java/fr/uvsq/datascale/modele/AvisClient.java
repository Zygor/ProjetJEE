package fr.uvsq.datascale.modele;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AvisClients")
public class AvisClient implements Serializable {

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

    public Client getClient() {
	return client;
    }

    public void setClient(Client client) {
	this.client = client;
    }

    public Article getArticle() {
	return article;
    }

    public void setArticle(Article article) {
	this.article = article;
    }

    public Date getDateDuPost() {
	return dateDuPost;
    }

    public void setDateDuPost(Date dateDuPost) {
	this.dateDuPost = dateDuPost;
    }

    public String getCommentaire() {
	return commentaire;
    }

    public void setCommentaire(String commentaire) {
	this.commentaire = commentaire;
    }

    public AvisClient(Client client, Article article, Date dateDuPost, String commentaire) {
	super();
	this.client = client;
	this.article = article;
	this.dateDuPost = dateDuPost;
	this.commentaire = commentaire;
    }

    public AvisClient() {
	super();
	// TODO Auto-generated constructor stub
    }

}
