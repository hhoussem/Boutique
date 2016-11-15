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

	public boolean addProduct(IProduct product, int qty) {
		if (qty <= Store.instance().getProductQty(product)) {
			products.put(product, qty);
			return true;
		}
		return false;

	}

	public void removeProduct(IProduct product) {
		products.remove(product);
	}

	public boolean validateCart() {
		// before buying validate qantities and available qantitites
		return true;
	}

}
