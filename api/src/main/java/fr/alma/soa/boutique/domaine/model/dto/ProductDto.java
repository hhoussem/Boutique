package fr.alma.soa.boutique.domaine.model.dto;

import java.io.Serializable;

public class ProductDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private String description;
	private float price;
	private CategoryDto category;
	private int stockQty;

	public ProductDto(int id, String name, String description, float price, CategoryDto category) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.category = category;
	}

	public ProductDto() {
		// TODO Auto-generated constructor stub
	}

	public ProductDto(int id2) {
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

	public CategoryDto getCategory() {
		return category;
	}

	public void setCategory(CategoryDto category) {
		this.category = category;
	}

	public int getStockQty() {
		return stockQty;
	}

	public void setStockQty(int stock) {
		stockQty = stock;
	}

	public boolean equals(ProductDto productDto) {
		return this.getId()==productDto.getId();
	}

}
