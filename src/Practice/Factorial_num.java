package Practice;

public class Factorial_num {

	public static void main(String[] args) 
	{
		fact(10);
	}

	public static int fact(int num)
	{
		int factorial = 1;
		for(int i=1;i<=num;i++)
		{
			factorial = factorial * i;
		}
		System.out.println(factorial);
		return factorial;
	}
	
	
}
