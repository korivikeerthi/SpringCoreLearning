package com.spring.core.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		
/* so we have to create objects for each class like this , in case if a new Sim arrives to the market we need to modify the source code
again, so this is why spring has been introduced, spring-framework creates the objects and it manages it. There is Spring IOC container
inside which the objects are created , the spring framework refers to a config file and that config file contains the details of the class
for which the objects needs to be created . And based on that IOD container creates the objects which is otherwise called as beans.
so once the objects are created by the IOC container they can be accessed using .getBean() method , we need to pass in the class for which
we require the object. */
		
		
		
		
		/* Airtel airtel = new Airtel();
		Vodafone vodafone = new Vodafone();
		
		airtel.calling();
		airtel.data();
		*/
		
// so now , we can make use of the interface
//		Sim sim = new Sim(); ------> this is not allowed cuz Interfaces cannot be instantiated in other words we cannot create objects for interfaces
		
		/* Sim sim = new Airtel();
		sim.calling();
		sim.data(); */
		
/* in the above case , methods can be used irrespective of Airtel/Vodafone cuz they both implement the Sim . But what if we don't want to touch the
source code at all */
		
		
/* spring framework 
 * IOC-container is also known as Application context , there are two types of IOC containers , they are nothing but the interfaces
 * 1. BeanFactory
 * 2. Application context
 * 
 * we know that interfaces cannot be instantiated so we need some class which implements the above interfaces
 * 
 * we have a class called ClassPathXmlApplicationContext
		
*/		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		System.out.println("beans created");
		
		Sim sim = context.getBean("sim",Sim.class);
		Sim sim1 = context.getBean("sim1" ,Sim.class);
		sim.calling();
		sim.data();
		sim1.calling();
		sim1.data();
	}

}
