package fr.alma.soa.boutique.infra.repository;

import fr.alma.soa.boutique.domaine.model.ICustomer;
import fr.alma.soa.boutique.domaine.model.IProduct;

public interface ShoppingCartRepo {
	
	public void addProductToShoppingCart(ICustomer customer,IProduct product, int quantity);

}
