package fr.alma.soa.boutique.infra;

import java.util.HashMap;
import java.util.Map;
import fr.alma.soa.boutique.domaine.model.Category;
import fr.alma.soa.boutique.domaine.model.Customer;
import fr.alma.soa.boutique.domaine.model.Product;
/**
 * Init class (instead of database)
 *
 */
public class Database 
{
	
	private Map<Integer,Category> categories = new HashMap<Integer,Category>();
	private Map<Integer,Product> products = new HashMap<Integer, Product>();
	private Map<String,Customer> customers = new HashMap<String,Customer>();
	
	public Database(){
		init();
	}
	public Map<Integer,Category> getCategories() {
		return categories;
	}

	public Map<Integer,Product> getProducts() {
		return products;
	}

	public Map<String,Customer> getCustomers() {
		return customers;
	}
    
    public void init()
    {
    	//categories init
		Category shoesCategory = new Category();
		shoesCategory.setId(2345);
		shoesCategory.setName("Shoes");
		
		Category phoneCategory = new Category();
    	phoneCategory.setId(111);
    	phoneCategory.setName("Phone");
		
    	//products init
		Product adidas = new Product();
		adidas.setId(1234);
		adidas.setCategory(shoesCategory);		
		adidas.setName("Adidas super Star");
		adidas.setPrice(120);
		adidas.setStockQty(100);
		
		Product puma = new Product();
		puma.setId(12008);
		puma.setCategory(shoesCategory);		
		puma.setName("Puma");
		puma.setPrice(90);
		puma.setStockQty(205);
		
    	Product s7 = new Product();
    	s7.setCategory(phoneCategory);
    	s7.setId(91);
    	s7.setName("Galaxy S7");
    	s7.setPrice(500);
    	s7.setStockQty(40);
    	
    	Product xperia = new Product();
    	xperia.setCategory(phoneCategory);
    	xperia.setId(17);
    	xperia.setName("Sony Xperia Z5");
    	xperia.setPrice(400);
    	xperia.setStockQty(60);
    	
    	//customers init
    	Customer c1 = new Customer();
    	c1.setEmail("toto@gmail.com");
    	c1.setPassword("0000");
    	c1.setName("Michael");
    	
    	
    	//add all to list
    	categories.put(shoesCategory.getId(),shoesCategory);
    	categories.put(phoneCategory.getId(),phoneCategory);
    	
    	products.put(xperia.getId(),xperia);
    	products.put(puma.getId(),puma);
    	products.put(adidas.getId(),adidas);
    	products.put(s7.getId(),s7);
    	
    	customers.put(c1.getEmail(),c1);
    }
}
