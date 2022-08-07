package com.arat.multitenant.tenant.repository;

import com.arat.multitenant.tenant.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author arat
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
