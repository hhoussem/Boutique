package fr.alma.soa.boutique.infra.repository;

import java.util.List;

import fr.alma.soa.boutique.domaine.model.Customer;

public interface CustomerRepo {

	public List<Customer> getCustomers();
	
	public Customer getCustomerByEmail(String email);
	
}
