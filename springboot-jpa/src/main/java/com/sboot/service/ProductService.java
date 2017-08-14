package com.sboot.service;

import java.util.Collection;
/*import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sboot.model.Product;
import com.sboot.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	/*@Autowired
	private EntityManagerFactory entityManagerFactory;*/

	public Collection<Product> findAll() {
		return (Collection<Product>) productRepository.findAll();
	}

	public Product findOne(Long id) {
		return productRepository.findOne(id);
		/*EntityManager entityManager = entityManagerFactory.createEntityManager();
		Product prod = new Product();
		Object[] obj = (Object[]) entityManager.createNativeQuery("Select *from product where id=:id").setParameter("id", id).getSingleResult();
		prod.setId(Long.parseLong(obj[0].toString()));
		prod.setBrandName(obj[1].toString());
		prod.setProductName(obj[3].toString());
		prod.setPrice(Double.parseDouble(obj[2].toString()));
		return prod;*/
	}

	public void update(Product product) {
		productRepository.save(product);
	}

	public void deletProduct(Long id) {
		productRepository.delete(id);
	}

}
