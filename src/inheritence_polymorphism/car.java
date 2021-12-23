package inheritence_polymorphism;

public class car extends vehicles


{
	
	
	
public void start()
{
System.out.println("car starts");	

}

public void stop()

{
	System.out.println("car stops" );
}

public void engine()
{
	System.out.println("car engine --starts");
}

@Override
public void wheels() {
	System.out.println("car -- 4wheels");
	
}



}
