
public class Student implements Cloneable {
	
	private int id;
	private String name;
	private Course course;
	public Student(int id, String name, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Course getCourse() {
		
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	/*@Override    for Shallow cloning
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();		
		
	}*/
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (this.id+" "+this.name+" "+this.course);
	}
	
	@Override //for Deep Cloning
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		  Student student = (Student) super.clone();
		  
	      student.course = (Course) course.clone();
	 
	     return student;
	}
	
	

}
