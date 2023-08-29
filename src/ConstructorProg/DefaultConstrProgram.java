package ConstructorProg;

public class DefaultConstrProgram {
	
	int a ;
	public void m1()
	{
		System.out.println("Default Constructor" );
		
	}
	
	DefaultConstrProgram()
	{
		// when ever programer will not provide any value then programmer will provide default constructor
		System.out.println(a);
	}
	
	
	

	public static void main(String[] args) {
		
		DefaultConstrProgram b = new DefaultConstrProgram();
		 // class           Ogject  memeory allocate      constructor
		
		b.m1();
		
		
		
	}

}
