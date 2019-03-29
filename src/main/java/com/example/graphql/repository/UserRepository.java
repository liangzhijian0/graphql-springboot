package com.example.graphql.repository;

import com.example.graphql.po.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends MongoRepository<User, String> {

    User findById(String id);

    Iterable<User> findByName(String lastName);
}
