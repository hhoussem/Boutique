package fr.alma.soa.boutique.domaine.service;

import java.util.List;

import fr.alma.soa.boutique.api.exception.BusinessException;
import fr.alma.soa.boutique.domaine.model.ICustomer;
import fr.alma.soa.boutique.domaine.model.IOrder;
import fr.alma.soa.boutique.domaine.model.IProduct;
import fr.alma.soa.boutique.domaine.model.IShoppingCart;

public interface ShoppingCartService {
	/**
	 * Add some product to the customer's cart
	 * @param customer
	 * @param products
	 * @param quantity
	 * @return
	 * @throws BusinessException
	 */
	public IShoppingCart addProductToCart(ICustomer customer,IProduct product, int quantity) throws BusinessException;

		/**
	 * A customer wants to order his shoppingCart
	 * @param customer
	 * @param shoppingCart
	 * @param deliveryAdress
	 * @return
	 */
	
	
	public IShoppingCart removeProductFromCart(ICustomer customer,IProduct product);
	
	public IShoppingCart updateProductQtyFromCart(ICustomer customer,IProduct product, int quantity);
	
	public IOrder doOrder(ICustomer customer, IShoppingCart shoppingCart, String deliveryAdress);
	
}
