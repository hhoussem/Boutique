package fr.alma.soa.boutique.domaine.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.alma.soa.boutique.domaine.model.IProduct;
import fr.alma.soa.boutique.domaine.service.ProductService;
import fr.alma.soa.boutique.infra.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepo productRepo;
	
	public List<IProduct> getAllProduct() {
		
		return productRepo.getAllProduct();
	}

}
