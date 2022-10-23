package kodlamaioWeb.dataAccess.hibernate;

import kodlamaioWeb.dataAccess.CategoryDao;
import kodlamaioWeb.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile eklendi: " + category.getCategoryName());
		
	}

}
