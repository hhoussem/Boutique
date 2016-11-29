package fr.alma.soa.boutique.infra.repository;

import java.util.List;

import fr.alma.soa.boutique.domaine.model.Category;
import fr.alma.soa.boutique.domaine.model.Product;

public interface ProductRepo {

	
	public Product getProductById(int id);
	
	public void addProduct(Product product);
	
	public void removeProduct(int id);
	
	public List<Product> getAllProduct();
	
	public List<Product> getProductsByCategory(Category category);
}
