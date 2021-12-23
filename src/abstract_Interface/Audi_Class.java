package abstract_Interface;

public class Audi_Class implements Car_Interface,Vechile_Interface{//multiple inhertince
	

	public void engine()
	{
		System.out.println("Vehcile --engine");
	}
	
	public void start() {
		
		System.out.println("Car--Start");
	}
	
	public void stop()
	
	{
		
		System.out.println("Car--Stop");
	}
	
	public void safety()
	
	{
		
		System.out.println("BMW --safety ");
	}
	
	public static void main(String[] args) {
		
	System.out.println("*******************Calling own methods and inherited methods******************");
		// TODO Auto-generated method stub
Audi_Class a1 = new Audi_Class();
a1.start();
a1.stop();//super or parent method call
a1.safety();//own method call
a1.engine();//super super method call

System.out.println("******************DYNAMIC POLYMORPHISM SUPER SUPER INTERFACE*********************");


            Vechile_Interface v1    = new Audi_Class();
            
            v1.engine();
           // v1.start(); //cant access as it is child interface method for vehicle

System.out.println("****************DYNAAMIC POLYMORPHISM SUPER /PARENT INTERFACE************************");  


Car_Interface c1    = new Audi_Class();

c1.engine();
c1.start();
c1.stop();
//c1.safety();//cant use child class method
            
            
	}

}
