package fr.alma.soa.boutique.domaine.model.impl;

import fr.alma.soa.boutique.domaine.model.ICategory;

public class Category implements ICategory {
	private int id;
	

	private String name;

	

	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Category() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}

}
