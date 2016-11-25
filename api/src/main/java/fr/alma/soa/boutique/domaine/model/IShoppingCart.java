package fr.alma.soa.boutique.domaine.model;

import java.util.Map;

public interface IShoppingCart extends IModel {
	
	public Map<IProduct, Integer> getProducts();

	public void setProducts(Map<IProduct, Integer> products);

	public void addProduct(IProduct product, int qty);

	public void removeProduct(IProduct product);
	
	public IProduct getProduct(int id);

	public boolean validateCart();

}
