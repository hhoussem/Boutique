package fr.alma.soa.boutique.domaine.service.impl;

import fr.alma.soa.boutique.api.exception.BusinessException;
import fr.alma.soa.boutique.domaine.model.dto.*;
import fr.alma.soa.boutique.domaine.factory.DtoModelFactory;
import fr.alma.soa.boutique.domaine.factory.ModelFactory;
import fr.alma.soa.boutique.domaine.model.Product;
import fr.alma.soa.boutique.domaine.model.ShoppingCart;
import fr.alma.soa.boutique.domaine.service.ShoppingCartService;
import fr.alma.soa.boutique.infra.repository.ProductRepo;
import fr.alma.soa.boutique.infra.repository.ShoppingCartRepo;

public class ShoppingCartServiceImpl implements ShoppingCartService {

	private ProductRepo productRepo;
	
	private ShoppingCartRepo shoppingCartRepo;
	
	private ModelFactory modelFactory;
	
	private DtoModelFactory dtoModelFactory;
	
	public void setProductRepo(ProductRepo productRepo) {
		this.productRepo = productRepo;
	}

	public void setShoppingCartRepo(ShoppingCartRepo shoppingCartRepo) {
		this.shoppingCartRepo = shoppingCartRepo;
	}

	public void setModelFactory(ModelFactory modelFactory) {
		this.modelFactory = modelFactory;
	}

	public void setDtoModelFactory(DtoModelFactory dtoModelFactory) {
		this.dtoModelFactory = dtoModelFactory;
	}


	public ShoppingCartDto addProductToCart(CustomerDto customer,ProductDto prd, int quantity) throws BusinessException{
		Product product = productRepo.getProductById(prd.getId());
		ShoppingCartDto cart =null;
		if(product != null) {
			if(isProductAvailable(prd.getId(), quantity)) {
				cart = dtoModelFactory.getCartInstance(shoppingCartRepo.addProductToCart(modelFactory.getCustomerInstance(customer), product, quantity));
			} else {
				throw new BusinessException("Requested quantity not available!");
			}
		} else {
			throw new BusinessException("Product not found!");
		}
		return cart;
	}

	public boolean isProductAvailable(int productId, int quantity) {
		Product product = productRepo.getProductById(productId);
		if (product != null) {
			return product.getStockQty() >= quantity;
		}
		return false;
	}


	public ShoppingCartDto removeProductFromCart(CustomerDto customer, ProductDto product) {
		ShoppingCartDto cart = null;
		if(customer.getShoppingCart().getProduct(product.getId()) != null){
			 cart = dtoModelFactory.getCartInstance(shoppingCartRepo.removeProductFromCart(modelFactory.getCustomerInstance(customer), modelFactory.getProductInstance(product)));
		}
		return cart;
	}

	public ShoppingCartDto updateProductQtyFromCart(CustomerDto customer, ProductDto product, int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	public OrderDto doOrder(CustomerDto customer, ShoppingCartDto shoppingCart, String deliveryAdress) {
		// TODO Auto-generated method stub
		return null;
	}

	public void doTest() {
		dtoModelFactory.getCartInstance(new ShoppingCart());
	}

	
	

}
