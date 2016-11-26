package fr.alma.soa.boutique.infra.Repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.alma.soa.boutique.domaine.factory.ModelFactory;
import fr.alma.soa.boutique.domaine.model.Customer;
import fr.alma.soa.boutique.domaine.model.Product;
import fr.alma.soa.boutique.infra.Database;
import fr.alma.soa.boutique.infra.repository.ShoppingCartRepo;

@Repository
public class ShoppingCartRepoImpl implements ShoppingCartRepo{
	

	@Autowired
	private ModelFactory modelFactory;
	
	@Autowired
	private Database database;
	
	public void addProductToCart(Customer customer, Product product, int quantity) {
		database.getCustomers().get(customer).getShoppingCart().addProduct(product, quantity);
		
	}

	public void removeProductFromCart(Customer customer, Product product) {
		database.getCustomers().get(customer).getShoppingCart().removeProduct(product);
		
	}

	public void updateProductQtyFromCart(Customer customer, Product product, int quantity) {
		database.getCustomers().get(customer).getShoppingCart().addProduct(product,quantity);
		
	}

}
