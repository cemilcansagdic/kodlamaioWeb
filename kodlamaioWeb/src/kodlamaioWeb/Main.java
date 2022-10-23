package kodlamaioWeb;

import java.util.List;

import kodlamaioWeb.business.CategoryManager;
import kodlamaioWeb.core.logging.DatabaseLogger;
import kodlamaioWeb.core.logging.Logger;
import kodlamaioWeb.core.logging.MailLogger;
import kodlamaioWeb.dataAccess.jdbc.JdbcCategoryDao;
import kodlamaioWeb.entities.Category;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Category category = new Category(1,"Programlama");
		Logger[] loggers = {new MailLogger(), new DatabaseLogger()};
		
		CategoryManager manager = new CategoryManager(new JdbcCategoryDao(), loggers);
		manager.AddCategory(category);
		
	}
}
