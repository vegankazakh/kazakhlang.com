package com.kazakhlang.website.service;

import com.kazakhlang.website.entity.Article;
import com.kazakhlang.website.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> getAllArticles(){
        return articleRepository.findAll();
    }

    public Optional<Article> getArticleById(Long id){
        return articleRepository.findById(id);
    }

    public void saveArticle(Article article){
//        Article article = new Article();
//        article.setTitle("My new article on Kazakh punctuation");
        articleRepository.save(article);
    }

}
