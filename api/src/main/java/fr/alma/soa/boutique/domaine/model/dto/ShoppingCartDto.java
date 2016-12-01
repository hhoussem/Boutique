package fr.alma.soa.boutique.domaine.model.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ShoppingCartDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Map<ProductDto, Integer> products; // map of Products, quantities
	private final String baseCurrency = "eur";
	
	private String currentCurrency = "eur";
	private double currency=1; // la valeur de base/current

	public String getBaseCurrency() {
		return baseCurrency;
	}

	public String getCurrentCurrency() {
		return currentCurrency;
	}

	public void setCurrentCurrency(String currentCurrency) {
		this.currentCurrency = currentCurrency;
	}

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

	public ProductDto getProduct(int id) {
		ProductDto product =null;
		for(Entry<ProductDto, Integer> entry :products.entrySet()){
			product = entry.getKey();
			if(product.getId() == id){
				break;
			}
		}
		return product;
	}

	public double getCurrency() {
		return currency;
	}

	public void setCurrency(double currency) {
		this.currency = currency;
	}
}
