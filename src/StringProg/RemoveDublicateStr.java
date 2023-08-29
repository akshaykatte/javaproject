package StringProg;

import java.util.HashSet;
import java.util.Iterator;                              // import java.util.hashse
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class RemoveDublicateStr {                                           // linkedhashset , hashset ,treeset 

	public static void main(String[] args) {
		
		String str ="automation";
		
		 char[] ch = str.toCharArray();
		
		//for(char a : ch)
		
			
       //TreeSet t = new TreeSet();
	//	HashSet h = new HashSet();	
	//	TreeSet  h = new TreeSet();	
			
		LinkedHashSet h = new LinkedHashSet();
		
		for(char a : ch)
		{
			h.add(a);
		}
			
		System.out.println(h);
		
		
		Iterator x = h.iterator();
		
		while(x.hasNext())
		{
			char value = (char) x.next();
			System.out.print(value);
		}
		
		
		
		
		
	}

}
