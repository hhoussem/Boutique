package fr.alma.soa.boutique.presentation.boot;

import java.util.List;

import fr.alma.soa.boutique.application.webservice.impl.BoutiqueServices;
import fr.alma.soa.boutique.application.webservice.impl.BoutiqueServicesPortType;
import fr.alma.soa.boutique.domaine.model.dto.CategoryDto;
import fr.alma.soa.boutique.domaine.model.dto.CustomerDto;
import fr.alma.soa.boutique.domaine.model.dto.ProductDto;
import fr.alma.soa.boutique.domaine.model.dto.ShoppingCartDto;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoutiqueServices boutiqueServices = BoutiqueServices.getInstance();
		BoutiqueServicesPortType port = boutiqueServices.getBoutiqueServicesHttpSoap11Endpoint();
		
		CustomerDto customer = port.getCustomers().get(0);
		System.out.println(customer.getName());
		
		
		ShoppingCartDto cart = null;
			System.out.println("add");
			String idString = "1234";
			if(idString !=null){
				int productId = Integer.parseInt(idString);
				System.out.println(idString);
				ProductDto newProduct =  port.getProductById(productId);
				cart = port.addProductToCart(customer, newProduct, 1);
			}
		
		
		List<ProductDto> products = port.getAllProductList();
		for(ProductDto pr : products){
			System.out.println("===> "+pr.getName()+ "   "+pr.getCategory().getName());
		}
		System.out.println("=====================================================================================");
		CategoryDto cat = new CategoryDto();
		cat.setId(2345);
		//cat.setName(new JAXBElement<String>(new QName("name"), String.class, "Shoes"));
		//cat.setName("Shoes");
		List<ProductDto> products2 = port.getProductsByCategory(cat);
		for(ProductDto pr : products2){
			System.out.println("===> "+pr.getName()+ "   "+pr.getName());
		}
	}

}
