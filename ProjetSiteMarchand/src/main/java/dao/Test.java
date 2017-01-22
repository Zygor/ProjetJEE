package dao;

import modele.Article;

public class Test {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	// ConnectBd con = ConnectBd.getInstance();
	ArticleDAO a = new ArticleDAO();
	Article art = a.findById(1);
	System.out.println(art.getNom());
	System.out.println(art.getPrix());

    }

}
