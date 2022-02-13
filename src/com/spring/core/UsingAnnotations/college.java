package com.spring.core.UsingAnnotations;

import org.springframework.stereotype.Component;

/*
 * Previously we used to configure bean.xml file inorder to create a bean
 * Now we gonna eliminate the usage of configuration file completely and gonna introduce the annotation way
 * of creating the beans
 * 
 * instead of bean tag , we gonna use @Component annotation to create a bean
 * @Component is a class level annotation.
 * 
 * instead of configuration file , i.e beans.xml we gonna use , @Configuration annotation 
 * 
 * inorder to make spring understand that , from where it needs to look for and create the bean we use  
 * 
 * @ComponentScan -  this searches for @Component annotation in the given package , this annotation is used along with 
 * @Configuration to tell spring to scan all the classes that are denoted with any annotation
 * 
 * 
 * The @ComponentScan annotation is an alternative to <context:component-scan> XML tag.
 * 
 */

// when we don't give any bean id for the @Component annotation , spring takes the class name as the bean id @Component("college")

/*
 * another way to create bean is using the @Bean annotation , here the method name will be considered as the bean-id
 * */
//@Component
public class college {

	/* 
	 * Now say i have a dependency , we will see how to inject the dependency using the @Bean annotation*/
	private Principal principal;

	private Courses course; // this is an interface
	
	// Inorder to inject the value we can do it either using the constructor or the getters/setters method
	public college(Principal principal) {
		this.principal = principal;
	}
	public void letscallPrinci() {
		principal.princi();
		course.ComputerScience();
		System.out.println("We are done , the object is created and it is injected");
	}
	public void setCourse(Courses course) {
		this.course = course;
	}
	public void courseEnrolled() {
		course.ComputerScience();
	}
}



