package fr.alma.soa.boutique.infra.Repository.impl;


import fr.alma.soa.boutique.domaine.model.Customer;
import fr.alma.soa.boutique.domaine.model.Product;
import fr.alma.soa.boutique.domaine.model.ShoppingCart;
import fr.alma.soa.boutique.infra.Database;
import fr.alma.soa.boutique.infra.repository.ShoppingCartRepo;

public class ShoppingCartRepoImpl implements ShoppingCartRepo{

	
	private Database database;
	
	public void setDatabase(Database database) {
		this.database = database;
	}

	public ShoppingCart addProductToCart(Customer customer, Product product, int quantity) {
		database.getCustomers().get(customer.getEmail()).getShoppingCart().addProduct(product, quantity);
		return database.getCustomers().get(customer.getEmail()).getShoppingCart();
	}

	public ShoppingCart removeProductFromCart(Customer customer, Product product) {
		database.getCustomers().get(customer).getShoppingCart().removeProduct(product);
		return database.getCustomers().get(customer.getEmail()).getShoppingCart();
		
	}

	public ShoppingCart updateProductQtyFromCart(Customer customer, Product product, int quantity) {
		database.getCustomers().get(customer).getShoppingCart().addProduct(product,quantity);
		return database.getCustomers().get(customer.getEmail()).getShoppingCart();
	}

}
