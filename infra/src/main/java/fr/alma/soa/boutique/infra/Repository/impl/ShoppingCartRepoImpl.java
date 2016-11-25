package fr.alma.soa.boutique.infra.Repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.alma.soa.boutique.domaine.factory.ModelFactory;
import fr.alma.soa.boutique.domaine.model.ICustomer;
import fr.alma.soa.boutique.domaine.model.IProduct;
import fr.alma.soa.boutique.infra.Database;
import fr.alma.soa.boutique.infra.repository.ShoppingCartRepo;

@Repository
public class ShoppingCartRepoImpl implements ShoppingCartRepo{
	

	@Autowired
	private ModelFactory modelFactory;
	
	@Autowired
	private Database database;
	
	public void addProductToCart(ICustomer customer, IProduct product, int quantity) {
		database.getCustomers().get(customer).getShoppingCart().addProduct(product, quantity);
		
	}

	public void removeProductFromCart(ICustomer customer, IProduct product) {
		database.getCustomers().get(customer).getShoppingCart().removeProduct(product);
		
	}

	public void updateProductQtyFromCart(ICustomer customer, IProduct product, int quantity) {
		database.getCustomers().get(customer).getShoppingCart().addProduct(product,quantity);
		
	}

}
