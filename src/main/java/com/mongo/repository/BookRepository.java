package com.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.model.book;

public interface BookRepository extends MongoRepository<book,Integer>{
	
}
