package com.pack.sravani.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pack.sravani.model.Customer;
import com.pack.sravani.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerservice;
	
	@PostMapping("/add")
	public Customer addCustomer(@RequestBody Customer customer) {
		
		return customerservice.addCustomer(customer);
	}
	
	@GetMapping("/fetch")
	public List<Customer> getAllCustomers(){
		return customerservice.getAllCustomers();
		}
	
	@GetMapping("/fetch/{custId}")
	public Customer getCustomerById(@PathVariable int custId) {
		return customerservice.getCustomerById(custId);
	}
	
	@PutMapping("/update")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return customerservice.updateCustomer(customer);
	}
	
	
	
	
	
	

}
