package com.webservice.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.main.model.Supplier;

public interface HomeSupplierRepo extends JpaRepository<Supplier, Integer>{

	Supplier findBySupplier_id(int id);

}
