package com.webservice.main.Serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.webservice.main.Service.homeService;
import com.webservice.main.model.Product;
import com.webservice.main.repository.HomeRepositoryproduct;

public class Homeserviceimpl implements homeService
{
	@Autowired
	HomeRepositoryproduct hp;

	@Override
	public Product addpro(Product p) {
		Product product=hp.save(p);
		return product;
	}

	@Override
	public List<Product> getallpro() {
		List<Product> pro=hp.findAll();
		return pro;
	}

	@Override
	public Product getsinglepro(int id) {
		Product product=hp.findById(id);
		return product;
	}

	@Override
	public void deletepro(int pid) {
		hp.deleteById(pid);
		
	}

}
