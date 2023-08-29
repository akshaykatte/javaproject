package CollectionProg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector ;
public class CollectionProg {

	public static void main(String[] args) {

// arraylist-->Insertion	order	preserved
		
		
		ArrayList a = new ArrayList();
		
		
//		a.add("abc");
//		a.add(45.23);
//		a.add(458);
//		a.add('A');
//		a.add(null);
//		a.add("hi");
//		a.add(0);
//		a.add(null);
//		System.out.println(a);
//		
//		a.add(4, "Automation");
//		a.addAll(5, a);
//		System.out.println(a);
//		
//		
//		a.remove(1);
//		
//		System.out.println(a);
//		
//		a.set(1, "Harry potter");
//		
//		System.out.println(a);
//		
//		Collections.sort(a);
//		System.out.println(a);
		
		a.add(45);
		a.add(58);
		a.add(89);
		a.add(59);
		a.add(5);
		a.add(11);
		a.add(23);
		
		System.out.println("By random order "+a);
		 Collections.sort(a);
		 System.out.println("By sorting order "+a);
	}

}
