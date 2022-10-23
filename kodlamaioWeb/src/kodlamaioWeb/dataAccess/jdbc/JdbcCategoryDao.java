package kodlamaioWeb.dataAccess.jdbc;

import kodlamaioWeb.dataAccess.CategoryDao;
import kodlamaioWeb.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	
	@Override
	public void add(Category category) {
		System.out.println("JDBC ile veritabanına eklendi.");	
	}
}
