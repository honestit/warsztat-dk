package pl.coderslab.webinar.web;

import lombok.Data;

@Data
public class Article {

    private final String title;
    private final String url;
    private final String content;
}
