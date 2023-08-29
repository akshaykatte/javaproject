package Practice;

import java.util.Scanner;



public class AmstrongProg {

	public static void main(String[] args) {
	
		int num = 0 ;
		
	System.out.println("please enter number");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
	int result = num ;
		int rem = 0 ;
		int sum = 0 ;
		while(num>0)
		{
			rem = num % 10 ;
			sum = sum + rem*rem*rem ;
			num = num /10;
	
		}
		System.out.println(sum);
		
		if (result == sum)
		System.out.println("given number is amstron");
		else
			System.out.println("given number is not amstron");
	
		
		
		
		

	}

}
