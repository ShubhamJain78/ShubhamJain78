package exceptionhandling;

public class Exception_handling {
	
	
	//Object(Super super class)---> Throwable(super class)-->1.Error (Child class)
	 //                                                   -->2.Exception(child class)

	public static void main(String[] args) {
		int i =  9;
		
		try
		{
		//throw new Exception("Shubham Exception");
		int k = i/0; //exception in try 
		}
		
		catch(Exception e)
		
		{
		
		e.printStackTrace();
		}

		System.out.println("/by zero ");
	}

}
