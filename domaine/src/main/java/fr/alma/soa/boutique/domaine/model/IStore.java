package fr.alma.soa.boutique.domaine.model;

import java.util.List;
import java.util.Map;

public interface IStore {
	
	public void addCustomer(ICustomer customer);
	
	public void addCategory(ICategory category);
	
	public void addProduct(IProduct product, int qty);
	
	public int getProductQty(IProduct product);
	
	public List<ICustomer> getCustomers() ;
	
	public List<ICategory> getCategories() ;

	public Map<IProduct, Integer> getProducts();
}
