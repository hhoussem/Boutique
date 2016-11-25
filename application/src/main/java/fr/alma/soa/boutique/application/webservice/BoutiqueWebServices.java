package fr.alma.soa.boutique.application.webservice;


import java.util.List;

import fr.alma.soa.boutique.domaine.model.ICustomer;
import fr.alma.soa.boutique.domaine.model.IProduct;
import fr.alma.soa.boutique.domaine.model.IShoppingCart;

public interface BoutiqueWebServices{
	
	public IShoppingCart addProductToCart(ICustomer customer,IShoppingCart shoppingCart, IProduct products, int quantity);
	
	public List<IProduct> getAllProductList();
}
