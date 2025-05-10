package com.kazakhlang.website;


import com.kazakhlang.website.entity.Article;
import com.kazakhlang.website.repository.ArticleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebsiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebsiteApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(ArticleRepository repository) {
        return (args) -> {
            // Save a new article
            Article article = new Article();
            article.setTitle("Test Article");
            repository.save(article);

            // Fetch all articles
            repository.findAll().forEach(a -> System.out.println("Found Article: " + a.getTitle()));
        };
    }

}
