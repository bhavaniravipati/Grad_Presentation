import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPClass {

	public static void main(String[] args) {
		ApplicationContext appContext= new ClassPathXmlApplicationContext("Customer.xml");
		
		CustomerService cust1=(CustomerService) appContext.getBean("customerServiceProxy1");
		CustomerService cust2=(CustomerService) appContext.getBean("customerServiceProxy2");
		CustomerService cust3=(CustomerService) appContext.getBean("customerServiceProxy3");
		CustomerService cust4=(CustomerService) appContext.getBean("customerServiceProxy4");
		
		System.out.println("******************");
		cust1.printName();
		System.out.println("******************");
		cust1.printUrl();
		System.out.println("******************");
		
		System.out.println("---------------");
		
		System.out.println("******************");
		cust2.printName();
		System.out.println("******************");
		cust2.printUrl();
		System.out.println("******************");
		
		System.out.println("---------------");
		
		System.out.println("******************");
		cust3.printName();
		System.out.println("******************");
		cust3.printUrl();
		System.out.println("******************");
		
		System.out.println("---------------");
		
		System.out.println("******************");
		cust4.printName();
		System.out.println("******************");
		cust4.printUrl();
		System.out.println("******************");
		
		try {
			cust1.printException();
			cust2.printException();
			cust3.printException();
			cust4.printException();
			
		} catch (Exception e) {
			
		}

	}

}
