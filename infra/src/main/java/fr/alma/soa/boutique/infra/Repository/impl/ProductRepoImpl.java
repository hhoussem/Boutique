package fr.alma.soa.boutique.infra.Repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.alma.soa.boutique.domaine.factory.ModelFactory;
import fr.alma.soa.boutique.domaine.model.ICategory;
import fr.alma.soa.boutique.domaine.model.IProduct;
import fr.alma.soa.boutique.infra.repository.ProductRepo;

@Repository
public class ProductRepoImpl implements ProductRepo {
	
	private final Logger logger = LoggerFactory.getLogger(ProductRepoImpl.class);

	@Autowired
	private ModelFactory modelFactory;

	public IProduct getProductById(int id) {
		// TODO Auto-generated method stub
		IProduct product = modelFactory.getNewModelInstance(IProduct.class);
		ICategory category = modelFactory.getNewModelInstance(ICategory.class);
		category.setId(2345);
		category.setName("Chaussure");
		product.setId(1234);
		product.setCategory(category);		
		product.setName("Adidas super Star");
		product.setPrice(120);
		product.setStock(100);//quantité en stock
		logger.info("==> Passage dans la couche Infra dans le repository!"+id);
		return product;
	}

	public List<IProduct> getAllProduct() {
		IProduct product;
		List<IProduct>  products = new ArrayList<IProduct>();
		for(int i=0;i<=5;i++){
			product = modelFactory.getNewModelInstance(IProduct.class);
			product.setId(i);
			product.setName("P"+i);
			products.add(product);			
		}
		return products;
	}

}