package fr.alma.soa.boutique.domaine.service;

import java.util.List;

import fr.alma.soa.boutique.api.exception.BusinessException;
import fr.alma.soa.boutique.domaine.model.Customer;
import fr.alma.soa.boutique.domaine.model.Order;
import fr.alma.soa.boutique.domaine.model.Product;
import fr.alma.soa.boutique.domaine.model.ShoppingCart;

public interface ShoppingCartService {
	/**
	 * Add some product to the customer's cart
	 * @param customer
	 * @param products
	 * @param quantity
	 * @return
	 * @throws BusinessException
	 */
	public ShoppingCart addProductToCart(Customer customer,Product product, int quantity) throws BusinessException;

		/**
	 * A customer wants to order his shoppingCart
	 * @param customer
	 * @param shoppingCart
	 * @param deliveryAdress
	 * @return
	 */
	
	
	public ShoppingCart removeProductFromCart(Customer customer,Product product);
	
	public ShoppingCart updateProductQtyFromCart(Customer customer,Product product, int quantity);
	
	public Order doOrder(Customer customer, ShoppingCart shoppingCart, String deliveryAdress);
	
}
