package fr.alma.soa.boutique.infra.Repository.impl;

import java.util.ArrayList;
import java.util.List;

import fr.alma.soa.boutique.domaine.model.Category;
import fr.alma.soa.boutique.domaine.model.Customer;
import fr.alma.soa.boutique.infra.Database;
import fr.alma.soa.boutique.infra.repository.CustomerRepo;

public class CustomerRepoImpl implements CustomerRepo{

	private Database database;
	
	public void setDatabase(Database database) {
		this.database = database;
	}
	
	public Category getCategoryById(int id) {
		return database.getCategories().get(id);
	}
	public List<Customer> getCustomers() {
		
		return new ArrayList<Customer>(database.getCustomers().values());
	}

	public Customer getCustomerByEmail(String email) {
		
		return database.getCustomers().get(email);
	}

}
