package fr.alma.soa.boutique.application.webservice.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.alma.soa.boutique.api.exception.BusinessException;
import fr.alma.soa.boutique.application.webservice.BoutiqueWebServices;
import fr.alma.soa.boutique.domaine.model.ICustomer;
import fr.alma.soa.boutique.domaine.model.IProduct;
import fr.alma.soa.boutique.domaine.model.IShoppingCart;
import fr.alma.soa.boutique.domaine.service.ProductService;
import fr.alma.soa.boutique.domaine.service.ShoppingCartService;

public class BoutiqueWebServicesImpl implements BoutiqueWebServices {

	@Autowired
	private ShoppingCartService shoppingCartService;
	@Autowired
	private ProductService productService;
	
	public IShoppingCart addProductToCart(ICustomer customer,IShoppingCart shoppingCart, IProduct products, int quantity) {
		try {
			return shoppingCartService.addProductToCart(customer, shoppingCart, products, quantity);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<IProduct> getAllProductList(){
		List<IProduct> products = productService.getAllProduct();
		for(int i=0;i<products.size();i++){
			System.out.println("==> "+products.get(i).getName());
		}
		return products;
	}
}
