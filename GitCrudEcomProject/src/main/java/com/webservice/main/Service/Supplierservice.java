package com.webservice.main.Service;

import java.util.List;

import com.webservice.main.model.Supplier;

public interface Supplierservice {

	Supplier addpro(Supplier s);

	List<Supplier> getallsupp();

	Supplier getsinglesupp(int id);

	Supplier addsupp(Supplier po);

	

	void deletesupp(int pid);

}
