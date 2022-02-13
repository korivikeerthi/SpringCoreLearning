package com.spring.core.UsingAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 * @Configuration annotation indicates that a class declares one or more @Bean methods ,
 * and may be processed by the Spring container to generate bean definitions and ,
 * service requests for those beans at runtime.
 * 
 */


@Configuration
// @ComponentScan
public class CollegeConfig {

/*
 * using @Bean annotation
 */
	
	// now we have to create two beans , one is for college and the other one for the Principal(refer college.java)
	@Bean
	public  Courses student() { // internally , Courses student = new CseStudent(); object is created for the implemented class only
		return new CseStudent();
	}
	@Bean
	public Principal princi() {
		Principal princi = new Principal();
		return princi ;
	}
	@Bean
	public college college(){
		// return new college(princi()); // here we are injecting the object created using the princi() method... 
	
		college coll = new college(princi());
		coll.setCourse(student());
		return coll;
		
	}

}


