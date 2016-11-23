package fr.alma.soa.boutique.infra;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import fr.alma.soa.boutique.domaine.factory.ModelFactory;
import fr.alma.soa.boutique.domaine.model.ICategory;
import fr.alma.soa.boutique.domaine.model.ICustomer;
import fr.alma.soa.boutique.domaine.model.IProduct;
import fr.alma.soa.boutique.domaine.model.IShoppingCart;
/**
 * Init class (instead of database)
 *
 */
public class Infra 
{
	@Autowired
	private ModelFactory modelFactory;
	
	private static  Infra infra = null; 
	
	private List<ICategory> categories = new ArrayList<ICategory>();
	private List<IProduct> products = new ArrayList<IProduct>();
	private List<ICustomer> customers = new ArrayList<ICustomer>();
	private List<IShoppingCart> shoppingCarts = new ArrayList<IShoppingCart>();
    
	public static Infra getInstance(){
		if(infra == null){
			infra = new Infra();
		}
		return infra;
	}
	
	private Infra(){
		init();
	}
	
	public List<ICategory> getCategories() {
		return categories;
	}

	public List<IProduct> getProducts() {
		return products;
	}

	public List<ICustomer> getCustomers() {
		return customers;
	}

	public List<IShoppingCart> getShoppingCarts() {
		return shoppingCarts;
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
    	s7.setId(1);
    	s7.setName("Galaxy S7");
    	s7.setPrice(500);
    	s7.setStockQty(40);
    	
    	IProduct xperia = modelFactory.getNewModelInstance(IProduct.class);
    	xperia.setCategory(phoneCategory);
    	xperia.setId(1);
    	xperia.setName("Sony Xperia Z5");
    	xperia.setPrice(400);
    	xperia.setStockQty(60);
    	
    	//customers init
    	ICustomer c1 = modelFactory.getNewModelInstance(ICustomer.class);
    	c1.setEmail("toto@gmail.com");
    	c1.setPassword("0000");
    	c1.setName("Michael");
    	
    	
    	//add all to list
    	categories.add(shoesCategory);
    	categories.add(phoneCategory);
    	
    	products.add(xperia);
    	products.add(puma);
    	products.add(adidas);
    	products.add(s7);
    	
    	customers.add(c1);
    }
}
