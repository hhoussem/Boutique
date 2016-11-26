package fr.alma.soa.boutique.domaine.model;

import java.util.Date;

import fr.alma.soa.boutique.domaine.model.Customer;
import fr.alma.soa.boutique.domaine.model.Order;
import fr.alma.soa.boutique.domaine.model.ShoppingCart;

public class Order{
	private String numOrder;
	private ShoppingCart shoppingCart;
	private double priceTTC;
	private String deliveryAdress;
	private Customer customer;
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
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
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
