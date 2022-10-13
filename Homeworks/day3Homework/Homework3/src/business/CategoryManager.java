package business;

import core.Logger;
import dataAccess.CategoryDao;
import entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private Category[] categories;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {
		
		for (Category _category : categories) {
			if(_category.getName().toLowerCase()==category.getName().toLowerCase()) {
				throw new Exception("Bu Kategori Ismi Mevcuttur.Lutfen Baska Bir Kategori Ismi Giriniz!");
			}
		}
		
		System.out.println("Kategori Eklendi"); //database kodları
		categoryDao.add(category);
		
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
	}
}
