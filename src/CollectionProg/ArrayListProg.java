package CollectionProg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ArrayListProg {

	public static void main(String[] args) {
		
		/*ArrayList arr = new ArrayList();
		arr.add("akshay");
		arr.add("katte");
		arr.add("satara");
		arr.add("maharashtra");
		arr.add("india");
		arr.add('A');
		
	//	System.out.println(arr);
		
		Iterator a =arr.iterator();
		
         while(a.hasNext())
         {
        	 Object val =  a.next();
        	 System.out.println(val);
		
         }*/
		
		
		int arr[]= {45,446,89,55,85,25};
		int ar[]= {1,80,86,87,88};
		
		
		TreeSet a = new TreeSet();
	//	LinkedHashSet a = new LinkedHashSet();
	//	HashSet a = new HashSet();
		
		
//		for(int i=0;i<arr.length;i++)
//		{
//			a.add(arr[i]);
//		}
		
		for(int val:arr)
		{
			a.add(val);
		}
		
		for(int value:ar)
		{
			a.add(value);
		}
		System.out.println(a);
	
		Iterator z = a.iterator();
		
		while(z.hasNext())
		{
			Object y = z.next();
			System.out.print(y+" ");
		}
		System.out.println("\n....................");
		//System.out.println(a.size());
		
		
	}

}
