To utlize spring IoC you need to add externals jars like spring-{verion_number}.jar and commons-logging.jar in the project.
<br/>
In this example code, we have already added these in the pom.xml file<br/>
Employee object has dependency on Address object.

To achieve Inversion of Control;
Employee and Address Object attribute values are given in the EmployeeBean.xml

In Demo class, objects are constructed using BeanFactory and ApplicationContext using the values declared in the EmployeeBean.xml

BeanFactory is Spring's IoC container parses the EmployeeBean.xml file and constructs objects when requested.
<br/>
ApplicationContext is another Spring's IoC container, which is an implementation of the BeanFactory.
<br/>
ApplicationContext creates objects eventhough we don't request but the BeanFactory creates objects only if request.
<br/>
Address object is injected to Employee object in two ways:<br/>
Dependency injection is achived by giving Address object as argument in the Employee Constructor and constructor-arg
in the Employeebean.xml 
<br/>
DI is also achived using setter Injection by giving Address object in the argument of setAddress method of Employee class
and property name="address" ref="adrs" in the EmployeeBean.xml.


