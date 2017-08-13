package com.sboot.controller;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sboot.model.Product;
import com.sboot.service.ProductService;

@Controller
public class MainController {

	@Autowired
	private ProductService productService;

	@GetMapping("/")
	public String index(HttpServletRequest request) {
		request.setAttribute("mode", "PD_VIEW");
		Collection<Product> products = productService.findAll();
		request.setAttribute("products", products);
		return "index";
	}
	
	@GetMapping("/editProduct")
	public String editProduct(@RequestParam Long id, HttpServletRequest request) {
		request.setAttribute("product", productService.findOne(id));
		request.setAttribute("mode", "PD_EDIT");
		return "index";
	}
}
