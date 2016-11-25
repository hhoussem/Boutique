package fr.alma.soa.boutique.infra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.alma.soa.boutique.domaine.factory.ModelFactory;
import fr.alma.soa.boutique.domaine.model.ICategory;
import fr.alma.soa.boutique.domaine.model.ICustomer;
import fr.alma.soa.boutique.domaine.model.IProduct;
import fr.alma.soa.boutique.domaine.model.IShoppingCart;
/**
 * Init class (instead of database)
 *
 */
public class Database 
{
	private ModelFactory modelFactory;
	
	private Map<Integer,ICategory> categories = new HashMap<Integer,ICategory>();
	private Map<Integer,IProduct> products = new HashMap<Integer, IProduct>();
	private Map<String,ICustomer> customers = new HashMap<String,ICustomer>();
	public Database(ModelFactory modelFactory){
		this.modelFactory = modelFactory;
		init();
	}
	
	public Map<Integer,ICategory> getCategories() {
		return categories;
	}

	public Map<Integer,IProduct> getProducts() {
		return products;
	}

	public Map<String,ICustomer> getCustomers() {
		return customers;
	}
    
    public void init()
    {
    	//categories init
		ICategory shoesCategory = modelFactory.getNewModelInstance(ICategory.class);
		shoesCategory.setId(2345);
		shoesCategory.setName("Shoes");
		
		ICategory phoneCategory = modelFactory.getNewModelInstance(ICategory.class);
    	phoneCategory.setId(111);
    	phoneCategory.setName("Phone");
		
    	//products init
		IProduct adidas = modelFactory.getNewModelInstance(IProduct.class);
		adidas.setId(1234);
		adidas.setCategory(shoesCategory);		
		adidas.setName("Adidas super Star");
		adidas.setPrice(120);
		adidas.setStockQty(100);
		
		IProduct puma = modelFactory.getNewModelInstance(IProduct.class);
		puma.setId(12008);
		puma.setCategory(shoesCategory);		
		puma.setName("Puma");
		puma.setPrice(90);
		puma.setStockQty(205);
		
    	IProduct s7 = modelFactory.getNewModelInstance(IProduct.class);
    	s7.setCategory(phoneCategory);
    	s7.setId(91);
    	s7.setName("Galaxy S7");
    	s7.setPrice(500);
    	s7.setStockQty(40);
    	
    	IProduct xperia = modelFactory.getNewModelInstance(IProduct.class);
    	xperia.setCategory(phoneCategory);
    	xperia.setId(17);
    	xperia.setName("Sony Xperia Z5");
    	xperia.setPrice(400);
    	xperia.setStockQty(60);
    	
    	//customers init
    	ICustomer c1 = modelFactory.getNewModelInstance(ICustomer.class);
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
