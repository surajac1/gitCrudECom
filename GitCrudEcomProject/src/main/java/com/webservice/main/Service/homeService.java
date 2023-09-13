package com.webservice.main.Service;

import java.util.List;

import com.webservice.main.model.Product;

public interface homeService {

	Product addpro(Product p);

	List<Product> getallpro();

	Product getsinglepro(int id);

	void deletepro(int pid);

}
