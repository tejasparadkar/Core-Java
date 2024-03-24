package Collections;

import java.util.ArrayList;
import java.util.ListIterator;


public class Collection10 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		
		a.add(10);
		a.add(15.5);
		a.add(null);
		a.add('c');
		a.add("Sheela");
		a.add(10);
		a.add(15.5);
		a.add(false);
		a.add(null);
		a.add("Sheela");
		System.out.println("List: "+a);
		System.out.println("****Iterator****");
		ListIterator i = a.listIterator(a.size());
		
		System.out.println("**** Only Backward ****");
		while(i.hasPrevious())
		{
			System.out.println(i.previous());
		}

	}

}
