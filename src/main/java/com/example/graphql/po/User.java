package com.example.graphql.po;

import com.example.graphql.GenderEnum;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class User {
    @Id
    private String id;
    private String name;
    private Integer age;
    private GenderEnum gender;
    private Article article;

    public User(String name, Integer age, GenderEnum gender, Article article) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.article = article;
    }
}
