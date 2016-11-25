package fr.alma.soa.boutique.domaine.model.impl;

import fr.alma.soa.boutique.domaine.model.IProduct;
import fr.alma.soa.boutique.domaine.model.IShoppingCart;

import java.util.HashMap;
import java.util.Iterator;
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

	public IProduct getProduct(int id) {
		IProduct product =null;
		Iterator iter = products.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry<IProduct, Integer> pair = (Map.Entry<IProduct, Integer>) iter.next();
			if(pair.getKey().getId() == id){
				break;
			}
		}
		return product;
	}

}
