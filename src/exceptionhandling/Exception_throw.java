package exceptionhandling;

public class Exception_throw {

	public static void main(String[] args) {
		try
		{
		throw new Exception("Shubham Exception"); //intentionally we want to throw some error 
		}
		
		catch(Exception e)
		{
			
			e.printStackTrace();
		}

		
		System.out.println("Life");
	}

}
