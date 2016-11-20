package fr.alma.soa.boutique.domaine.model;

import java.util.Date;

public interface IOrder extends IModel {

	public String getNumOrder();
	public void setNumOrder(String numOrder);
	public IShoppingCart getShoppingCart();
	public void setShoppingCart(IShoppingCart shoppingCart);
	public double getPriceTTC();
	public void setPriceTTC(double priceTTC);
	public String getDeliveryAdress();
	public void setDeliveryAdress(String deliveryAdress);
	public ICustomer getCustomer();
	public void setCustomer(ICustomer customer);
	public Date getOrderDate();
	public void setOrderDate(Date orderDate);
	public String getStatus();
	public void setStatus(String status);
}
