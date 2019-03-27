package com.example.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphql.model.Author;
import com.example.graphql.repository.AuthorRepository;

public class Mutation implements GraphQLMutationResolver {
    private AuthorRepository authorRepository;

    public Mutation(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author newAuthor(String firstName, String lastName) {
        Author author = new Author();
        author.setFirstName(firstName);
        author.setLastName(lastName);

        authorRepository.save(author);

        return author;
    }
}
