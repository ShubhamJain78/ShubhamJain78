package interface_multiple_inheritence;

public class HSBCbank implements USbank, Brazilbank// implements keyword is used for inherting from interface to class
{
//US bank method (we need to declare all interface methods otherwise error will come	

	// system.out.println("USbank method");
	public void transfermoney() {
		System.out.println("HSBC(US) -- transfermoney");
	}

	public void addmoney()

	{
		System.out.println("HSBC(US) -- addmoney");
	}

	public void withdrawlmoney() {
		System.out.println("HSBC(US)--withdrawlmoney");
	}

	// Brazil bank method

	public void carloan()

	{
		System.out.println("HSBC(brazil) -- carloan");
	}

	public void homeloan() {
		System.out.println("HSBC(brazil)--homeloan");
	}

//own method 

	public void safety()

	{
		System.out.println("HSBC(own) --Safety");
	}

//h1.addmoney();  object creation and calling should be under main method always

	public static void main(String[] args) {

		HSBCbank h1 = new HSBCbank();
		// polymorphism --one name many form.

		// Static polymorphism
//USBank & Brazilbank mthos are over ridden (same method both in us and brazil interface and own class) -- static polymorphism

		// USbank methods call

		System.out.println("--------------STATIC POLYMORPHISM & MULTIPLE INHERITENENCE ----------");
		h1.addmoney();
		h1.transfermoney();
		h1.withdrawlmoney();

		// Brazilbank methods call
		h1.carloan();
		h1.homeloan();

		// own method

		h1.safety();

		System.out.println("h1.addmoney");

		System.out.println(min_bal);

		// Dynamic polymorphism

		// Child class object can be refered by parent refernce var
		System.out.println("----------------------DYNAMIC POLYMORPHISM-------------------------------");

		System.out.println("USbank(parent interface) access child class common methods");
		USbank b = new HSBCbank();

//USbank -- Parent interface 
		// b -- parent refernce
		// new HSBCbank -- Child class object

		b.addmoney();
		b.transfermoney();
		b.withdrawlmoney();
		// b.safety();--cant access because this method can only be used by child class
		// only overridden methods can be called by parent interface
		// b.carloan();--cant access
		System.out.println("brazil bank access child class common methods");

		Brazilbank B = new HSBCbank();
		B.carloan();
		B.homeloan();

		System.out.println("---------");

//Brazilbank c = new USbank(); -- cannot convert or access us bank to brazil bank 

	}

	{

	}

}
