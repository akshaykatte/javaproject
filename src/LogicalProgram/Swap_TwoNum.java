package LogicalProgram;

public class Swap_TwoNum {

	public static void main(String[] args) {
		
		// swap two number without using third variable 
		
		int num1=45;
		int num2=56;
		
		
		
		System.out.println("Before swap");
		System.out.println("Number 1 "+num1);
		System.out.println("Number 2 "+num2);
		
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		

		System.out.println("AFter swap");
		System.out.println("Number 1 "+num1);
		System.out.println("Number 2 "+num2);
		
		
	}

}
