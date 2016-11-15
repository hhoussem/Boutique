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

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
