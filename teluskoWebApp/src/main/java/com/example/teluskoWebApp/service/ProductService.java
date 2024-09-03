   package com.example.teluskoWebApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.teluskoWebApp.model.Product;
import com.example.teluskoWebApp.repository.ProductRepo;

@Service
public class ProductService {
	@Autowired
	ProductRepo repo;
	
	List<Product> products=new ArrayList<>(Arrays.asList(
			new Product(101,"Iphone",50000),
	        new Product(102,"Samsung",40000),
		    new Product(103,"Google",30000)));
	
	
	public List<Product>getProducts(){
		return repo.findAll();
	}
	
	
	public Product getProductById(int prodId) {
		return repo.findById(prodId).orElse(new Product());
		
	}
	
	public void addProduct(Product prod) {
		repo.save(prod);
	}


	public void updateProduct(Product prod) {
		repo.save(prod);
		
	}


	public void deleteProductById(int prodId) {
		repo.deleteById(prodId);
	}
	
	

}
