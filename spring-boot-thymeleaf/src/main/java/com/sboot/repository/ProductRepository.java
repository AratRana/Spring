package com.sboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sboot.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}
