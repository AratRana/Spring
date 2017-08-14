package com.sboot.controller;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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

	@PostMapping("/save")
	public void updateProduct(@ModelAttribute Product product, HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		productService.update(product);
		response.sendRedirect("/");
	}

	@GetMapping("/newProduct")
	public String newProduct(HttpServletRequest request) {
		request.setAttribute("mode", "PD_NEW");
		return "index";
	}

	@GetMapping("/delete")
	public void deleteProduct(@RequestParam Long id, HttpServletResponse response) throws IOException {
		productService.deletProduct(id);
		response.sendRedirect("/");
	}
}
