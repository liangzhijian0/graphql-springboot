package com.example.graphql.repository;

import com.example.graphql.po.Article;
import com.example.graphql.po.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArticleRepository extends MongoRepository<Article, String> {

}
