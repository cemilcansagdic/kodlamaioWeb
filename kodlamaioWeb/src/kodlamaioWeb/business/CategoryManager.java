package kodlamaioWeb.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaioWeb.core.logging.Logger;
import kodlamaioWeb.dataAccess.CategoryDao;
import kodlamaioWeb.entities.Category;

public class CategoryManager {

	private CategoryDao cDao;
	private List<Category> categories;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.cDao = categoryDao;
		this.loggers = loggers;
		categories = new ArrayList<Category>();
	}
	
	public void AddCategory(Category c) throws Exception{
		for (Category category : categories) {
			if (category.getCategoryName().equals(c.getCategoryName())) {
				throw new Exception("Bu isimde bir kategori mevcut");				
			}
		}
		
		cDao.add(c);
		
		for (Logger logger : loggers) {
			logger.log("Loglandı: " + c.getCategoryName());
		}

		
	}
	
}
