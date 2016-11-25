package fr.alma.soa.boutique.application.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.alma.soa.boutique.application.ApplicationEntry;
import fr.alma.soa.boutique.application.webservice.BoutiqueWebServices;
import fr.alma.soa.boutique.domaine.model.ICustomer;
import fr.alma.soa.boutique.domaine.model.IProduct;
import fr.alma.soa.boutique.domaine.model.IShoppingCart;
import fr.alma.soa.boutique.domaine.model.impl.Category;
import fr.alma.soa.boutique.domaine.model.impl.Customer;
import fr.alma.soa.boutique.domaine.model.impl.Product;
import fr.alma.soa.boutique.domaine.model.impl.ShoppingCart;

@Component
public class App 
{
	@Autowired
	BoutiqueWebServices boutiqueServices;
	
	private void run(){
		ICustomer customer = new Customer();
    	customer.setAddress("tax@yahoo.fr");
    	customer.setName("Toto");
    	customer.setPassword("password");
    	customer.setCreditCardInfo("13424234235");
    	IShoppingCart shoppingCart = new ShoppingCart();
    	IProduct product = new Product();
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
