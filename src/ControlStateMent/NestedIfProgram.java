package ControlStateMent;

public class NestedIfProgram {

	public static void main(String[] args) {
		// nested if means if statement inside if statement 
		
      
		  
		int mark = 45 ;
		int main = 145 ;
		if(mark > 80)
		{
			System.out.println("eligible for main");
			
			if (main > 150)
			{
				System.out.println("got selected");
			}
			else
			{
				System.out.println("fail");
			}
		}
		
		else
		{
			System.out.println("not eligible for test ");
		}
		
		
		
		
		
		

	}

}
