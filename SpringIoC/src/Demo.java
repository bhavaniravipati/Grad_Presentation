import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Demo {

	public static void main(String[] args) {

		//Spring way | IoC(Inversion of Control)
		
		Resource resource= new ClassPathResource("Employeebean.xml");
		
		//BeanFactory creates objects only if you request to do so
		BeanFactory factory=new XmlBeanFactory(resource); //Spring core Container 
															//which parses XML file and construct objects
		
		//Is one of the core containers in Spring framework  which is used to achieve IOC, it's basically implementation of BeanFactory
		// ApplicationContext creates objects for you even though you don't request for those
		ApplicationContext context= new ClassPathXmlApplicationContext("Employeebean.xml");
		
		
		
		Employee e1=(Employee) context.getBean("emp1");
		Employee e2=(Employee) context.getBean("emp2");
				

		Employee e3=(Employee) factory.getBean("emp1");
		Employee e4=(Employee) factory.getBean("emp2");
		
		System.out.println("Employee Details"+e1);
		
		ClassPathXmlApplicationContext cxt=(ClassPathXmlApplicationContext)context;
		cxt.close();
		
		System.out.println("Employee2 Details"+e2);
		System.out.println("Employee1 Details"+e3);
		System.out.println("Employee2 Details"+e4);
		
		
	}

}
