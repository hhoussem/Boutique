package fr.alma.soa.boutique.domaine.model;

import fr.alma.soa.boutique.domaine.model.impl.Category;

public interface IProduct {

	public int getId();

	public String getName();

	public String getDescription();

	public float getPrice();

	public Category getCategory();

}
