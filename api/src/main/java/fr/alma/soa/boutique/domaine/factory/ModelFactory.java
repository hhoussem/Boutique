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

public interface ModelFactory {

	public Product getProductInstance(ProductDto dto);
	
	public Category getCategoryInstance(CategoryDto dto);

	public Customer getCustomerInstance(CustomerDto dto);
	
	public ShoppingCart getCartInstance(ShoppingCartDto dto);
	

	public Order getOrderInstance(OrderDto dto);


}
