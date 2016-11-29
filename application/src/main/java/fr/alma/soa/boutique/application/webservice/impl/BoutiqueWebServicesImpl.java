package fr.alma.soa.boutique.application.webservice.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.alma.soa.boutique.api.exception.BusinessException;
import fr.alma.soa.boutique.application.webservice.BoutiqueWebServices;
import fr.alma.soa.boutique.domaine.model.dto.CategoryDto;
import fr.alma.soa.boutique.domaine.model.dto.CustomerDto;
import fr.alma.soa.boutique.domaine.model.dto.ProductDto;
import fr.alma.soa.boutique.domaine.model.dto.ShoppingCartDto;
import fr.alma.soa.boutique.domaine.service.ProductService;
import fr.alma.soa.boutique.domaine.service.ShoppingCartService;

public class BoutiqueWebServicesImpl implements BoutiqueWebServices {

	//@Autowired
	//private ShoppingCartService shoppingCartService;
	private ProductService productService;
	
	/*
	public ShoppingCartDto addProductToCart(CustomerDto customer, ProductDto product, int quantity){
		try {
			return shoppingCartService.addProductToCart(customer, product, quantity);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		return null;
	}*/
	
	public List<ProductDto> getAllProductList(){
		List<ProductDto> products = productService.getAllProduct();
		for(int i=0;i<products.size();i++){
			System.out.println("==> "+products.get(i).getName());
		}
		return products;
	}
	
	public void setProductService(ProductService productService){
		this.productService = productService;
	}

	public List<ProductDto> getProductsByCategory(CategoryDto category) {
		List<ProductDto> products = productService.getProductsByCategory(category);
		for(int i=0;i<products.size();i++){
			System.out.println("category :"+category.getName()+"==> "+products.get(i).getName());
		}
		return products;
	}
}
