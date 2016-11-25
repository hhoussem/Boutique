package fr.alma.soa.boutique.domaine.model.impl;

import fr.alma.soa.boutique.domaine.model.ICategory;
import fr.alma.soa.boutique.domaine.model.IProduct;

public class Product implements IProduct {
	private int id;
	private String name;
	private String description;
	private float price;
	private ICategory category;
	private int stockQty;

	public Product(int id, String name, String description, float price, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.category = category;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int id2) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public ICategory getCategory() {
		return category;
	}

	public void setCategory(ICategory category) {
		this.category = category;
	}

	public int getStockQty() {
		return stockQty;
	}

	public void setStockQty(int stock) {
		stockQty = stock;
	}

	public boolean equals(IProduct product) {
		return this.getId()==product.getId();
	}

}
