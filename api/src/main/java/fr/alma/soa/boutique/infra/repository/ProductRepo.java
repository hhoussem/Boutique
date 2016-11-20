package fr.alma.soa.boutique.infra.repository;

import fr.alma.soa.boutique.domaine.model.IProduct;

public interface ProductRepo {

	
	public IProduct getProductById(int id);
}
