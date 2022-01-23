package di;

public class Student {

	// literals
	private String Name;
	private int id;
	
	public void setName(String name) {
		Name = name;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void displayInfo() {
		System.out.println("Student Id :"+" "+id+"\n"+"Student Name : "+Name);
	}
}
