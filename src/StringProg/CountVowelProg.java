package StringProg;

import java.util.Arrays;

public class CountVowelProg {
	
	// count total number of vowel in string
	
/*	static void vowel(String a)
	{
		int count=0;
		String str = a.toLowerCase();
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			
			if(ch =='a'|| ch=='e'
				||	ch == 'i' || ch=='o'
					|| ch == 'u')
				
				count++;
		
		}
			
		System.out.println("Total Numbers of vowel in string are " + count);
		
	}*/
	
	// anagram program 
	
	// reverse string 
	
	static void m1(){
	String str = "selenium is a best testing tool";
	String rev = " ";
	
	String arr[]=str.split(" ");
	String str1[]=new String[6];
	
	for(int i=0;i<arr.length;i++)
		
	{
		rev = " ";
		for(int j=0;j<arr[i].length();j++)
			
		{
			char ch = arr[i].charAt(j);
			System.out.print(ch+"   ");
			rev = ch+ rev;		
		}
		
		str1[i]=rev;
	}
	System.out.println("\n.........");
	for(String val:str1)
		System.out.print(val);
	
	}
	
	
	
	public static void main(String[] args) {

    
	//	vowel("maharsashtra");
		
		//angramPro("Race", "Care");
		
		
	//	m1();
		
		// find the dublicate character of string

		String str = "automation";
		
		char ch[] =str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
		for(int j=i+1;j<str.length();j++)
		    if(ch[i]==ch[j])
			{
			System.out.println("dublicate char are = "+ch[j]);
			}
			}
		

	}

}
