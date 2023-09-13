package com.webservice.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;import org.springframework.web.servlet.mvc.condition.ProducesRequestCondition;

import com.webservice.main.Service.homeService;
import com.webservice.main.model.Product;

@RestController
public class HomeController {

	@Autowired
	
	homeService hs;
	
	
	@PostMapping("/addpro")
	public ResponseEntity<Product> addpro(@RequestBody Product p){
		
		Product product = hs.addpro(p);
		
		return new ResponseEntity<Product>(product, HttpStatus.CREATED);
		
		
		
	}
	
	@GetMapping("/getallpro")
	public ResponseEntity<List<Product>> getallpro(){
		
		List<Product> pro = hs.getallpro();
		
		return new ResponseEntity<List<Product>>(pro, HttpStatus.OK);
		
	}
	
	@GetMapping("/getsinglepro/{product_id}")
	public ResponseEntity<Product> getsinglepro(@PathVariable("product_id")int id){
		
		Product pr = hs.getsinglepro(id);
		
		return new ResponseEntity<Product>(pr, HttpStatus.OK);
		
	}
	
	@PutMapping("/updatepro")
	public ResponseEntity<Product> updatepro(@RequestBody Product po)
	{
		
         Product pct = hs.addpro(po);
		
		return new ResponseEntity<Product>(pct, HttpStatus.CREATED);
		
		
		
	}
	
	@DeleteMapping("/deletepro/{product_id}")
	public ResponseEntity<String> deletepro(@PathVariable("product_id")int pid){
		
		hs.deletepro(pid);
		
		return new ResponseEntity<String>("product deleted successfully....", HttpStatus.OK);
		
	}
	
}
