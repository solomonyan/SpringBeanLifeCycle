package hk.solostudio.sblc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import AOP.Student;
import LifeCycle.ModelForLifeCycle;

public class Run {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-config.xml");
		
//		LifeCycle
		ModelForLifeCycle lc = context.getBean(ModelForLifeCycle.class);
		lc.getMessage();
		context.registerShutdownHook();
		
//		AOP
		Student student = (Student) context.getBean("student");
		student.getName();
		student.getAge();
		student.printThrowException();

	}

}
