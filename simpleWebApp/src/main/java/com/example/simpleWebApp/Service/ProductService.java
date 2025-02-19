package com.example.simpleWebApp.Service;

import com.example.simpleWebApp.Model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

	private final List<Product> products;

	public ProductService() {
		products = Arrays.asList(
				new Product(00, "Product 1", 100, 1000),
				new Product(01, "Product 2", 200, 2000),
				new Product(02, "Product 3", 300, 3000),
				new Product(03, "Product 4", 400, 4000)
		);
	}

	public List<Product> getProducts() {
		return products;
	}
}
