package fr.alma.soa.boutique.infra.repository;

import java.util.List;

import fr.alma.soa.boutique.domaine.model.Category;

public interface CategoryRepo {
	
	public Category getCategoryById(int id);
	
	public List<Category> getAllCategories();

}
