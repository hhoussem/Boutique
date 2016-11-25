package fr.alma.soa.boutique.domaine.service;

import java.util.List;

import fr.alma.soa.boutique.domaine.model.IProduct;

public interface ProductService {
	/**
	 * Return la liste des produits
	 * @return
	 */
	public List<IProduct> getAllProduct();
	
	public IProduct getProductById(int id);
	
	public void addProduct(IProduct product);
	
	public void removeProduct(int id);
	

}
