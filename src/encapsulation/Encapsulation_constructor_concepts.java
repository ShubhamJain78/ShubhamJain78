package encapsulation;

public class Encapsulation_constructor_concepts {
	
	//constructor concepts 
	int waist = 12;
	static int shoesize = 14;
	
	
	public Encapsulation_constructor_concepts(int weight,double height) { //constructor declare 
		
		System.out.println("weight"+ weight);
		System.out.println("height"+ " " +height);
		//this.waist= waist;
		
		
		
		System.out.println("2 parameter constructor");
	}
	
	
	//encapsulation concepts
	//declare private variables 
	//select and right click on source 
	//select getter and setter 
	//and now you can access getter and setter throuh set name and get method
	
	private int i =10;
	/**
	 * @return the i
	 */
	public int getI() {
		return i;
	}


	/**
	 * @param i the i to set
	 */
	public void setI(int i) {
		this.i = i;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the ssn
	 */
	public int getSsn() {
		return ssn;
	}


	/**
	 * @param ssn the ssn to set
	 */
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}


	private String name;
	private int ssn;
	
	

	public static void main(String[] args) {
		Encapsulation_constructor_concepts obj= new Encapsulation_constructor_concepts (70,5.9); //constructor calling and object create
		
	System.out.println("waist = "+obj.waist); //non static we have to call with the help of obj ref 
	System.out.println("shoe szie = "+shoesize); //directly call as varaible is static 
	
			System.out.println();
		
		obj.setName("ram"); //in encapsulation we need to first set name 
		System.out.println(obj.getName()); //then in 2nd step we can get the name
		

		System.out.println(obj.getI()); //i is defined so direct get 
		
		obj.setSsn(9090); //set ssn 
		System.out.println(obj.getSsn()); //get ssn 
		
	}

}
