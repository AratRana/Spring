package com.sboot.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sboot.model.Product;
import com.sboot.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public Collection<Product> findAll() {
		return (Collection<Product>) productRepository.findAll();
	}

	public Product findOne(Long id) {
		return productRepository.findOne(id);
	}

	public void update(Product product) {
		productRepository.save(product);
	}

}
