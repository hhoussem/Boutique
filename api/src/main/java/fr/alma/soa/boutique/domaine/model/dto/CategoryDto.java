package fr.alma.soa.boutique.domaine.model.dto;

import fr.alma.soa.boutique.domaine.model.Category;

public class CategoryDto{
	private int id;
	

	private String name;

	

	public CategoryDto(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public CategoryDto() {
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
