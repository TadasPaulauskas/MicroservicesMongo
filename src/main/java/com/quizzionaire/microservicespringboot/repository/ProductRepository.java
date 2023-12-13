package com.quizzionaire.microservicespringboot.repository;

import com.quizzionaire.microservicespringboot.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
