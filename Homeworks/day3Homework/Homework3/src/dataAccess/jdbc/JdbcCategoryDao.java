package dataAccess.jdbc;

import dataAccess.CategoryDao;
import entities.Category;

public class JdbcCategoryDao implements CategoryDao{
	
	
	public void add(Category category) {
		System.out.println("Jdbc ile Eklendi. " + category);
		
	}
	
}
