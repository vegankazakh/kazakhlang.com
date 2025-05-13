package com.kazakhlang.website.controller;

import com.kazakhlang.website.entity.Article;
import com.kazakhlang.website.service.ArticleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/list", method = RequestMethod.GET)
public class ArticleListController {

    private ArticleService articleService;

    @GetMapping
    public List<Article> getArticles() {
        return articleService.getAllArticles();
    }

}
