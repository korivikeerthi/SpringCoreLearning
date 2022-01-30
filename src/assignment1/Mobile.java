package assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("AssignmentAC.xml");
		Airtel user1 = context.getBean("serviceprovider", Airtel.class);
		user1.showActiveServices();
	}

}
