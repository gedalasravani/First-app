package com.pack.sravani.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.sravani.model.Customer;
import com.pack.sravani.repo.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
       CustomerRepository customerRepository;

	public Customer addCustomer(Customer customer) {
		
		return customerRepository.save(customer);
	}
	
	
	public List<Customer> getAllCustomers(){
		return customerRepository.findAll();
	}
	
	public  Customer getCustomerById(int custId) {
		return customerRepository.findById(custId).get();
	}
	
	
	public Customer updateCustomer(Customer customer) {

	    Customer cust = customerRepository.findById(customer.getCustId()).get();

	    cust.setCustName(customer.getCustName());
	    cust.setCustAdd(customer.getCustAdd());

	    return customerRepository.save(cust);
	}
}
