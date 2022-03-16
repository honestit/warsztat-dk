package pl.coderslab.webinar.console;

import java.util.List;

public class ConsoleArticlesApp {

    public static void main(String[] args) {
        List<Article> articles = ArticleProvider.getArticles(8);
        for (Article article : articles) {
            ArticlePrinter.printArticle(article);
        }
    }
}
