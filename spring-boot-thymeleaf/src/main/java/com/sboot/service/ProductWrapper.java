package com.sboot.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sboot.model.Product;

public class ProductWrapper implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet res, int rowNum) throws SQLException {
		Product prod = new Product();
		prod.setId(res.getLong("id"));
		prod.setBrandName(res.getString("brand"));
		prod.setProductName(res.getString("product_name"));
		prod.setPrice(res.getDouble("price"));
		return prod;
	}

}
