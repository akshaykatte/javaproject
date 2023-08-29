package ExceptProg;

public class Prog {

	public static void main(String[] args) {
		
		
		
      // 	int a = 10 , b=0 ,c=0;
//		try 
//		{
//		c=a/b;
//		System.out.println(c);
//		
//		}
//		catch(StringIndexOutOfBoundsException x)
//		{
//			System.out.println("exception is "+x);
//			System.out.println(c);
//		}
//		System.out.println("hi java");
		
		String str = null;
		
		
		try
		{
			System.out.println("statement 1");
			
			System.out.println(str.toLowerCase());
			System.out.println("statement 3");
		}
		catch (ArithmeticException v)
		{
			System.out.println("statement 4"+(10/0));
		}
		finally
		{
			System.out.println("finally will excute 5"+(10/0));
		}
		System.out.println("hi this is java program 6");
		
		
		

	}

}
