package com.batur.theblogproject.myblog.controller.admin;

import com.batur.theblogproject.myblog.model.Article;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ArticleController {

    //Get all articles
    @GetMapping("admin/article")
    public List<Article> getPosts() {

        Article article = new Article();
        article.setTitle("asasasasaasas");
        article.setId(1);

        Article article1 = new Article();
        article1.setTitle("fdfdfdfddffdf");
        article1.setId(2);

        return new ArrayList<>(Arrays.asList(article, article1));
    }

    //Get article
    @GetMapping("admin/article/{id}")
    public Article getArticle(@PathVariable int id) {

        Article article = new Article();
        article.setTitle("asasasasaasas");
        article.setId(1);

        return article;

    }

    @PostMapping("admin/article")
    public ArrayList<Article> addArticle(@RequestBody Article article2){

        Article article = new Article();
        article.setId(1);
        article.setTitle("Title");
        article.setBody("Body");

        Article article1 = new Article();
        article1.setId(2);
        article1.setTitle("Title1");
        article1.setBody("Body1");

        ArrayList<Article> articleArrayList = new ArrayList<Article>(Arrays.asList(article,article1));

        articleArrayList.add(article2);

        return articleArrayList;
    }

    @PutMapping("admin/article/{id}")
    public ArrayList<Article> editArticle(@RequestBody Article article2, @PathVariable int id){

        Article article = new Article();
        article.setId(1);
        article.setTitle("Title");
        article.setBody("Body");

        Article article1 = new Article();
        article1.setId(2);
        article1.setTitle("Title1");
        article1.setBody("Body1");

        article1 = article2;

        ArrayList<Article> articleArrayList = new ArrayList<Article>(Arrays.asList(article,article1));

        return articleArrayList;
    }

    @DeleteMapping("admin/article/{id}")
    public ArrayList<Article> editArticle(@PathVariable int id){

        Article article = new Article();
        article.setId(1);
        article.setTitle("Title");
        article.setBody("Body");

        Article article1 = new Article();
        article1.setId(2);
        article1.setTitle("Title1");
        article1.setBody("Body1");

        ArrayList<Article> articleArrayList = new ArrayList<Article>(Arrays.asList(article,article1));

        articleArrayList.remove(id);

        return articleArrayList;
    }


}


