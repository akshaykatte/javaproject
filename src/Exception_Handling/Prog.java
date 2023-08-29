package Exception_Handling;

public class Prog {

	public static void main(String[] args) {
		// Abnormal situation occur at the run time 
		
		// null pointer exception
		
		
		
		
//		String str = null;
//		try
//		{
//		System.out.println(str.toUpperCase());
//		}
//		catch(NullPointerException e)
//		{
//			System.out.println("exception Handled "+e);
//		}
//		System.out.println("Automation");
//		
		
		
		
		
		// Arithmetic exception 
		
		
		
//		int a=10 , b =0 ;
//		int c =0;
//		try
//		{
//			 c = a/b ;
//		}
//		catch(ArithmeticException e)
//		{
//			e.printStackTrace(); // it will throw the exception
//			System.out.println("exception handled ");
//		}
//		

		 //StringIndexOutofBoundException
		
		String str ="Automaton";
		
		try
		{
		System.out.println(str.substring(1 , 10));
		}
		catch(StringIndexOutOfBoundsException a)
		{
			
			System.out.println("Hnadled");
		}
		
		
		System.out.println("this exception handled via stringindexoutofbondexception");
		
		
		
	}

}
