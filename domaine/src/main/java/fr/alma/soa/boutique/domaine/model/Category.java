package fr.alma.soa.boutique.domaine.model;

public class Category {
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