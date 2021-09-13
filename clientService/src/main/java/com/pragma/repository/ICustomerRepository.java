package com.pragma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pragma.entity.Customer;

import java.util.List;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {

	List<Customer> findByDocumentType(String DocumentType);

	Customer findByNumberOfDocument(int documentNumber);

}
