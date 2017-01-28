package fr.uvsq.datascale.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import fr.uvsq.datascale.modele.Article;
import fr.uvsq.datascale.modele.Categorie;


public class ArticleDAO implements ArticleHome {

	@Override
	public void insert(Article nouveau) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Article amodifier) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Article findByld(int id) {


		return null ;
	}


@Override
public Article findByKeyWord(String KeyWord) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Article findByCategorie(Categorie cg) {
	// TODO Auto-generated method stub
	return null;
}

}
