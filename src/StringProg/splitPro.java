package StringProg;

import java.util.Scanner;

public class splitPro {

	public static void main(String[] args) {
		
	/*String str ="16-05-98";
	
	
	String a[] =str.split("-");
	
for(String val:a)
	System.out.print(val);*/
	System.out.println("please enter number");
	Scanner s = new Scanner(System.in);
	
int	num = s.nextInt();
	
	System.out.println("given number is"+num);
	
	if(num%2==0)
		System.out.println("even number");
	else
		System.out.println("Odd number");
		

	}

}
