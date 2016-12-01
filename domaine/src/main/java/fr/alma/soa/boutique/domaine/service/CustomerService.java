package fr.alma.soa.boutique.domaine.service;

import java.util.List;


import fr.alma.soa.boutique.domaine.model.dto.CustomerDto;

public interface CustomerService {

	public List<CustomerDto> getCustomers();

	public CustomerDto getCustomerByEmail(String email);
	
}
