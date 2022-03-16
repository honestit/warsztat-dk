package pl.coderslab.webinar.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/articles")
public class ArticleController {

    private final ArticleProvider articleProvider;

    public ArticleController(ArticleProvider articleProvider) {
        this.articleProvider = articleProvider;
    }

    @GetMapping
    public String showArticles(Model model) {
        List<Article> articles = articleProvider.getArticles(8);
        List<Article> articlesGroup1 = articles.subList(0, 4);
        List<Article> articlesGroup2 = articles.subList(4, 8);

        model.addAttribute("articlesGroup1", articlesGroup1);
        model.addAttribute("articlesGroup2", articlesGroup2);

        return "articles";
    }
}
