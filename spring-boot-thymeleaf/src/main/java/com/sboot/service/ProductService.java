package com.sboot.service;

import java.util.Collection;
/*import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
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

	public void deletProduct(Long id) {
		productRepository.delete(id);
	}

	/*
	 * With jdbcTemplate
	 */

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Product findById(Long id) {
		return jdbcTemplate.query("select *from product where id=?", new Object[] { id }, new ProductWrapper()).get(0);
	}
}
