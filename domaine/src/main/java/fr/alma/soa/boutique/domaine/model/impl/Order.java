package fr.alma.soa.boutique.domaine.model.impl;

import java.util.Date;

import fr.alma.soa.boutique.domaine.model.ICustomer;
import fr.alma.soa.boutique.domaine.model.IOrder;
import fr.alma.soa.boutique.domaine.model.IShoppingCart;

public class Order  implements IOrder{
	private String numOrder;
	private IShoppingCart shoppingCart;
	private double priceTTC;
	private String deliveryAdress;
	private ICustomer customer;
	private Date orderDate;
	private String status;
	
	public String getNumOrder() {
		return numOrder;
	}
	public void setNumOrder(String numOrder) {
		this.numOrder = numOrder;
	}
	public IShoppingCart getShoppingCart() {
		return shoppingCart;
	}
	public void setShoppingCart(IShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	public double getPriceTTC() {
		return priceTTC;
	}
	public void setPriceTTC(double priceTTC) {
		this.priceTTC = priceTTC;
	}
	public String getDeliveryAdress() {
		return deliveryAdress;
	}
	public void setDeliveryAdress(String deliveryAdress) {
		this.deliveryAdress = deliveryAdress;
	}
	public ICustomer getCustomer() {
		return customer;
	}
	public void setCustomer(ICustomer customer) {
		this.customer = customer;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}


}
