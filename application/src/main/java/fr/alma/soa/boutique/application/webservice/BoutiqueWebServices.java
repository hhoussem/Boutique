package fr.alma.soa.boutique.application.webservice;


import java.util.List;

import fr.alma.soa.boutique.domaine.model.Customer;
import fr.alma.soa.boutique.domaine.model.Product;
import fr.alma.soa.boutique.domaine.model.ShoppingCart;
import fr.alma.soa.boutique.domaine.model.dto.CustomerDto;
import fr.alma.soa.boutique.domaine.model.dto.ProductDto;
import fr.alma.soa.boutique.domaine.model.dto.ShoppingCartDto;

public interface BoutiqueWebServices{
	
	public ShoppingCartDto addProductToCart(CustomerDto customer, ProductDto product, int quantity);
	public List<ProductDto> getAllProductList();
}
