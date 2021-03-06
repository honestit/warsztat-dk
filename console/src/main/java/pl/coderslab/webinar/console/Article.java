package pl.coderslab.webinar.console;

public class Article {

    private String title;
    private String url;
    private String content;

    public Article(String title, String url, String content) {
        this.title = title;
        this.url = url;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getContent() {
        return content;
    }
}
