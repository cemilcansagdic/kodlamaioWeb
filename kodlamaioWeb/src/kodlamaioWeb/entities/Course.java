package kodlamaioWeb.entities;

public class Course {
	private int id;
	private Category category;
	private Teacher teacher;
	private String name;
	private double price;
	
	public Course() {
		
	}

	public Course(int id, Category category, Teacher teacher, String name, double price ) {
		this.id = id;
		this.category = category;
		this.teacher = teacher;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
}
