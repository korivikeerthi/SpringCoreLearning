package dependencyInjection.objectReference;

import java.util.logging.Logger;

import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class School {

	public static void main(String[] args) {
		/* 
		  	Student s = new Student();
			SubjectMaterials mat = new SubjectMaterials();
			mat.Materials();
			s.distributeMaterials();
		*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Student s1 = context.getBean("stud1",Student.class);
		s1.distributeMaterials();
		Teacher T1 = context.getBean("Teach1",Teacher.class);
		T1.sendMaterials();
		
		
		
	}
}
