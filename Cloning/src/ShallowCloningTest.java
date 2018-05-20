
public class ShallowCloningTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Course course= new Course("Maths", "Physics", "Chemistry");
		
		Student student1= new Student(101, "Nag", course);
		
		Student student2 = (Student)student1.clone();
		  
		
		System.out.println(student1.getCourse());
		System.out.println(student2.getCourse());
		
		student1.getCourse().setSubject3("Biology");
		System.out.println(student1.toString());
		System.out.println(student2.toString());

	}

}
