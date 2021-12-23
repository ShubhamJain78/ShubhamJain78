package constructorconcepts;



public class B extends A { // constructor inheritence --> we can inherit only multiple interfaces not
							// classes
	
	//class variables :instance vars global variables
	String name;
	int  age;

	

	public B(int a) // child class constructor

	{
		super("ram", 30); // super keyword is used to call parent class constructor without creating
							// parent class object
		System.out.println("child class constructor value" + a);

	}

	public B(String name,int age) //constructor for class or global variable 
	{
		System.out.println(name);//if this keyword is not used we cant call local variable outside constructor
		
		this.name = name;  //this.class or global variable=local variable,  use to call local variable outside constructor 
		this.age = age;
	}
	
	public static void main(String[] args) {

		B obj = new B(10); // object of child class constructor

		A obj1 = new A(20); // object of parent class constructor

		// A obj2 = new A("ram",30); //commenting out so that  we can use use super keyword 

		A obj3 = new A(99, 99);
		
		
		B obj4 = new B("tom", 25);//object for class variable
		
		//if you want to call outside constructor then we have to use this method under class variable object
		System.out.println(obj4.name);
		System.out.println(obj4.age);
		
	}

}


//****************NOTES**********************************************

/*

1.Always create object and call object under main method

2.method cannot be called under other method

3.create method before main method

4.create object of other method in main method

5. super keyword is  used to call parent class constructor 





*/

