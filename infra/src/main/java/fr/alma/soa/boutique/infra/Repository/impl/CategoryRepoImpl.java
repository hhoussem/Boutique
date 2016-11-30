package fr.alma.soa.boutique.infra.Repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.alma.soa.boutique.domaine.model.Category;
import fr.alma.soa.boutique.infra.Database;
import fr.alma.soa.boutique.infra.repository.CategoryRepo;


public class CategoryRepoImpl implements CategoryRepo{

	
	private Database database;
	
	public void setDatabase(Database database) {
		this.database = database;
	}
	
	public Category getCategoryById(int id) {
		return database.getCategories().get(id);
	}

	public List<Category> getAllCategories() {
		
		return new ArrayList<Category>(database.getCategories().values());
	}

}
