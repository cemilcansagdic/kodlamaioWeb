package kodlamaioWeb.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaioWeb.core.logging.Logger;
import kodlamaioWeb.dataAccess.CourseDao;
import kodlamaioWeb.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private List<Course> courses;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		courses = new ArrayList<Course>();
	}
	
	public void add(Course course) throws Exception {
		for (Course c : courses) {
			if (c.getName().equals(course.getName())) {
				throw new Exception("Aynı isimde bir kurs mevcut");
			}
		}
		
		if (course.getPrice() < 0) {
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz");
		}
		
		courseDao.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}

	
	
}
