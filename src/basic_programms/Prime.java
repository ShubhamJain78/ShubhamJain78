package basic_programms;

public class Prime {
	
	public static boolean Prime (int i)
	
	
	{
		System.out.print(i + " is prime :");
		if (i<2) {
		return false;
		}
		
		
		for (int j=2;j<i;j++)
		{
			if (i%j==0)  // 5 div by 2 and remainder should be zero then it will go inside
				
				
			{
				return false;
				
			}
			
		}
			
	return true;
	
		
	}


	public static void main(String[] args) {
		System.out.println(Prime(5));

	}

}
