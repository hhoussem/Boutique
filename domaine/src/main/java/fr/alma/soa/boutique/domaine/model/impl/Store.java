package fr.alma.soa.boutique.domaine.model.impl;

import fr.alma.soa.boutique.domaine.model.ICategory;
import fr.alma.soa.boutique.domaine.model.ICustomer;
import fr.alma.soa.boutique.domaine.model.IProduct;
import fr.alma.soa.boutique.domaine.model.IStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Store implements IStore {

	private static Store store = null;
	private List<ICategory> categories;
	private Map<IProduct, Integer> products; // map of Products, quantities
	private List<ICustomer> customers;

	public static Store instance() {
		if (store == null) {
			store = new Store();
		}
		return store;
	}

	private Store() {
		products = new HashMap<IProduct, Integer>();
		categories = new ArrayList<ICategory>();
		customers = new ArrayList<ICustomer>();
	}

	public void addCustomer(ICustomer customer) {
		customers.add(customer);
	}

	public void addCategory(ICategory category) {
		categories.add(category);
	}

	public void addProduct(IProduct product, int qty) {
		products.put(product, qty);
	}

	public int getProductQty(IProduct product) {
		if (products.containsKey(product)) {
			return products.get(product);
		}
		return 0;
	}

	public List<ICustomer> getCustomers() {
		return customers;
	}

	public List<ICategory> getCategories() {
		return categories;
	}

	public Map<IProduct, Integer> getProducts() {
		return products;
	}

}
