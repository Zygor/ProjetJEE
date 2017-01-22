package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

import modele.Article;

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
    public Article findById(int id) {
	Article art = new Article("", 1);
	try {
	    Connection connnect = ConnectBd.getConnect();
	    Statement stmt = connnect.createStatement();
	    ResultSet res = stmt.executeQuery("select * from article where id = " + id);
	    res.next();
	    art.setNom(res.getString("nom"));
	    art.setPrix(res.getInt("prix"));
	} catch (SQLException e) {
	}
	return art;
    }

    @Override
    public boolean upDate(Article a) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public Map<Integer, Article> findAll() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public int findPrix(String nom) {
	// TODO Auto-generated method stub
	return 0;
    }

}
