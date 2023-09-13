package com.webservice.main.ServiceimplSupp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.webservice.main.Service.Supplierservice;
import com.webservice.main.model.Supplier;
import com.webservice.main.repository.HomeSupplierRepo;

public class HomeServiceimplsupp implements Supplierservice
{
	@Autowired
	HomeSupplierRepo sp;

	@Override
	public Supplier addpro(Supplier s) {
		Supplier supplier=sp.save(s);
		return s;
	}

	@Override
	public List<Supplier> getallsupp() {
		
		return sp.findAll();
	}

	@Override
	public Supplier getsinglesupp(int id) {
		
		return sp.findBySupplier_id(id);
	}

	@Override
	public Supplier addsupp(Supplier po) {
		// TODO Auto-generated method stu
		return sp.save(po);
	}

	@Override
	public void deletesupp(int pid) {
		// TODO Auto-generated method stub
		sp.deleteById(pid);
	}



}
