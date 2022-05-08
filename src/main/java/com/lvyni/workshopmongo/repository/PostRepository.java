package com.lvyni.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lvyni.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository< Post, String> {

}
