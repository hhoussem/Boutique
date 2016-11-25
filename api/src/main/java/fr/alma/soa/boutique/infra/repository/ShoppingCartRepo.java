package fr.alma.soa.boutique.infra.repository;

import fr.alma.soa.boutique.domaine.model.ICustomer;
import fr.alma.soa.boutique.domaine.model.IProduct;

public interface ShoppingCartRepo {
	
	public void addProductToCart(ICustomer customer,IProduct product, int quantity);
	
	public void removeProductFromCart(ICustomer customer,IProduct product);
	
	public void updateProductQtyFromCart(ICustomer customer,IProduct product, int quantity);
	
	
}
