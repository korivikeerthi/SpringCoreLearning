package usingPropertiesFile;

public class Student {

	private String name;
	private String course;
	private String interest;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}
	
	public void displayInfo() {
		System.out.println("Student Name is"+" "+name+" "+"\n"+"He/she is enrolled for the course:"+course+"\n"+"and his/her interest is:"+interest);
	}
}
