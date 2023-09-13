package com.webservice.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.main.model.Product;

public interface HomeRepositoryproduct extends JpaRepository<Product, Integer> 
{
	Product findById(int id);

}
