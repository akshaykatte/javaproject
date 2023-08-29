package StringProg;

public class paliProg {
	// palidrome program using int
	
	
	static void pali(int a)
	{
		int num = a ;
		int rem =0 ;
		int sum =0000 ;
		while(a>0)
		{
			rem = a%10;
			sum = sum + rem ;
			a = a/10 ;
		}
		System.out.println(sum);
	if(num==sum)
		System.out.println("palidrome");
	else
		System.out.println("not palindrome");
		
	}
	
	
	public static void main(String[] args) {
		
		
		pali(1331);
		
	}

}
