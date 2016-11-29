package fr.alma.soa.boutique.domaine.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import fr.alma.soa.boutique.api.annotation.Factory;
import fr.alma.soa.boutique.domaine.model.Category;
import fr.alma.soa.boutique.domaine.model.Customer;
import fr.alma.soa.boutique.domaine.model.Order;
import fr.alma.soa.boutique.domaine.model.Product;
import fr.alma.soa.boutique.domaine.model.ShoppingCart;
import fr.alma.soa.boutique.domaine.model.dto.*;

public class DtoModelFactoryImpl implements  DtoModelFactory{

	/*
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
	}*/

	public ProductDto getProductInstance(Product entity){
		ProductDto product=null;
		if(entity!=null){
			product = new ProductDto();
			product.setId(entity.getId());
			product.setPrice(entity.getPrice());
			product.setName(entity.getName()!=null ? entity.getName() : null);
			product.setCategory(getCategoryInstance(entity.getCategory()));
			product.setDescription((entity.getDescription()!=null ? entity.getDescription() : null));
		}
		return product;
	}
	
	public CategoryDto getCategoryInstance(Category entity){
		CategoryDto category = null;
		if(entity!=null){
			category = new CategoryDto();
			category.setId(entity.getId());
			category.setName(entity.getName()!=null ? entity.getName() : null);
		}
		return category;
	}

	public CustomerDto getCustomerInstance(Customer entity){
		CustomerDto customer = null;
		if(entity!=null){
			customer = new CustomerDto();
			customer.setId(entity.getId());
			customer.setName(entity.getName()!=null ? entity.getName() : null);
			customer.setAddress(entity.getAddress()!=null ? entity.getAddress() : null);
			customer.setCreditCardInfo(entity.getCreditCardInfo()!=null ? entity.getCreditCardInfo() : null);
			customer.setEmail(entity.getEmail()!=null ? entity.getEmail() : null);
			customer.setLogged(entity.isLogged());
			customer.setPassword(entity.getPassword()!=null ? entity.getPassword() : null);
			customer.setShoppingCart(entity.getShoppingCart()!=null ? getCartInstance(entity.getShoppingCart()) : null);
		}
		return customer;
	}
	
	public ShoppingCartDto getCartInstance(ShoppingCart entity){
		ShoppingCartDto cart = null;
		if(entity!=null){
			cart = new ShoppingCartDto();
			//cart.setId(entity.getId());
			Map<ProductDto, Integer> products = new HashMap<ProductDto, Integer>();
			for(Entry<Product, Integer> entry : entity.getProducts().entrySet()){
				products.put(getProductInstance(entry.getKey()), entry.getValue());
			}
			cart.setProducts(products);
		}
		return cart;
	}
	

	public OrderDto getOrderInstance(Order entity){
		OrderDto order = null;
		if(entity!=null){
			order = new OrderDto();
			order.setCustomer(getCustomerInstance(entity.getCustomer()));
			order.setDeliveryAdress(entity.getDeliveryAdress()!=null ? entity.getDeliveryAdress() : null);
			order.setNumOrder(entity.getNumOrder()!=null ? entity.getNumOrder() : null);
			order.setOrderDate(entity.getOrderDate()!=null ? entity.getOrderDate() : null);
			order.setPriceTTC(entity.getPriceTTC());
			order.setStatus(entity.getStatus()!=null ? entity.getStatus() : null);
		}
		return order;
	}

}
