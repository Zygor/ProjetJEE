package dao;

import modele.Article;

public interface ArticleHome extends Home<Article> {
    int findPrix(String nom);
}
