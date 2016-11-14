package fr.alma.soa.boutique.domaine.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Store {
	
	private static Store store =null;
	private List<Category> categories;
	private Map<Product, Integer> products; // map of Products, quantities
	private List<Customer> customers;

	public static Store instance(){
		if(store == null)
		{
			store = new Store();
		}
		return store;
	}
	private Store() {
		products = new HashMap<Product, Integer>();
		categories = new ArrayList<Category>();
		customers = new ArrayList<Customer>();
	}
	public void addCustomer(Customer customer){
		customers.add(customer);
	}
	
	public void addCategory(Category category) {
		categories.add(category);
	}

	public void addProduct(Product product, int qty) {
		products.put(product, qty);
	}
	
	public int getProductQty(Product product){
		if(products.containsKey(product))
		{
			return products.get(product);
		}
		return 0;
	}
	public List<Customer> getCustomers() {
		return customers;
	}
	public List<Category> getCategories() {
		return categories;
	}

	public Map<Product, Integer> getProducts() {
		return products;
	}

	
	
}
