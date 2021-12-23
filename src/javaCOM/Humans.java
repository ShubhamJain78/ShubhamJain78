package javaCOM;

//Class (Humans) --> Objects (boy) -->methods(run,swim)

//static variable and methods can be access directly by calling name or classname.method name 

//Non static variable and methods access >> we need to create object >> and then call object >> by obj ref.method name 

public class Humans {
	
	String name = "Tom";  //global variable or class variable 
	int age  =36;
	

	public static void main(String[] args) {
		 
		int s= 30; //local variable for main method 
		
		
		Humans boy = new Humans(); //object -- new Humans
		                           //object reference-- boy
		
	System.out.println(boy.name);
	System.out.println(boy.age);
	
	System.out.println(s); //direct call for static variable
		run(); //static method direct call 
		boy.swim(); //nonstatic method call (obj ref.method name)
	}

	
	public static void run()   //static method
	{
	System.out.println("boy run");
	
	int x= 10;
	int y= x+10;
	
	System.out.println(y);
	
	}
	
	public int swim() { //return type c is int so int is declare before swim
		
		int a= 10; //local variable for swim method 
		int b= 20;
		int c = a*b;
		System.out.println(c);
		
		return c ;
		
		
	}
	
	
}
