package fr.alma.soa.boutique.domaine.model;


public interface IProduct extends IModel {

	public int getId();

	public String getName();

	public String getDescription();

	public float getPrice();

	public ICategory getCategory();

	public int getStock();

	public void setId(int id);

	public void setName(String name);
	
	public void setDescription(String description);

	public void setPrice(float price);

	public void setCategory(ICategory category);

	public void setStock(int stock);
}
