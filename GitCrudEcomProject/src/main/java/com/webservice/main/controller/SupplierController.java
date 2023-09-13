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
import org.springframework.web.bind.annotation.RestController;

import com.webservice.main.Service.Supplierservice;


import com.webservice.main.model.Supplier;

@RestController
public class SupplierController {

	
	@Autowired
	
	Supplierservice ss;
	
	
	@PostMapping("/addsupp")
	public ResponseEntity<Supplier> addsupp(@RequestBody Supplier s){
		
		Supplier sup = ss.addsupp(s);
		
		return new ResponseEntity<Supplier>(sup, HttpStatus.CREATED);
		
		
		
	}
	
	@GetMapping("/getallsupp")
	public ResponseEntity<List<Supplier>> getallsupp(){
		
		List<Supplier> pro = ss.getallsupp();
		
		return new ResponseEntity<List<Supplier>>(pro, HttpStatus.OK);
		
	}
	
	@GetMapping("/getsinglesupp/{supplier_id}")
	public ResponseEntity<Supplier> getsinglesupp(@PathVariable("supplier_id")int id){
		
		Supplier pr = ss.getsinglesupp(id);
		
		return new ResponseEntity<Supplier>(pr, HttpStatus.OK);
		
	}
	
	@PutMapping("/updatesupp")
	public ResponseEntity<Supplier> updatepro(@RequestBody Supplier po)
	{
		
         Supplier pct = ss.addsupp(po);
		
		return new ResponseEntity<Supplier>(pct, HttpStatus.CREATED);
		
		
		
	}
	
	@DeleteMapping("/deletesupp/{supplier_id}")
	public ResponseEntity<String> deletepro(@PathVariable("supplier_id")int pid){
		
		String p = ss.deletepro(pid);
		
		return new ResponseEntity<String>("supplier deleted successfully....", HttpStatus.OK);
		
	}
}
