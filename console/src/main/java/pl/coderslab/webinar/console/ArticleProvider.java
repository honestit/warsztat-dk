package pl.coderslab.webinar.console;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArticleProvider {

    public static List<Article> getArticles(int limit) {
        try {
            // Pobieramy całą stronę główną rp.pl
            Document document = Jsoup.connect("https://rp.pl/").get();
            Elements links = document.select("a.contentLink");
            List<Article> articles = new ArrayList<>();
            for (Element link : links) {
                String url = link.attr("href");
                url = url.startsWith("http") ? url : "https://rp.pl" + url;
                String title = link.select("h3").text();
                if (!title.isBlank()) {
                    Element subtitle = Jsoup.connect(url).get().select("p.blog--subtitle").first();
                    if (subtitle != null) {
                        String content = subtitle.text();
                        articles.add(new Article(title, url, content));
                    }
                }
                if (articles.size() >= limit) {
                    return articles;
                }
            }
            return articles;
        } catch (IOException ex) {
            ex.printStackTrace();
            return new ArrayList<>();
        }
    }
}
