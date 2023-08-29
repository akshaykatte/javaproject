package ConstructorProg;

public class UserDefinedConProgram {
	
	// there are two type of userdefined constructor 
	// 1. zero parameter
	// 2 . with parameter
	
	// zero paramete
	static int a , b ;
	UserDefinedConProgram ()
	{
		a= 10;
		b= 12;
		
		System.out.println("this is zero parameter constructor "+(a+b));
		
	}
	

	public static void main(String[] args) {
		
		System.out.println(a);
		System.out.println(b);
		UserDefinedConProgram x = new UserDefinedConProgram();
		
		
		
	}

}
