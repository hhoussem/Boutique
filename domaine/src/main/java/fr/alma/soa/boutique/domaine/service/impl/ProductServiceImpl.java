package fr.alma.soa.boutique.domaine.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.alma.soa.boutique.domaine.factory.DtoModelFactory;
import fr.alma.soa.boutique.domaine.factory.ModelFactory;
import fr.alma.soa.boutique.domaine.model.Product;
import fr.alma.soa.boutique.domaine.model.dto.ProductDto;
import fr.alma.soa.boutique.domaine.service.ProductService;
import fr.alma.soa.boutique.infra.repository.ProductRepo;

public class ProductServiceImpl implements ProductService{
	
	private ProductRepo productRepo;
	
	public void setProductRepo(ProductRepo productRepo) {
		this.productRepo = productRepo;
	}

	private ModelFactory modelFactory;
	
	public void setModelFactory(ModelFactory modelFactory) {
		this.modelFactory = modelFactory;
	}

	private DtoModelFactory dtoModelFactory;
	
	
	public void setDtoModelFactory(DtoModelFactory dtoModelFactory) {
		this.dtoModelFactory = dtoModelFactory;
	}

	public List<ProductDto> getAllProduct() {
		List<ProductDto> products = new ArrayList<ProductDto>();
		for(Product pr : productRepo.getAllProduct()){
			products.add(dtoModelFactory.getProductInstance(pr));
		}
		return products;
	}

	public ProductDto getProductById(int id) {
		
		return dtoModelFactory.getProductInstance(productRepo.getProductById(id));
	}

	public void addProduct(ProductDto product) {
		productRepo.addProduct(modelFactory.getProductInstance(product));
		
	}

	public void removeProduct(int id) {
		productRepo.removeProduct(id);
		
	}

}
