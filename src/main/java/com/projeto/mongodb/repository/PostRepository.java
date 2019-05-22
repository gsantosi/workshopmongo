package com.projeto.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.projeto.mongodb.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
