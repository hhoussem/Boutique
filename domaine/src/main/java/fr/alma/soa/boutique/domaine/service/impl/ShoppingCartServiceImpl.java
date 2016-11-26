package fr.alma.soa.boutique.domaine.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.alma.soa.boutique.api.exception.BusinessException;
import fr.alma.soa.boutique.domaine.model.Customer;
import fr.alma.soa.boutique.domaine.model.Order;
import fr.alma.soa.boutique.domaine.model.Product;
import fr.alma.soa.boutique.domaine.model.ShoppingCart;
import fr.alma.soa.boutique.domaine.service.ShoppingCartService;
import fr.alma.soa.boutique.infra.repository.ProductRepo;
import fr.alma.soa.boutique.infra.repository.ShoppingCartRepo;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

	@Autowired
	private ProductRepo productRepo;
	
	@Autowired
	private ShoppingCartRepo shoppingCartRepo;

	public ShoppingCart addProductToCart(Customer customer, Product prd, int quantity)
			throws BusinessException {
		Product product = productRepo.getProductById(prd.getId());
		if(product != null) {
			if(isProductAvailable(prd.getId(), quantity)) {
				customer.getShoppingCart().addProduct(product, quantity);
			} else {
				throw new BusinessException("Requested quantity not available!");
			}
		} else {
			throw new BusinessException("Product not found!");
		}
		return customer.getShoppingCart();
	}

	public Order doOrder(Customer customer, ShoppingCart shoppingCart, String deliveryAdress) {
		return null;
	}

	public boolean isProductAvailable(int productId, int quantity) {
		Product product = productRepo.getProductById(productId);
		if (product != null) {
			return product.getStockQty() >= quantity;
		}
		return false;
	}


	public ShoppingCart removeProductFromCart(Customer customer, Product product) {
		if(customer.getShoppingCart().getProduct(product.getId()) != null){
			return customer.getShoppingCart();
		}
		return null;
	}

	public ShoppingCart updateProductQtyFromCart(Customer customer, Product product, int quantity) {
		
		return customer.getShoppingCart();
	}
	
	

}
