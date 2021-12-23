package constructorconcepts;

public class CarFramework {
	
	String name;
	int price ;
	String Model;
	
	public CarFramework(String name, int price, String Model)

	{
		
		this .name= name;
		this.price= price;
		this.Model = Model;
		

	}
	
	
	

	public static void main(String[] args) {
		CarFramework obj1 = new  CarFramework("BMW",50,"360d");
		CarFramework obj2 = new  CarFramework("Audi",40,"A8");
		CarFramework obj3 = new  CarFramework("Honda",10,"city");
		
		System.out.println(obj1.name +" "+ obj1.price +" "+ obj1.Model);
		System.out.println(obj2.name +" "+ obj2.price +" "+ obj2.Model);
		System.out.println(obj3.name +" "+ obj3.price +" "+ obj3.Model);
		
	}

}
