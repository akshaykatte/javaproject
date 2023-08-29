package LogicalProgram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class AllProgram {

	public static void main(String[] args) {
//		
//		int arr[]= {45,1,23,8,5,9,85,65,856,96};
//		
//		
//		for(int a:arr)
//		{
//			if(a%2==0)
//				System.out.print(a+" ");
//		}
//		
//		System.out.println("\n................");
//		for(int a:arr)
//		{
//			if(a%2==1)
//				System.out.print(a+" ");
//		}
		   // find min and max value 
		
		
		
//		
//		int arr[]= {4,5,69,69,89,51,26,785,22,25};
//		
//		
//		int max = arr[0];
//		int min = arr[0];
//		for(int i=0;i<arr.length;i++)
//		{
//			if(max<arr[i])
//				max=arr[i];
//			
//			
//			if(min>arr[i])
//				min = arr[i];
//		}
//		System.out.println(max);
//		
//		System.out.println(min);
//		
//		
		
		
		// reverse each word of line
		
		
//		String str = "hi an an automation devlper i have ten year of experince in it feild ";
//		
//		String strr []= str.split(" ");
//		String rev ="";
//		String abc[] = new String[14];
//		for(int i =0;i<strr.length;i++)
//		{
//			rev="";
//			
//			for (int j=0;j<strr[i].length();j++)
//			{
//				char ch = strr[i].charAt(j);
//				rev = ch + rev ;
//			}
//		abc[i]=rev;	
//			
//		}
//		for(String hh:abc)
//			System.out.print(hh+" ");
		
		//FActorial Number Program 
		
		
		
	//	factorial mean  5!=1*2*3*4*5 = ?
		
//		int fact = 1;
//		for(int i=1;i<=5;i++)
//		{
//			fact = fact * i ;
//		}
//		
//		System.out.print("factorial of number 5 = "+ fact);
//		
		
		
		// prime number 
		
		
//		int num = 25 ;
//		// here we check the 23 is prime number or not 
//		int count =0 ;
//		
//		if(num>0)
//		{
//			for(int i=2;i<num;i++)
//			{
//				if(num%i==0)
//					
//				{
//					count++;
//					break;
//				}
//			}
//		}
//		if(count==1)
//			System.out.println("not prime");
//		else 
//			System.out.println("prime");
//			
		
		
		
		
		
	
		// find owels 
		
		
//		String str ="automation";
//		int count = 0 ;
//		for(int i=0;i<str.length();i++)
//		{
//			char ch = str.charAt(i);
//			
//			if(ch=='a' || ch=='e' || ch == 'i' || ch == 'o' || ch == 'u')
//			{
//				count++;
//			}
//		}
//		
//		System.out.println(count);

		
		// count string character
		
		
//	String str = "hi am an automation engineer";
//	int count =0;
//	
//	for (int i=0;i<str.length();i++)
//	{
//		char ch = str.charAt(i);
//		
//		
//		if(ch!=' ' )
//		{
//			count++;
//		}
//		
//		
//		
//	}
//		System.out.println(count);
		
		
		
		// palindrone program
		
		
//		String str ="madam";
//		String rev = "";
//		for(int i=0;i<str.length();i++)
//		{
//			char ch = str.charAt(i);
//			rev = ch + rev ; 
//		}
//		
//	//	System.out.println(rev);
//		
//	if(str.equals(rev))	
//		System.out.println("palindrome");
//	else
//		System.out.println("not palindrome");
//		
//		
		
		
		// anagram 
		
		
//		String a ="race";
//		String b ="care";
//		
//		
//		if(a.length()==b.length())
//		{
//			char c[] =a.toCharArray();
//			char d[]=b.toCharArray();
//			
//			Arrays.sort(c);
//			Arrays.sort(d);
//			
//			
//			boolean Result = Arrays.equals(c, d);
//			
//			if(Result)
//			{
//				System.out.println("Anagram");
//			}
//			else
//			{
//				System.out.println("not Anagram");
//			}
//			
//			
//		}
//		else
//		{
//			System.out.println("String length are not equal");
//		}
//		
		
		
		
		// reverse String 
		
		
//		String str = "Automation";
//		  String rev = "";
//		  
//		for(int i=0;i<str.length();i++)
//		{
//			char ch = str.charAt(i);
//			rev = ch + rev ;
//			
//		}
//		System.out.println(rev);
//		
		
//		String str ="Automation";
//		
//		StringBuffer b = new StringBuffer();
//		
//		b.append(str);
//		b.reverse();
//		System.out.println(b);
//		
		
		
		// reverse each character of line 
		
		
		
//		String str ="hi my name is jonh and my profession is automation engineer";
//		
//		String a[]=str.split(" ");
//		 String rev ="";
//		
//		String ab[]=new String[11];
//		for(int i=0;i<a.length;i++)
//		{
//			
//			rev="";
//			
//			for(int j=0;j<a[i].length();j++)
//			{
//				char ch = a[i].charAt(j);
//				rev = ch + rev ;
//			}
//			ab[i]=rev;
//		}
//		
//		for(String xyz :ab)
//			System.out.print(xyz+" ");
		
		
		
		// find dublicate character
		
		
//		String str = "automation";
//		char ch[]=str.toCharArray();
//		
//		for(int i=0;i<str.length();i++)
//		{
//			for(int j=i+1;j<str.length();j++)
//				if(ch[i]==ch[j])
//				{
//					System.out.println(ch[j]);
//				}
//		}
//		
//		
		
		// Array Assendind and dessending order
		
//		int arr[]= {12 ,56 , 81,69,59,60,11,8,69};
//		int temp ;
//		for(int i =0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]>arr[j])
//				{
//				temp = arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//				}
//			}
//		}
//		for(int x : arr)
//			System.out.print(x+" ");
//		
		
	// factor
		
//		int fact = 1;
//		
//		
//		for(int i=1;i<=5;i++)
//		{
//			fact = i * fact ;
//		}
//		System.out.println(fact);
		
		
		
//		// febonacies series
//		
//		int num = 0 ,num1 =1 ;
//	
//		
//		
//		for (int i =0;i<=5;i++)
//		{
//			int sum = num + num1 ;
//			
//			System.out.print(" "+ sum);
//			
//			num = num1;
//			num1 = sum ;
//		}	

		// febonies series
		
		
//		int num = 0 , num1 =1 ;
//		int sum =0 ;
//		for(int i=1;i<=5;i++)
//		{
//			
//			sum = num + num1;
//			System.out.print(" " +sum);
//			
//			num = num1 ;
//			num1=sum ;
//	
//		}
	
		//Factor 
		
//		int fact = 1;
//		
//		for(int i=1;i<=5;i++)
//		{		
//			fact = fact * i ;
//		}
//		
//		System.out.print(fact);
//		
		
		
//		int num[] = {45,85,96,5,25,36,45};
//		int temp ;
//		
//		for(int i=0;i<num.length;i++)
//		{
//			for(int j =i+1;j<num.length;j++)
//				if(num[i]<num[j])
//			{
//				temp = num[i];
//				num[i]=num[j];
//				num[j]=temp;
//			}
//		}
//		
//		for(int a :num)
//			System.out.print(" " +a);
//		
		
		
		
		// find maximum number
		
//		
//		int arr[]= {78,95,63,65,70,770,4780};
//		
//		int max=arr[0];
//	//	System.out.println(max);
//		
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]>max)
//				max=arr[i];
//		}
//		
//		System.out.println(max);
//		
		
		
		
		
		String str = "automation";
		
		char ch[] = str.toCharArray();
		
	//	HashSet H = new HashSet();
		LinkedHashSet H = new LinkedHashSet();
		for(char a : ch)
			H.add(a);
			System.out.print(H);
		System.out.println("\n.........");
		Iterator x =H.iterator();
		
	while(x.hasNext())
	{
		char value = (char) x.next();
		System.out.print(value);
	}
		
		
		
		
		
		
		
		
	}

}
