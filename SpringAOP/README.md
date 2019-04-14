CustomerService-- Bean class
Customer.xml -- A bean configuration file

In Spring AOP, 4 type of advices are supported :

1. Before advice – Run before the method execution

HijackBeforeMethod class implements Spring's MethodBeforeAdvice Interface
It will run HijackBeforeMethod’s before() method, before every customerService’s methods are executed.

2. After returning advice – Run after the method returns a result
HijackAfterMethod class implements AfterReturningAdvice interface.
It will run the HijackAfterMethod’s afterReturning() method, after every customerService’s methods that are returned result.

3. After throwing advice – Run after the method throws an exception
HijackThrowExpection class implements ThrowsAdvice interface 
afterThrowing method is for hijacking the IllegalArgumentException exception.

It will run the HijackThrowException’s afterThrowing() method, if customerService’s methods throw an exception.

4. Around advice – Run around the method execution, combine all three advices above.
HijackAroundMethod class implements MethodInterceptor interface. 
“methodInvocation.proceed()" should be called to proceed on the original method execution,
else the original method will not execute.

It will run the HijackAroundMethod’s invoke()method, after every customerService’s method execution.
