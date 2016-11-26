package fr.alma.soa.boutique.domaine.model.dto;

import java.util.Date;

import fr.alma.soa.boutique.domaine.model.ShoppingCart;

public class OrderDto{
	private String numOrder;
	private ShoppingCart shoppingCart;
	private double priceTTC;
	private String deliveryAdress;
	private CustomerDto customer;
	private Date orderDate;
	private String status;
	
	public String getNumOrder() {
		return numOrder;
	}
	public void setNumOrder(String numOrder) {
		this.numOrder = numOrder;
	}
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}
	public void setShoppingCart(ShoppingCart shoppingCart) {
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
	public CustomerDto getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerDto customer) {
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
