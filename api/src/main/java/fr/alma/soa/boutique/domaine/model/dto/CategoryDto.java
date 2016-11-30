package fr.alma.soa.boutique.domaine.model.dto;

import java.io.Serializable;

public class CategoryDto implements Serializable{
	
	private static final long serialVersionUID = 1L;

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
