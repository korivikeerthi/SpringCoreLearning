package constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class School {
	
	/*						CONSTRUCTOR INJECTION
	Student s = new Student();
	s.displayInfo();

In the above example we are creating the objects , but we want spring to take care of object creation and managing it along
We are gonna look at the Dependency injection , so what is dependency injection ?
Assigning values to the dependencies is what is Dependency Injection. What are dependencies ?
So say for Student class , each student must have a name / id to identify them, These are called dependencies.
There are two ways by which you can inject the dependencies
	1. Setter Injection
	2. Constructor Injection
	
Setter Injection - we make use of Setter methods, you remember when we use getters and setters ?
We tend to use them when the variables/literals are private to that specific class

eg: 

		public class Student{
		
			private string name;
			private int id;
		
		}
		
the above variables cannot be directly accessed , they need to be called via getters and setters.

*/	
	
	

	public static void main(String[] args) {
		

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Student stud1 = applicationContext.getBean("student-cons", Student.class);
		stud1.displayInfo();
		
		
		
	}
}
