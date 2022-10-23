package kodlamaioWeb.dataAccess.jdbc;

import kodlamaioWeb.dataAccess.CourseDao;
import kodlamaioWeb.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Kurs JDBC ile eklendi.");
		
	}

}
