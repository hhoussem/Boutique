package fr.alma.soa.boutique.application.webservice;


import fr.alma.soa.boutique.api.exception.BusinessException;
import fr.alma.soa.boutique.application.ApplicationEntry;
import fr.alma.soa.boutique.domaine.model.ICustomer;
import fr.alma.soa.boutique.domaine.model.IProduct;
import fr.alma.soa.boutique.domaine.model.IShoppingCart;
import fr.alma.soa.boutique.domaine.service.ShoppingCartService;

public class BoutiqueWebServices extends ApplicationEntry {

	private ShoppingCartService shoppingCartService;
	
	public BoutiqueWebServices(){
		super();
		this.shoppingCartService = context.getBean(ShoppingCartService.class);
	}
	
	public IShoppingCart addProductToCaddy(ICustomer customer,IShoppingCart shoppingCart, IProduct products, int quantity) {
		try {
			return shoppingCartService.addProductToCaddy(customer, shoppingCart, products, quantity);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		return null;
	}
}
