package javaCOM;

public class Static_and_nonstatic_concepets {

	int i = 20; // nonstatic variable-- we cannot call directly we need create object and then
				// call

	static int j = 199; // static variable -- we can call directly as variable is static

	public static void car() {
		System.out.println("static method can be called directly or by class name");

	}

	public void bmw() {

		System.out.println("non static method can be called by object ref .method name ");
	}

	public static void main(String[] args) {

		Static_and_nonstatic_concepets A1 = new Static_and_nonstatic_concepets(); // object of nonstatic variable

		// static method calling
		car(); // direct calling of static method
		Static_and_nonstatic_concepets.car(); // calling static method by classname.method

		// non static method calling
		A1.bmw();

//non static variable calling
		System.out.println("non static variable is called with help of object ref.variable " + A1.i);

		// static variable calling

		System.out.println("static variable can be called directy or by classname.variable ,value of j " + j);
		// TODO Auto-generated method stub

	}

}
