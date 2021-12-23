package inheritence_polymorphism;

public class test extends BMW{

	public static void main(String[] args) {
		
		
		BMW b= new BMW();
		
		//parent class--superclass
		//child class--sub class
		System.out.println("--BMW class-----");
	    b.start(); // start method is common in parent & child class but it will give preference to child class b/c child class has call 
	    //and method is available
	    
	    b.stop(); //Inheritance -- stop method is created by parent class  or super class(car) and child class or sub class (BMW) is using it. 
	    
	    b.safety(); //child class method is used 
	    
	    b.engine();//Inheritance -- from parent ke parent class method (vehicles) used by child class(BMW)
	   b.wheels(); // Inheritance -- from from parent ke parent class method (vehicles) used by child class(BMW)
	    System.out.println("----Car class---");
		
		
		car c = new car();
		c.start(); //start method of car is used 
		
		//c.safety();//we can't used child class(BMW) method in parent class (car)
		
		c.stop();
		c.fuel(); //Inheritance fuel method (vehicles) is used in child class car
		c.engine();
		c.wheels();
		
		System.out.println("----using common methods of child class----");
		
		//child class common method can be access by using new object for car class with new BMW
		
		car c1 = new BMW();
		c1.start(); 
		c1.engine();
		c1.wheels();
		
		BMW b1= new BMW();
		b1.start();
		b1.engine();
		
		//c1.safety();//but we can't use child class methods which are not common 
		
	
		System.out.println("----test class----");
		
        test t= new test(); //declaring object for test class 
        //new test()--object
        //t-- object reference
        t.testdrive(); //using test class method(own method)
        
        t.engine();//Inheritance from super super super class

	
		t.start();

	}
	
	public void testdrive()
	
	
	{
		System.out.println("test--> testdrive");
	}
	public void start()
	{
	System.out.println("BMW---starts");	

	}
	
	

}
