package fr.alma.soa.boutique.domaine.service.impl;

import java.util.ArrayList;
import java.util.List;

import fr.alma.soa.boutique.domaine.factory.DtoModelFactory;
import fr.alma.soa.boutique.domaine.factory.ModelFactory;
import fr.alma.soa.boutique.domaine.model.Category;
import fr.alma.soa.boutique.domaine.model.Customer;
import fr.alma.soa.boutique.domaine.model.dto.CategoryDto;
import fr.alma.soa.boutique.domaine.model.dto.CustomerDto;
import fr.alma.soa.boutique.domaine.service.CustomerService;
import fr.alma.soa.boutique.infra.repository.CategoryRepo;
import fr.alma.soa.boutique.infra.repository.CustomerRepo;

public class CustomerServiceImpl implements CustomerService{
	
	private CustomerRepo customerRepo;
	private ModelFactory modelFactory;
	private DtoModelFactory dtoModelFactory;
	
	public void setCustomerRepo(CustomerRepo customerRepo) {
		this.customerRepo = customerRepo;
	}

	public void setModelFactory(ModelFactory modelFactory) {
		this.modelFactory = modelFactory;
	}
	
	public void setDtoModelFactory(DtoModelFactory dtoModelFactory) {
		this.dtoModelFactory = dtoModelFactory;
	}

	public List<CustomerDto> getCustomers() {
		List<CustomerDto> customers = new ArrayList<CustomerDto>();
		for(Customer c : customerRepo.getCustomers()){
			customers.add(dtoModelFactory.getCustomerInstance(c));
		}
		return customers;
	}

	public CustomerDto getCustomerByEmail(String email) {
		
		return dtoModelFactory.getCustomerInstance(customerRepo.getCustomerByEmail(email));
	}

}
