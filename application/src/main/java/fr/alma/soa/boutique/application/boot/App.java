package fr.alma.soa.boutique.application.boot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.alma.soa.boutique.application.ApplicationEntry;
import fr.alma.soa.boutique.application.webservice.BoutiqueWebServices;
import fr.alma.soa.boutique.domaine.model.dto.CategoryDto;
import fr.alma.soa.boutique.domaine.model.dto.CustomerDto;
import fr.alma.soa.boutique.domaine.model.dto.ProductDto;
import fr.alma.soa.boutique.domaine.model.dto.ShoppingCartDto;

public class App 
{
	BoutiqueWebServices boutiqueServices;
	
	public void setBoutiqueServices(BoutiqueWebServices boutiqueServices) {
		this.boutiqueServices = boutiqueServices;
	}

	private void run(){
		CustomerDto customer = new CustomerDto();
    	customer.setAddress("tax@yahoo.fr");
    	customer.setName("Toto");
    	customer.setPassword("password");
    	customer.setCreditCardInfo("13424234235");
    	ProductDto product = new ProductDto();
    	product.setCategory(new CategoryDto());
    	product.setId(17);
    	product.setName("Exemple");
    	boutiqueServices.addProductToCart(customer, product, 2);
    	System.out.println("All products============================================");
    	boutiqueServices.getAllProductList();
    	CategoryDto categoryShoes = new CategoryDto(2345, "Shoes");
    	System.out.println("Product by category :"+categoryShoes.getName()+"==============================================");
    	boutiqueServices.getProductsByCategory(categoryShoes);
    	System.out.println("All categories============================================");
    	boutiqueServices.getAllCategories();
    	System.out.println("============================================");
    	boutiqueServices.addProductToCart(customer, boutiqueServices.getAllProductList().get(0), 5);
    	System.out.println("============================================");
    	boutiqueServices.changeCurrency(customer.getShoppingCart(), "usd");
    	System.out.println("============================================");
    	System.out.println("============================================");
    	for (ProductDto p : customer.getShoppingCart().getProducts().keySet()){
    		System.out.println("Client : "+customer.getName() +" - Produit : "+p.getName()+" - Prix = "+(p.getPrice()*customer.getShoppingCart().getCurrency())+" "+customer.getShoppingCart().getCurrentCurrency());
    	}
    	System.out.println("============================================");
    	System.out.println("============================================");
    	boutiqueServices.removeProductFromCart(customer, boutiqueServices.getAllProductList().get(0));

	}
	
    public static void main( String[] args )
    {
    	ApplicationEntry entry = new ApplicationEntry();
    	entry.getApp().run();
    }
}
