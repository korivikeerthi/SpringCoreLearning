package com.spring.core.UsingAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		/*in-order to close the context , as there is a warning being thrown up saying "context is never closed"
		 * we are going to change the ApplicationContext which is an interface, we gonna make it AnnotationConfigApplicationContext, so
		 * that we can take the reference of the class instead of an interface and make use of the close method to close the application context
		 */
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		college college = context.getBean(college.class);
		college.letscallPrinci();
		college.courseEnrolled();
		System.out.println("Ok so the object is created " + college);
		context.close();
	}
}
