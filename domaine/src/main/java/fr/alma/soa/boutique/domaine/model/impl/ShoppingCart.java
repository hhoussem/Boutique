package fr.alma.soa.boutique.domaine.model.impl;

import fr.alma.soa.boutique.domaine.model.IProduct;
import fr.alma.soa.boutique.domaine.model.IShoppingCart;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart implements IShoppingCart {

	private Map<IProduct, Integer> products; // map of Products, quantities

	public ShoppingCart() {
		this.products = new HashMap<IProduct, Integer>();
	}
	
	public Map<IProduct, Integer> getProducts() {
		return products;
	}

	public void setProducts(Map<IProduct, Integer> products) {
		this.products = products;
	}

	public void addProduct(IProduct product, int qty) {
		
			products.put(product, qty);
	}

	public void removeProduct(IProduct product) {
		products.remove(product);
	}

	public boolean validateCart() {
		// before buying validate qantities and available qantitites
		return true;
	}

}
