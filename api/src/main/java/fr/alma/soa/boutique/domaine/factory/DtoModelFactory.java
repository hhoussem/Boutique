package fr.alma.soa.boutique.domaine.factory;

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

public interface DtoModelFactory {
	
	public ProductDto getProductInstance(Product entity);
	
	public CategoryDto getCategoryInstance(Category entity);

	public CustomerDto getCustomerInstance(Customer entity);
	
	public ShoppingCartDto getCartInstance(ShoppingCart entity);
	

	public OrderDto getOrderInstance(Order entity);



}
