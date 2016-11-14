
package fr.alma.soa.boutique.domaine.model;

public class Customer {
	
	private String email;
	private String password; 
	private String name;
	private String address;
	private String creditCardInfo;
	private boolean isLogged;
	private ShoppingCart shoppingCart;
	
	public Customer(String email, String password, String name) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.isLogged = false;
		this.shoppingCart = new ShoppingCart();
	}
	
	public boolean addToChar(Product product, int qty){
		return shoppingCart.addProduct(product, qty);
	}
	public void removeFromChar(Product product){
		shoppingCart.removeProduct(product);
	}
	public boolean buy()
	{
		if(getShoppingCart().valideCart())
		{
			return true;
		}
		return false;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCreditCardInfo() {
		return creditCardInfo;
	}
	public void setCreditCardInfo(String creditCardInfo) {
		this.creditCardInfo = creditCardInfo;
	}
	public boolean isLogged() {
		return isLogged;
	}
	public void setLogged(boolean isLogged) {
		this.isLogged = isLogged;
	}
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}
	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	
}