package fr.alma.soa.boutique.domaine.model;

public interface ICategory extends IModel{

	public int getId();

	public String getName();
	
	public void setName(String name);
	
	public void setId(int id);
}
