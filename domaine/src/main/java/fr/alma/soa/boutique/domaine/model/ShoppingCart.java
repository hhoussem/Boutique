package fr.alma.soa.boutique.domaine.model;

import java.util.HashMap;
import java.util.Map;


public class ShoppingCart {
	
	private Map<Product, Integer> products; // map of Products, quantities
	
	public ShoppingCart() {
		this.products = new HashMap<Product, Integer>();
	}
	
	public boolean addProduct(Product product, int qty){
		if(qty <= Store.instance().getProductQty(product))
		{
			products.put(product,qty);
			return true;
		}
		return false;
			
	}
	
	public void removeProduct(Product product){
		products.remove(product);
	}
	
	public boolean valideCart(){
		//before buying validate qantities and available qantitites
		return true;
	}
	
}
