package fr.alma.soa.boutique.domaine.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.alma.soa.boutique.api.exception.BusinessException;
import fr.alma.soa.boutique.domaine.model.ICustomer;
import fr.alma.soa.boutique.domaine.model.IOrder;
import fr.alma.soa.boutique.domaine.model.IProduct;
import fr.alma.soa.boutique.domaine.model.IShoppingCart;
import fr.alma.soa.boutique.domaine.service.ShoppingCartService;
import fr.alma.soa.boutique.infra.repository.ProductRepo;
import fr.alma.soa.boutique.infra.repository.ShoppingCartRepo;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

	@Autowired
	private ProductRepo productRepo;
	
	@Autowired
	private ShoppingCartRepo shoppingCartRepo;

	public IShoppingCart addProductToCart(ICustomer customer, IProduct prd, int quantity)
			throws BusinessException {
		IProduct product = productRepo.getProductById(prd.getId());
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

	public IOrder doOrder(ICustomer customer, IShoppingCart shoppingCart, String deliveryAdress) {
		return null;
	}

	public boolean isProductAvailable(int productId, int quantity) {
		IProduct product = productRepo.getProductById(productId);
		if (product != null) {
			return product.getStockQty() >= quantity;
		}
		return false;
	}


	public IShoppingCart removeProductFromCart(ICustomer customer, IProduct product) {
		if(customer.getShoppingCart().getProduct(product.getId()) != null){
			return customer.getShoppingCart();
		}
		return null;
	}

	public IShoppingCart updateProductQtyFromCart(ICustomer customer, IProduct product, int quantity) {
		
		return customer.getShoppingCart();
	}
	
	

}
