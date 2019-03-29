package com.example.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphql.po.User;
import com.example.graphql.repository.UserRepository;

public class Query implements GraphQLQueryResolver {
    private UserRepository userRepository;

    public Query(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<User> users() {
        return userRepository.findAll();
    }

    public long countAuthors() {
        return userRepository.count();
    }

    public User findUserById(String id){
        return userRepository.findById(id);
    }

    public Iterable<User> findUserByName(String lastName){
        return userRepository.findByName(lastName);
    }
}

