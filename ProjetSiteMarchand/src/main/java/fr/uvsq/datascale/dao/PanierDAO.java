package fr.uvsq.datascale.dao;

public class PanierDAO implements PanierHome {

	@Override
	public boolean update(fr.uvsq.datasclale.modele.Panier amodifier) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void insert(fr.uvsq.datasclale.modele.Panier nouveau) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean AjouterArticle(int idArticle) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean SupprimerArticle(int idArticle) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Augmenter_nombre_Article(int idArticle) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Diminuer_nombre_Article(int idArticle) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ViderPanier(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public fr.uvsq.datasclale.modele.Panier findByld(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public fr.uvsq.datasclale.modele.Panier findByldClient(int idClient) {
		// TODO Auto-generated method stub
		return null;
	}

}
