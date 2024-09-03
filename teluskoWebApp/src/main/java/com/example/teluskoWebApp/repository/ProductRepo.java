package com.example.teluskoWebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.teluskoWebApp.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

}
