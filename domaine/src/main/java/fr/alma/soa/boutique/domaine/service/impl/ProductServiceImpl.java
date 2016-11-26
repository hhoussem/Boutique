package fr.alma.soa.boutique.domaine.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.alma.soa.boutique.domaine.model.Product;
import fr.alma.soa.boutique.domaine.service.ProductService;
import fr.alma.soa.boutique.infra.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepo productRepo;
	
	public List<Product> getAllProduct() {
		
		return productRepo.getAllProduct();
	}

	public Product getProductById(int id) {
		
		return productRepo.getProductById(id);
	}

	public void addProduct(Product product) {
		productRepo.addProduct(product);
		
	}

	public void removeProduct(int id) {
		productRepo.removeProduct(id);
		
	}

}
