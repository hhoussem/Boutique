package fr.alma.soa.boutique.infra.repository;

import fr.alma.soa.boutique.domaine.model.Customer;
import fr.alma.soa.boutique.domaine.model.Product;

public interface ShoppingCartRepo {
	
	public void addProductToCart(Customer customer,Product product, int quantity);
	
	public void removeProductFromCart(Customer customer,Product product);
	
	public void updateProductQtyFromCart(Customer customer,Product product, int quantity);
	
	
}
