package fr.alma.soa.boutique.domaine.service;

import fr.alma.soa.boutique.api.exception.BusinessException;
import fr.alma.soa.boutique.domaine.model.dto.CustomerDto;
import fr.alma.soa.boutique.domaine.model.dto.OrderDto;
import fr.alma.soa.boutique.domaine.model.dto.ProductDto;
import fr.alma.soa.boutique.domaine.model.dto.ShoppingCartDto;

public interface ShoppingCartService {
	/**
	 * Add some product to the customer's cart
	 * @param customer
	 * @param products
	 * @param quantity
	 * @return
	 * @throws BusinessException
	 */
	public ShoppingCartDto addProductToCart(CustomerDto customer,ProductDto product, int quantity) throws BusinessException;

		/**
	 * A customer wants to order his shoppingCart
	 * @param customer
	 * @param shoppingCart
	 * @param deliveryAdress
	 * @return
	 */
	
	
	public ShoppingCartDto removeProductFromCart(CustomerDto customer,ProductDto product);
	
	public ShoppingCartDto updateProductQtyFromCart(CustomerDto customer,ProductDto product, int quantity);
	
	public OrderDto doOrder(CustomerDto customer, ShoppingCartDto shoppingCart, String deliveryAdress);
	
	public void doTest();
	
}
