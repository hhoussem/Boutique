package fr.alma.soa.boutique.domaine.factory;

import fr.alma.soa.boutique.api.annotation.Factory;
import fr.alma.soa.boutique.domaine.model.Category;
import fr.alma.soa.boutique.domaine.model.Customer;
import fr.alma.soa.boutique.domaine.model.Product;

@Factory
public class ModelFactoryImpl implements  ModelFactory{

	@SuppressWarnings("unchecked")
	public <T> T getNewModelInstance(Class<T> cls){
		if(cls.equals(Product.class)){
			return (T) new Product();
		}else if(cls.equals(Customer.class)){
			return (T) new Customer();
		}else if(cls.equals(Category.class)){
			return (T) new Category();
		}
		return null;		
	}

	public Product createProductInstance(int id){
		return new Product(id);
	}

}
