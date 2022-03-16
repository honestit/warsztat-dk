package pl.coderslab.webinar.console;

public class ArticlePrinter {

    public static void printArticle(Article article) {
        System.out.println(article.getTitle());
        System.out.println(article.getUrl());
        if (article.getContent().length() <= 120) {
            System.out.println(article.getContent());
        } else {
            System.out.println(article.getContent().substring(0, 120));
        }
    }
}
