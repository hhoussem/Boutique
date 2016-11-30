package fr.alma.soa.boutique.domaine.service;

import java.util.List;

import fr.alma.soa.boutique.domaine.model.dto.CategoryDto;

public interface CategoryService {
	
	public List<CategoryDto> getAllCategories();
	
	public CategoryDto getCategoryById(int id);
}
