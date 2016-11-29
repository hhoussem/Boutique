package fr.alma.soa.boutique.application.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import fr.alma.soa.boutique.application.ApplicationEntry;
import fr.alma.soa.boutique.application.webservice.BoutiqueWebServices;
import fr.alma.soa.boutique.domaine.model.dto.CategoryDto;
import fr.alma.soa.boutique.domaine.model.dto.CustomerDto;
import fr.alma.soa.boutique.domaine.model.dto.ProductDto;
import fr.alma.soa.boutique.domaine.model.dto.ShoppingCartDto;

public class App 
{
	BoutiqueWebServices boutiqueServices;
	
	private void run(){
		CustomerDto customer = new CustomerDto();
    	customer.setAddress("tax@yahoo.fr");
    	customer.setName("Toto");
    	customer.setPassword("password");
    	customer.setCreditCardInfo("13424234235");
    	ShoppingCartDto shoppingCart = new ShoppingCartDto();
    	ProductDto product = new ProductDto();
    	product.setCategory(new CategoryDto());
    	product.setId(17);
    	product.setName("Exemple");
    	//boutiqueServices.addProductToCart(customer, product, 2);
    	boutiqueServices.getAllProductList();
	}
	
    public static void main( String[] args )
    {
    	
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring-core-config.xml"});
    	BoutiqueWebServices bs = (BoutiqueWebServices) context.getBean("boutiqueWebService");
    	bs.getAllProductList();
    }
}
