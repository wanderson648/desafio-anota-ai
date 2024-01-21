package com.wo.desafioanotaai.repositories;

import com.wo.desafioanotaai.domain.product.Product;
import jdk.jfr.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
}


