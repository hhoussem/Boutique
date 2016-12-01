package fr.alma.soa.boutique.application.webservice.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import fr.alma.soa.boutique.api.exception.BusinessException;
import fr.alma.soa.boutique.application.webservice.BoutiqueWebServices;
import fr.alma.soa.boutique.domaine.model.dto.CategoryDto;
import fr.alma.soa.boutique.domaine.model.dto.CustomerDto;
import fr.alma.soa.boutique.domaine.model.dto.ProductDto;
import fr.alma.soa.boutique.domaine.model.dto.ShoppingCartDto;
import fr.alma.soa.boutique.domaine.service.CategoryService;
import fr.alma.soa.boutique.domaine.service.CustomerService;
import fr.alma.soa.boutique.domaine.service.ProductService;
import fr.alma.soa.boutique.domaine.service.ShoppingCartService;

public class BoutiqueWebServicesImpl implements BoutiqueWebServices {

	// @Autowired
	private ShoppingCartService shoppingCartService;

	private ProductService productService;

	private CategoryService categoryService;
	
	private CustomerService customerService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	public void setShoppingCartService(ShoppingCartService shoppingCartService) {
		this.shoppingCartService = shoppingCartService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	public ShoppingCartDto addProductToCart(CustomerDto customer, ProductDto product, int quantity) {
		try {
			System.out.println(customer.getName() + " : add " + quantity + " of " + product.getName() + " to his Cart");
			return shoppingCartService.addProductToCart(customer, product, quantity);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<ProductDto> getAllProductList() {
		List<ProductDto> products = productService.getAllProduct();
		for (int i = 0; i < products.size(); i++) {
			System.out.println("==> " + products.get(i).getName() + " : " + products.get(i).getCategory().getName()
					+ " " + products.get(i).getDescription());
		}
		return products;
	}
	
	public ProductDto getProductById(int id){
		return productService.getProductById(id);
	}

	public List<ProductDto> getProductsByCategory(CategoryDto category) {
		List<ProductDto> products = productService.getProductsByCategory(category);
		for (int i = 0; i < products.size(); i++) {
			System.out.println("category :" + category.getName() + "==> " + products.get(i).getName());
		}
		return products;
	}

	public List<CategoryDto> getAllCategories() {
		List<CategoryDto> categories = categoryService.getAllCategories();
		for (int i = 0; i < categories.size(); i++) {
			System.out.println("category : ==> " + categories.get(i).getName());
		}
		return categories;
	}

	public ShoppingCartDto removeProductFromCart(CustomerDto customer, ProductDto product) {
		System.out.println(customer.getName() + " :remove " + product.getName() + " from his Cart");
		return shoppingCartService.removeProductFromCart(customer, product);

	}
	
	public CategoryDto getCategoryById(int id) {
		
		return categoryService.getCategoryById(id);
	}

	public void changeCurrency(ShoppingCartDto cartDto, String newCurrency) {
		// TODO Auto-generated method stub
		
	}

	public List<CustomerDto> getCustomers() {
		
		return customerService.getCustomers();
	}

	public CustomerDto getCustomerByEmail(String email) {
	
		return customerService.getCustomerByEmail(email);
	}

	/*
	@Override
	public void changeCurrency(ShoppingCartDto cartDto, String newCurrency) {
		newCurrency=newCurrency.toUpperCase();
		String urlCurrencyAPI = "http://api.fixer.io/latest?base="+cartDto.getBaseCurrency()+"&symbols="+newCurrency ;
		URL oracle = null;
		double currency = 1;
		String jsonResult="";
		try {
			oracle = new URL(urlCurrencyAPI);
			URLConnection yc = oracle.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
			String inputLine;
			while ((inputLine = in.readLine()) != null){
				jsonResult+=inputLine;
			}
			in.close();
			HashMap<String,Object> result = new ObjectMapper().readValue(jsonResult, HashMap.class);
			currency = (double) (((HashMap<String,Object>)result.get("rates")).get(newCurrency));
			cartDto.setCurrency(currency);
			cartDto.setCurrentCurrency(newCurrency);
			System.out.println("Changement de devise de "+cartDto.getBaseCurrency()+" = "+currency+" "+cartDto.getCurrentCurrency());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/
}
