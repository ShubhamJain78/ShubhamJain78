package abstract_Interface;

public class HDFC_Abstract extends Bank_Abstrsct {

	public int money()

	{
		System.out.println("10k Money should be there");
		int m = 10000;
		return m;

	}

	public void safety()

	{

		System.out.println("HDFC --Safety ");
	}

	//public void credit() {
		
	//	System.out.println("Credit -- HDFC");
	//}
	
	public static void main(String[] args) {

		HDFC_Abstract h1 = new HDFC_Abstract();
		// abstract method call
		int m2 = h1.money();
		System.out.println(m2);

		// non abstract method call child class -HDFC
		h1.safety();

		// non abstract method call parent class--Bank
	h1.credit();

		System.out.println("************************************");
		// Dynamic polymorphism
		
		Bank_Abstrsct  m3 = new HDFC_Abstract(); // HDFC_Abstract();
		
		m3.credit(); // parent class method
		m3.money();// overriden methods
		// m3.safety(); cant access child class methods

	}

}
