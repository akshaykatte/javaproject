package Polymorphism_Program;

public class Override_Program2 extends  Override_Program1 {
	public void money()
	{
		System.out.println("having five crore ruppes ");
		
	}
	public void land()
	{
		System.out.println("having two acor land");
	}
	
	
	public static void main(String[]args)
	{
		Override_Program1 a = new Override_Program2();
		a.money();
	    a.land();
		
	}

}
