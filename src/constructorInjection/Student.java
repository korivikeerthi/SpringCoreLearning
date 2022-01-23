package constructorInjection;

public class Student {

	// literals
	private String Name;
	private int id;
	
	public Student(String Name , int id) {
		this.Name = Name;
		this.id = id;
	}


	public void displayInfo() {
		System.out.println("Student Id :"+" "+id+"\n"+"Student Name : "+Name);
	}
}
