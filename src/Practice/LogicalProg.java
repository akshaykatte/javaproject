package Practice;

public class LogicalProg {

	public static void main(String[] args) {
		// swapping two number
		
//		int a=78 , b=96 ;
//		System.out.println("Original "+"A="+a +" and " + "B="+b);
//		int temp =a;
//		 a=b;
//		 b=temp;
//			System.out.println("After Swapping "+"A="+a +" and" + " B="+b);

		// sorting three number
		
		
		int a=45 , b= 23 ,c=35;
		
		
		if(a>b)
		{
			int temp =a ;
			a=b;
			b=temp;
			
			System.out.println(a +" "+b+" " + c);
		}
		
		
		if (b>c)
		{
			int temp = b;
			b=c;
			c=temp;
			System.out.println(a +" "+b+" " + c);

		}
		
		
		if(a>b)
		{
			int temp =a ;
			a=b;
			b=temp;
			
			System.out.println(a +" "+b+" " + c);
		}
		
	
	}

}
