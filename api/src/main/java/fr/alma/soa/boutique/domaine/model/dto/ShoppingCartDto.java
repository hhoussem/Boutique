package fr.alma.soa.boutique.domaine.model.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import fr.alma.soa.boutique.domaine.model.Product;

public class ShoppingCartDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Map<ProductDto, Integer> products; // map of Products, quantities

	public ShoppingCartDto() {
		this.products = new HashMap<ProductDto, Integer>();
	}
	
	public Map<ProductDto, Integer> getProducts() {
		return products;
	}

	public void setProducts(Map<ProductDto, Integer> products) {
		this.products = products;
	}

	public void addProduct(ProductDto product, int qty) {
		
			products.put(product, qty);
	}

	public void removeProduct(ProductDto product) {
		for(Entry<ProductDto, Integer> entry : products.entrySet()){
			ProductDto pr = entry.getKey();
			if(pr.getId() == product.getId()) products.remove(pr);
		}
	}

	public boolean validateCart() {
		// before buying validate qantities and available qantitites
		return true;
	}

	public Product getProduct(int id) {
		Product product =null;
		Iterator<?> iter = products.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry<Product, Integer> pair = (Map.Entry<Product, Integer>) iter.next();
			if(pair.getKey().getId() == id){
				break;
			}
		}
		return product;
	}
}
