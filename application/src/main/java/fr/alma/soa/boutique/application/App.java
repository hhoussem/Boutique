package fr.alma.soa.boutique.application;

import fr.alma.soa.boutique.application.webservice.BoutiqueWebServices;
import fr.alma.soa.boutique.domaine.model.ICustomer;
import fr.alma.soa.boutique.domaine.model.IProduct;
import fr.alma.soa.boutique.domaine.model.IShoppingCart;
import fr.alma.soa.boutique.domaine.model.impl.Category;
import fr.alma.soa.boutique.domaine.model.impl.Customer;
import fr.alma.soa.boutique.domaine.model.impl.Product;
import fr.alma.soa.boutique.domaine.model.impl.ShoppingCart;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationEntry boutiqueApp = new ApplicationEntry();
    	BoutiqueWebServices boutiqueServices = new BoutiqueWebServices();
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
    	//boutiqueServices.addProductToCart(customer, shoppingCart, product, 2);
    	boutiqueServices.getAllProductList();
    }
}
