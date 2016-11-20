package fr.alma.soa.boutique.domaine.factory;

import fr.alma.soa.boutique.domaine.model.ICategory;
import fr.alma.soa.boutique.domaine.model.ICustomer;
import fr.alma.soa.boutique.domaine.model.IProduct;
import fr.alma.soa.boutique.domaine.model.impl.*;

public class ModelFactoryImpl implements  ModelFactory{

	@SuppressWarnings("unchecked")
	public <T> T getNewModelInstance(Class<T> cls){
		if(cls.equals(IProduct.class)){
			return (T) new Product();
		}else if(cls.equals(ICustomer.class)){
			return (T) new Customer();
		}else if(cls.equals(ICategory.class)){
			return (T) new Category();
		}
		return null;		
	}

	public IProduct createProductInstance(int id){
		return new Product(id);
	}

}
