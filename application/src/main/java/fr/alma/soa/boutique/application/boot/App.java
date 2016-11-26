package fr.alma.soa.boutique.application.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.alma.soa.boutique.application.ApplicationEntry;
import fr.alma.soa.boutique.application.webservice.BoutiqueWebServices;
import fr.alma.soa.boutique.domaine.model.Category;
import fr.alma.soa.boutique.domaine.model.Customer;
import fr.alma.soa.boutique.domaine.model.Product;
import fr.alma.soa.boutique.domaine.model.ShoppingCart;

@Component
public class App 
{
	@Autowired
	BoutiqueWebServices boutiqueServices;
	
	private void run(){
		Customer customer = new Customer();
    	customer.setAddress("tax@yahoo.fr");
    	customer.setName("Toto");
    	customer.setPassword("password");
    	customer.setCreditCardInfo("13424234235");
    	ShoppingCart shoppingCart = new ShoppingCart();
    	Product product = new Product();
    	product.setCategory(new Category());
    	product.setId(132);
    	product.setName("Exemple");
    	boutiqueServices.addProductToCart(customer, product, 2);
    	boutiqueServices.getAllProductList();
	}
	
    public static void main( String[] args )
    {
    	ApplicationEntry entry = new ApplicationEntry();
    	entry.getApp().run();
    }
}
