package basic_programms;

public  class Static_NO_methodoverriding2 extends Static_NO_methodoverriding1  implements Static_NO_methodoverriding3 {
	
	
	
	public static void car(int a)
	{
		
		System.out.println("child method");
	}
	public  void truck()
	
		
		{
			
			System.out.println("child truck --without static ");
		}
		
	
	
	
	

	public static void main(String[] args) {
		
		Static_NO_methodoverriding2 obj=	new Static_NO_methodoverriding2 ();
		obj.truck();//child class method call 
		
		 Static_NO_methodoverriding1 obj1 =new Static_NO_methodoverriding1 ();
		 obj1.truck(); //parent class method call
		 
		 Static_NO_methodoverriding3 obj2 =new Static_NO_methodoverriding2 ();
		 obj2.truck(); //interface override method call 
		
		
		Static_NO_methodoverriding2.car(3);  //we cant create object in static method so we cant call parent class methods 

		Static_NO_methodoverriding3.jeep(); //interface method call --static 
	
	}
	

}
