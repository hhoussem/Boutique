package fr.alma.soa.boutique.domaine.model;

import fr.alma.soa.boutique.domaine.model.Product;
import fr.alma.soa.boutique.domaine.model.ShoppingCart;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ShoppingCart{

	private Map<Product, Integer> products; // map of Products, quantities

	public ShoppingCart() {
		this.products = new HashMap<Product, Integer>();
	}
	
	public Map<Product, Integer> getProducts() {
		return products;
	}

	public void setProducts(Map<Product, Integer> products) {
		this.products = products;
	}

	public void addProduct(Product product, int qty) {
		
			products.put(product, qty);
	}

	public void removeProduct(Product product) {
		products.remove(product);
	}

	public boolean validateCart() {
		// before buying validate qantities and available qantitites
		return true;
	}

	public Product getProduct(int id) {
		Product product =null;
		Iterator iter = products.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry<Product, Integer> pair = (Map.Entry<Product, Integer>) iter.next();
			if(pair.getKey().getId() == id){
				break;
			}
		}
		return product;
	}

}
