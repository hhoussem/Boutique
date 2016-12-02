package fr.alma.soa.boutique.application.webservice;


import java.util.List;

import fr.alma.soa.boutique.domaine.model.dto.CategoryDto;
import fr.alma.soa.boutique.domaine.model.dto.CustomerDto;
import fr.alma.soa.boutique.domaine.model.dto.ProductDto;
import fr.alma.soa.boutique.domaine.model.dto.ShoppingCartDto;

public interface BoutiqueWebServices{
	
	public ShoppingCartDto addProductToCart(CustomerDto customer, ProductDto product, int quantity);
	
	public ShoppingCartDto removeProductFromCart(CustomerDto customer, ProductDto product);
	
	public List<ProductDto> getAllProductList();
	
	public ProductDto getProductById(int id);
	
	public List<ProductDto> getProductsByCategory(CategoryDto category);
	
	public List<CategoryDto> getAllCategories();
	
	public void changeCurrency(ShoppingCartDto cartDto, String newCurrency);
	
	public CategoryDto getCategoryById(int id);
	
	public List<CustomerDto> getCustomers();
	
	public CustomerDto getCustomerByEmail(String email);
	
	public void doTest();
}
