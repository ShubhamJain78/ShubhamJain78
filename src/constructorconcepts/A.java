package constructorconcepts;

public class A {

	public A()

	{
System.out.println("default constructor will be called if no parent class constructor is called ");
	}

	public A(int i) // constructor overloading same constructor name with different parameters or datatype

	{

		System.out.println(" parent class constructor value of i " + i);

	}

	public A(String name, int k)

	{
        System.out.println("parent class constructor"+ name +k);
        
	}

	
	public A (int s,int j )
	
	
	{
	System.out.println("parent class constructor"+ s);
	System.out.println(j);
		
		
	}
	//A A1 = new A(); // no object is created without main method (default constructor object)

}
