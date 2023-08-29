package StringProg;

import java.util.Arrays;

public class AnagramProg {
	
	public static void anagram(String str , String str1 ){
		
		if(str.length()==str1.length())
		{
			String x =str.toLowerCase();
			String y = str1.toLowerCase();
			char a[]=x.toCharArray();
			char b[]=y.toCharArray();
			
			Arrays.sort(a);
			Arrays.sort(b);
			
			boolean result = Arrays.equals(a, b);
			if(result)
			{
				System.out.println("given program is anagram");
			}
			else
			{
				System.out.println("if string size is equal but character not same given program is not anagram");
				
			}
		
		}
		else
		{
			System.out.println("if string size not equal then  given program is not anagram");
		}
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		anagram("RahCe", "care");
		
		
		
//            String a = "race";
//            String b = "care";
//            if(a.length()==b.length())
//            {
//            
//            char c[]=a.toCharArray();
//            char d[]=b.toCharArray();
//
//          Arrays.sort(c);
//          Arrays.sort(d);
//          
//          boolean result = Arrays.equals(c, d);
//          
//          if (result)
//          {
//        	  System.out.println(a +" "+b +" are anagram String");
//          }
//          else
//          {
//        	  System.out.println(a +" "+b +" are not anagram String");
//
//          }
//       
//            }
//            else
//            {
//          	  System.out.println(a +" "+b +" are not anagram String");
//            }
//		

	}

}
