package fr.alma.soa.boutique.infra.Repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.alma.soa.boutique.domaine.factory.ModelFactory;
import fr.alma.soa.boutique.domaine.model.Category;
import fr.alma.soa.boutique.domaine.model.Product;
import fr.alma.soa.boutique.infra.Database;
import fr.alma.soa.boutique.infra.repository.ProductRepo;

@Repository
public class ProductRepoImpl implements ProductRepo {
	
	private final Logger logger = LoggerFactory.getLogger(ProductRepoImpl.class);

	@Autowired
	private ModelFactory modelFactory;
	
	@Autowired
	private Database database;

	public Product getProductById(int id) {
		
		return database.getProducts().get(id);
	}
	
	public void addProduct(Product product) {
		database.getProducts().put(product.getId(), product);
		
	}
	
	public void removeProduct(int id) {
		database.getProducts().remove(id);
		
	}

	public List<Product> getAllProduct() {
		return new ArrayList<Product>(database.getProducts().values());
	}




}
