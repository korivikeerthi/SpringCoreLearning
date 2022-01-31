package usingPropertiesFile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	private String name;
	@Value("${Student.course}")
	private String course;
	@Value("${Student.interest}")
	private String interest;

// this is the way in which we configure the @Value annotation on top of the method declaration @Value("${Student.name}")
	
/*
 * @Autowired / @Required 
 * 
 * 	This annotation is used in-order to tell spring that create an object/bean only when that particular value is given
 * 
 * 	so in the below example we are saying " spring - don't create a bean unless the student.name is given
 * 
 */
	
	@Value("${Student.name}")
	@Autowired  // this is used here instead of @Required annotation as , it is deprecated 
	public void setName(String name) {
		this.name = name;
	}
	@Value("${Student.course}")
	public void setCourse(String course) {
		this.course = course;
	}
	@Value("${Student.interest}")
	public void setInterest(String interest) {
		this.interest = interest;
	}
	
	public void displayInfo() {
		System.out.println("Student Name is"+" "+name+" "+"\n"+"He/she is enrolled for the course:"+course+"\n"+"and his/her interest is:"+interest);
	}
}
