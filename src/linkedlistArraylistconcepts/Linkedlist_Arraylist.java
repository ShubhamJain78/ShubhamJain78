package linkedlistArraylistconcepts;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linkedlist_Arraylist {
	
	public static void main(String[] args) {
	
	
	LinkedList ll= new LinkedList();
	LinkedList<String> lll = new LinkedList<String>();	
	
	ll.add("test");
	ll.add(10);
	lll.add("pokemon");
	lll.add("meowth");
	
	ll.add(12.7667);
	
	System.out.println(ll.size()); //size of linked list
	
	System.out.println(ll.get(2));
	
	System.out.println(lll); // print all values of linkedlist lll
	
	for (int n= 0;n<ll.size();n++)
	{
		
		System.out.println(ll.get(n));
		
	}
		
	ArrayList aa= new ArrayList(); //Arraylist class , aa-- object ref ,new ArrayList-- object  
	
	aa.add("digimon");
	aa.add(45);
	
	System.out.println(aa);
	
	System.out.println(aa.get(1));
	
	

	}
}
