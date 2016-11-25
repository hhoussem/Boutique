package fr.alma.soa.boutique.infra.Repository.impl;

import org.springframework.stereotype.Repository;

import fr.alma.soa.boutique.domaine.model.ICustomer;
import fr.alma.soa.boutique.domaine.model.IProduct;
import fr.alma.soa.boutique.infra.repository.ShoppingCartRepo;

@Repository
public class ShoppingCartRepoImpl implements ShoppingCartRepo{

	public void addProductToShoppingCart(ICustomer customer, IProduct product, int quantity) {
		// TODO Auto-generated method stub
		
	}

}
