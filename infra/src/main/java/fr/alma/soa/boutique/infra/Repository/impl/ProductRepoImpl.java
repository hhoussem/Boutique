package fr.alma.soa.boutique.infra.Repository.impl;

import fr.alma.soa.boutique.domaine.factory.ModelFactory;
import fr.alma.soa.boutique.domaine.model.ICategory;
import fr.alma.soa.boutique.domaine.model.IProduct;
import fr.alma.soa.boutique.infra.repository.ProductRepo;

public class ProductRepoImpl implements ProductRepo {

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
		return product;
	}

}
