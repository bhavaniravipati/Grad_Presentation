Firstly, to utlize spring framework you need to add spring dependencies to pom.xml file of your project. 
The dependencies include spring-core, spring-context, spring-aop, spring-webmvc, spring-web, jstl. 

In this example code, we have already added these in the pom.xml file.

When a user sends in a web request through a URL, web.xml file will forward all the requests to the DispatcherServlet of our application.
The way we name a Dispatcher Servlet .xml file is servlet-name-servlet.xml. The servlet name in our example is mvc. 
So the Dispatcher Servlet file name in our example code is "mvc-servlet.xml". 

If the request matches the URL pattern of DispatcherServlet then it will be processed by Spring MVC otherwise not.

The DispatcherServlet then passes the request to a specific controller depending on the URL requested. DispatcherServlet will identify 
the controller to which it needs to pass the request to by the arguments given in @RequestMapping annotation via 
Spring MVC configuration file.


In our case, we only have one controller named "HelloWorldController.java". 

So, the request will be sent to the HelloWorldController.java.

We have annotated the HelloWorldController class with @Controller and @RequestMapping("/welcome"). 
When Spring scans our package, it will recognize this bean as being a Controller bean for processing requests as we annotated 
the class with "@Controller". The @RequestMapping annotation tells Spring that this Controller should process all requests 
beginning with "/welcome" in the URL path. That includes /welcome/* and /welcome.html.

The helloWorld() method of "HelloWorldController class" returns ModelAndView object. The ModelAndView object tries to resolve 
to a view named “welcome” and the data model is being passed back to the browser so we can access the data within the JSP. 

The DispatcherServlet will load our HelloWorldController.class through the package name mentioned in "<context:component-scan" tag. Also we have defined a bean viewResolver in the DispatcherServlet. This bean will resolve the view and add prefix string /WEB-INF/jsp/  and suffix .jsp to the view in ModelAndView.

When the HelloWorldController.class returns ModelandView object to ,the DispatcherServlet, mvc-servlet.xml, the logical view name "welcome" is mapped to /WEB-INF/jsp/welcome.jsp via viewResolver bean. Thus, DispatcherServlet contacts the  chosen view "welcome.jsp" and it renders the page in browser depending on the model data. The model data here is "message" data returned by the HelloWorldController.class. 


Read more:

1)https://javarevisited.blogspot.com/2017/06/how-spring-mvc-framework-works-web-flow.html#ixzz5l2849iU3
2)https://crunchify.com/simplest-spring-mvc-hello-world-example-tutorial-spring-model-view-controller-tips/



