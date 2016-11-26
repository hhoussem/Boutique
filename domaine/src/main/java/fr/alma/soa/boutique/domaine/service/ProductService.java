package fr.alma.soa.boutique.domaine.service;

import java.util.List;

import fr.alma.soa.boutique.domaine.model.Product;
import fr.alma.soa.boutique.domaine.model.dto.ProductDto;

public interface ProductService {
	/**
	 * Return la liste des produits
	 * @return
	 */
	public List<ProductDto> getAllProduct();
	
	public ProductDto getProductById(int id);
	
	public void addProduct(ProductDto product);
	
	public void removeProduct(int id);
	

}
