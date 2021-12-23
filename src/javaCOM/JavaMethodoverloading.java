package javaCOM;

public class JavaMethodoverloading {
	
	//MethodOverlaoding
  //Javaclass -- Class
  //obj--object
  //met--method
	public static void main(String[] args) {
		
		
		JavaMethodoverloading obj= new JavaMethodoverloading(); // object 
		{
		obj.met(); // method call

		obj.met(30);
		obj.met(50,10);
		

		}
	}
		
		public void met() {  //method intialize
			
			int i = 10;  //local variable
			System.out.println(i);
			
		}
		
		public void met(int x)
		{
			int a = x+10;
			System.out.println(a);
			
			
		}
		
				
		public int met(int q,int r) // 2 input parameter
		
		
		{
			int b = q/r;
			System.out.println(b);
			return b;
		}
			

}
