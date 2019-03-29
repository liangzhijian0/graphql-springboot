package com.example.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphql.GenderEnum;
import com.example.graphql.po.Article;
import com.example.graphql.po.User;
import com.example.graphql.repository.ArticleRepository;
import com.example.graphql.repository.UserRepository;

public class Mutation implements GraphQLMutationResolver {
    private UserRepository userRepository;
    private ArticleRepository articleRepository;

    public Mutation(UserRepository userRepository, ArticleRepository articleRepository) {
        this.userRepository = userRepository;
        this.articleRepository = articleRepository;
    }

    public User createUser(String name, Integer age, GenderEnum gender, Article article) {
        if (article != null) {
            articleRepository.save(article);
        }
        User user = new User(name, age, gender, article);
        userRepository.save(user);
        return user;
    }

    public User updateUser(String id, User newUser) {
        User user = userRepository.findById(id);
        if (user == null) {
            return null;
        }
        if (newUser.getName() != null) {
            user.setName(newUser.getName());
        }
        if (newUser.getAge() != null) {
            user.setAge(newUser.getAge());
        }
        if (newUser.getGender() != null) {
            user.setGender(newUser.getGender());
        }
        userRepository.save(user);
        return user;
    }

    public User deleteUser(String id){
        User user = userRepository.findById(id);
        userRepository.delete(id);
        return user;
    }
}
