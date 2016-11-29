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
import fr.alma.soa.boutique.domaine.model.dto.CategoryDto;
import fr.alma.soa.boutique.domaine.model.dto.CustomerDto;
import fr.alma.soa.boutique.domaine.model.dto.OrderDto;
import fr.alma.soa.boutique.domaine.model.dto.ProductDto;
import fr.alma.soa.boutique.domaine.model.dto.ShoppingCartDto;

public class ModelFactoryImpl implements  ModelFactory{

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

	public Product getProductInstance(ProductDto dto){
		Product product=null;
		if(dto!=null){
			product = new Product();
			product.setId(dto.getId());
			product.setPrice(dto.getPrice());
			product.setName(dto.getName()!=null ? dto.getName() : null);
			product.setCategory(getCategoryInstance(dto.getCategory()));
			product.setDescription((dto.getDescription()!=null ? dto.getDescription() : null));
		}
		return product;
	}
	
	public Category getCategoryInstance(CategoryDto dto){
		Category category = null;
		if(dto!=null){
			category = new Category();
			category.setId(dto.getId());
			category.setName(dto.getName()!=null ? dto.getName() : null);
		}
		return category;
	}

	public Customer getCustomerInstance(CustomerDto dto){
		Customer customer = null;
		if(dto!=null){
			customer = new Customer();
			customer.setId(dto.getId());
			customer.setName(dto.getName()!=null ? dto.getName() : null);
			customer.setAddress(dto.getAddress()!=null ? dto.getAddress() : null);
			customer.setCreditCardInfo(dto.getCreditCardInfo()!=null ? dto.getCreditCardInfo() : null);
			customer.setEmail(dto.getEmail()!=null ? dto.getEmail() : null);
			customer.setLogged(dto.isLogged());
			customer.setPassword(dto.getPassword()!=null ? dto.getPassword() : null);
			customer.setShoppingCart(dto.getShoppingCart()!=null ? getCartInstance(dto.getShoppingCart()) : null);
		}
		return customer;
	}
	
	public ShoppingCart getCartInstance(ShoppingCartDto dto){
		ShoppingCart cart = null;
		if(dto!=null){
			cart = new ShoppingCart();
			//cart.setId(dto.getId());
			Map<Product, Integer> products = new HashMap<Product, Integer>();
			for(Entry<ProductDto, Integer> entry : dto.getProducts().entrySet()){
				products.put(getProductInstance(entry.getKey()), entry.getValue());
			}
			cart.setProducts(products);
		}
		return cart;
	}
	

	public Order getOrderInstance(OrderDto dto){
		Order order = null;
		if(dto!=null){
			order = new Order();
			order.setCustomer(getCustomerInstance(dto.getCustomer()));
			order.setDeliveryAdress(dto.getDeliveryAdress()!=null ? dto.getDeliveryAdress() : null);
			order.setNumOrder(dto.getNumOrder()!=null ? dto.getNumOrder() : null);
			order.setOrderDate(dto.getOrderDate()!=null ? dto.getOrderDate() : null);
			order.setPriceTTC(dto.getPriceTTC());
			order.setStatus(dto.getStatus()!=null ? dto.getStatus() : null);
		}
		return order;
	}

}
