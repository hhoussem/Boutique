package fr.alma.soa.boutique.domaine.factory;

import fr.alma.soa.boutique.domaine.model.IProduct;

public interface ModelFactory {

	/**
	 * Create a new instance of a domain model
	 * @param cls
	 * @return
	 */
	<T> T getNewModelInstance(Class<T> cls);

	/**
	 * Create a new instance of Product model wih some parameters
	 * @param id
	 * @return
	 */
	IProduct createProductInstance(int id);

}
