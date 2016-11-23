package fr.alma.soa.boutique.domaine.model;

public interface ICustomer extends IModel {

	public boolean addToChar(IProduct product, int qty);

	public void removeFromChar(IProduct product);

	public boolean buy();

	public String getEmail();
	
	public void setEmail(String email);

	public String getPassword();

	public void setPassword(String password);

	public String getName();

	public void setName(String name);

	public String getAddress();

	public void setAddress(String address);

	public String getCreditCardInfo();

	public void setCreditCardInfo(String creditCardInfo);

	public boolean isLogged();

	public void setLogged(boolean isLogged);

	public IShoppingCart getShoppingCart();

	public void setShoppingCart(IShoppingCart shoppingCart);

}
