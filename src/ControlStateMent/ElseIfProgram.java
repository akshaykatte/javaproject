package ControlStateMent;

public class ElseIfProgram {

	public static void main(String[] args) {
		// when multiple condition is true then associate condition will get execute and othe condition will skip
		// when none of the conditon will not true then else will get executed
		
		
		int mark = 59;
		
		
		// mark = 89  > 80
		if(mark >= 80 )
		{
			System.out.println("distinction");
		}
		
		else if (mark >= 60 & mark < 80)
		{
			System.out.println("Fist class");
		}
		
		else if (mark >=50 & mark < 60) 
		{
			System.out.println("second class");
		}
		else if (mark >=35 & mark < 50)
		{
			System.out.println("pass class");
		}
		else if (mark < 35)
		{
			System.out.println("fail");
		}
		
	}

}
