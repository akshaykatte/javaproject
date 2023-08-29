package ConstructorProg;

public class Basic {
	// when we not declare constructor it provide default  constructor
//	static int a ;
//	int b ;
//	public Basic(int a ,int b)
//	{
//		int c;
//		c=a+b;
//		
//		System.out.println("addition of two number is = "+c);
//	}
	  
	// Constructor overloading --> there are multiple constructor in a class with different argument
	// that called Constructor overLoading
	
	public Basic(int a)
	{
	
		System.out.println(a);
	}
	
	public Basic(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println(c);
	}

	public Basic (double a)
	{

		System.out.println(a);
	}
	public static void main(String[] args) {
		
		//Basic b =new Basic(12, 45);
		Basic x = new Basic(45);
		Basic y = new Basic(15, 56);
		Basic z = new Basic(25.23);

		
		

	}

}
