package fr.alma.soa.boutique.infra.repository;

import fr.alma.soa.boutique.domaine.model.Customer;
import fr.alma.soa.boutique.domaine.model.Product;
import fr.alma.soa.boutique.domaine.model.ShoppingCart;

public interface ShoppingCartRepo {
	
	public ShoppingCart addProductToCart(Customer customer,Product product, int quantity);
	
	public ShoppingCart removeProductFromCart(Customer customer,Product product);
	
	public ShoppingCart updateProductQtyFromCart(Customer customer,Product product, int quantity);
	
	
}
