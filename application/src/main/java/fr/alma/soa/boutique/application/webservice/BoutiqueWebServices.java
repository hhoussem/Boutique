package fr.alma.soa.boutique.application.webservice;


import java.util.List;

import fr.alma.soa.boutique.domaine.model.Customer;
import fr.alma.soa.boutique.domaine.model.Product;
import fr.alma.soa.boutique.domaine.model.ShoppingCart;

public interface BoutiqueWebServices{
	
	public ShoppingCart addProductToCart(Customer customer, Product product, int quantity);
	public List<Product> getAllProductList();
}
