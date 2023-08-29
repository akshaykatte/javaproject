package Practice;

import java.util.Arrays;

public class StringProg {

	public static void main(String[] args) {
		// Reverse String 
//		String str = "Automation";
//		String rev = "";
//		
//		for(int i=0;i<str.length();i++)
//		{
//			char ch = str.charAt(i)
//					;
//			rev = ch + rev;
//			
//		}
//		System.out.println(rev);
				
		
		// revese line 
//		
//		String str = "hi am automation engineer";
//		
//		 String[] strr  = str.split(" ");
//		 String rev  = "";
//	
//		String st[] = new String[4];
//		
//		for(int i=0;i<strr.length;i++)
//		{
//			rev =" ";
//			for(int j=0;j<strr[i].length();j++)
//			{
//				char ch = strr[i].charAt(j);
//				rev = ch + rev ;
//				
//			}
//			st[i]=rev;
//			
//			
//		}
//
//		for(String b:st)
//		{
//			System.out.print(b);
//		}
		
		
//		// Split program
//		
//		String str = "16-may-1998";
//		
//		String s[]=str.split("-");
//		
//		for(String a :s)
//			System.out.println(a);
//				
//		System.out.println(str);
//		
		
		// find dublicate character in string
		
		
//		String a="Automation";
//		String str =a.toLowerCase();
//		char ch[]=str.toCharArray();
//		
//		for(int i=0;i<str.length();i++)
//		{
//			for(int j=i+1;j<str.length();j++)
//				if(ch[i]== ch[j])
//				{
//					System.out.println(ch[j]);
//				}
//		}
		
		// find character in line
		
//		String str ="hi am an aumation test engineer and i have four year of experience in automation testing";
//		int count =0;
//		System.out.println(str.length());
//		for(int i=0;i<str.length();i++)
//		
//		{
//			if(str.charAt(i)!=' ')
//			{
//				count++;
//			}
//				
//			
//			
//		}
//		System.out.println(count);
		
		
		
		// Anagram Program
		
		String a = "Race";
		String b ="Care";
		
		if (a.length()== b.length())  // here we check the wether String lenght atr equal or not
		{
			String c = a.toLowerCase();   // here we convert the all letter in lower levl
			String d = b.toLowerCase();
			
			char str[]=c.toCharArray();   // here we separate the each key word
			char str1[]=d.toCharArray();
			
 		     Arrays.sort(str);  // here we arrange in sorting order
			Arrays.sort(str1);
			
			  System.out.println(str);
			  System.out.println(str1);

			boolean Result = Arrays.equals(str, str1);   // here we comapre boelean result if both character are equal or not
			
			
			if (Result) // here we use if condition if result is true
			{
				System.out.println("given strings are anagram program");
			}
			else 
			{
				System.out.println("not anagram");
			}
			
		}
		else
		{
			System.out.println("Given String is not anagram program");
		}
		
		
		
	}

}
