package fr.alma.soa.boutique.domaine.service.impl;

import java.util.ArrayList;
import java.util.List;

import fr.alma.soa.boutique.domaine.factory.DtoModelFactory;
import fr.alma.soa.boutique.domaine.factory.ModelFactory;
import fr.alma.soa.boutique.domaine.model.Category;
import fr.alma.soa.boutique.domaine.model.dto.CategoryDto;
import fr.alma.soa.boutique.domaine.service.CategoryService;
import fr.alma.soa.boutique.infra.repository.CategoryRepo;

public class CategoryServiceImpl implements CategoryService{

	private CategoryRepo categoryRepo;
	private ModelFactory modelFactory;
	private DtoModelFactory dtoModelFactory;
	
	public void setCategoryRepo(CategoryRepo categoryRepo) {
		this.categoryRepo = categoryRepo;
	}

	public void setModelFactory(ModelFactory modelFactory) {
		this.modelFactory = modelFactory;
	}
	
	public void setDtoModelFactory(DtoModelFactory dtoModelFactory) {
		this.dtoModelFactory = dtoModelFactory;
	}

	
	public List<CategoryDto> getAllCategories() {
		List<CategoryDto> categories = new ArrayList<CategoryDto>();
		for(Category pr : categoryRepo.getAllCategories()){
			categories.add(dtoModelFactory.getCategoryInstance(pr));
		}
		return categories;
	}

	public CategoryDto getCategoryById(int id) {
		
		return dtoModelFactory.getCategoryInstance(categoryRepo.getCategoryById(id));
	}

}
