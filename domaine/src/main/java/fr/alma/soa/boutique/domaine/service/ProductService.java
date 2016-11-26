package fr.alma.soa.boutique.domaine.service;

import java.util.List;

import fr.alma.soa.boutique.domaine.model.Product;

public interface ProductService {
	/**
	 * Return la liste des produits
	 * @return
	 */
	public List<Product> getAllProduct();
	
	public Product getProductById(int id);
	
	public void addProduct(Product product);
	
	public void removeProduct(int id);
	

}
