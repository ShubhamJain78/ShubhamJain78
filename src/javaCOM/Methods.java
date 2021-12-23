package javaCOM;

public class Methods {
	
	
	 public int sum()
			
	{
		System.out.println("sum method");
		int a= 10;
		int b= 20;
		int c= a+b;
		
		return c;
		
		
	}

	public static void main(String[] args) {
		
Methods M1= new Methods();
 M1.sum();
int d= M1.sum();  //return type value print we use this concept 
System.out.println(d);//without it it will only print sum method



	}

}
