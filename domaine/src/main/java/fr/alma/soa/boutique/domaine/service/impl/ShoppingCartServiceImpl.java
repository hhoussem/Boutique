package fr.alma.soa.boutique.domaine.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.alma.soa.boutique.api.exception.BusinessException;
import fr.alma.soa.boutique.domaine.model.ICustomer;
import fr.alma.soa.boutique.domaine.model.IOrder;
import fr.alma.soa.boutique.domaine.model.IProduct;
import fr.alma.soa.boutique.domaine.model.IShoppingCart;
import fr.alma.soa.boutique.domaine.service.ShoppingCartService;
import fr.alma.soa.boutique.infra.repository.ProductRepo;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
	
	@Autowired
	private ProductRepo productRepo;

	public IShoppingCart addProductToCaddy(ICustomer customer,IShoppingCart shoppingCart, IProduct prd, int quantity) throws BusinessException {
		IProduct product = productRepo.getProductById(prd.getId());
		if(product!=null){
			if(isProductAvailable(prd.getId(), quantity)){
				//Put here if there are something to do before adding the product to the shopping-cart
				shoppingCart.addProduct(product, quantity);
			}else{
				throw new BusinessException("Quantité du produit indisponible!");
			}
		}else{
			throw new BusinessException("Produit introuvalbe!");
		}
		return shoppingCart;
	}

	public IOrder doOrder(ICustomer customer, IShoppingCart shoppingCart, String deliveryAdress) {
		return null;
	}
	
	public boolean isProductAvailable(int productId, int quantity){
		IProduct product = productRepo.getProductById(productId);
		if(product!=null){
			return product.getStock()>=quantity;
		}
		return false;
	}


}
