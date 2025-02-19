package com.example.simpleWebApp.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Product {

	private int id;
	private String name;
	private int price;
	private int quantity;
}
