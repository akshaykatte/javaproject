package Practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Prog1 {

	public static void main(String[] args) {
		
	/*	int arr[]= {45,56,89,65,25,26,7};
		int ar[]= {11,13,12,16,14};
		
		
	//	LinkedHashSet	a	=	new	LinkedHashSet();	
		TreeSet a = new TreeSet<>();
		 for(int x:arr)
	    	 a.add(x);
	     for(int y:ar)
	    	 a.add(y);
	     
		
		Iterator z = a.iterator();
		
    // HashSet a = new HashSet();
//     a.add(2);
//     a.add(1);
//     a.add(5);
//     a.add(4);
     
    
	//	System.out.println(a);
		
		System.out.println(z.next());*/
		
		
		
		
		// find dublicate character
		
		
		/*String str ="saturday";
		
		char ch[] = str.toCharArray();
		
		for(int i =0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
				if(ch[i]==ch[j])
			{
				System.out.println("dubalicate char are= "+ch[j]);
			}
		}
		*/
		
		// ovels
		
		/*String str = "automation";
		
		int count = 0;
		for(int i=0;i<str.length();i++)
		{
			
			char ch = str.charAt(i);
			
			if(ch == 'a' || ch == 'i'|| ch == 'o'||ch == 'u' || ch =='e')
			{
				count++;
				
			}
		
			
		}
		System.out.println("numbers of ovel are="+count);*/
		
		
		/*int i =25 ;
		int j =i++;
		
		System.out.println(i+" "+j);*/
		
		
		/*int arr[]= {5,4,6,2,9,3};
		
		int max = arr[0];
		
		
	     for(int i=0;i<arr.length;i++)
	     {
	    	 if(arr[0]<arr[i])
	    	 {
	    		 arr[0]=arr[i];
	    	 }
	    	 
	     }
	   
		   System.out.println(arr[0]);*/
		
		
		// reverse string 
		
		
		/*String str ="Testing";
		char ch ;
		String rev = "";
		   for( int i=0;i<str.length();i++)
		   {
			   ch=str.charAt(i);
			   rev = ch +rev ;
		   }
		System.out.println(rev);*/
		
		
		
//		TreeSet t = new TreeSet();
//		
//		t.add('a');
//		t.add('z');
//		t.add('x');
//		t.add('b');
//		t.add('c');
//		t.add('h');
//		t.add('f');
//		
//		
//		System.out.println(t);

		// remove the dublicate string 
		
		
		String str = "automation";
		
		char ch[]=str.toCharArray();
		
		
		for(Object s:ch)
			System.out.print(s+" ");
		
		System.out.println("\n................");
		//HashSet H = new HashSet();
		//TreeSet H = new TreeSet();
		LinkedHashSet H = new LinkedHashSet();
		for(Object s:ch)
		//System.out.println("Before removing dublicate vale"+s);
		
		
		H.add(s);
		System.out.print(H+" ");

		System.out.println("\n............................");
		Iterator a = H.iterator();
		
		while(a.hasNext())
		{
			System.err.print(a.next()+" ");
		}
		
		
	}

}
