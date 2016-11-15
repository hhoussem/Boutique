package fr.alma.soa.boutique.domaine;

import fr.alma.soa.boutique.domaine.model.impl.*;


public class App 
{
    public static void main( String[] args )
    {
    	Category phoneCategory = new Category(1,"Phone");
    	Store.instance().addCategory(phoneCategory);
    	Product s7 = new Product(1,"Galaxy S7","ram 3 go",500,phoneCategory);
    	Product iphone7 = new Product(2,"Iphone 7","ecran 5 pouces",600,phoneCategory);
    	Store.instance().addProduct(s7,100);
    	Store.instance().addProduct(iphone7,80);
    	Customer c1 = new Customer("toto@gmail.com","0000","toto");
    	Store.instance().addCustomer(c1);
    	c1.addToChar(s7,1);
    	c1.buy();
    }
}
