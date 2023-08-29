package StringProg;

public class PalindroneProg {
	
	static void palin(String str)
	{
		String rev ="";
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			rev = ch + rev ;
		}
		
	System.out.println(rev);	
	if(str.equals(rev))
	{
		System.out.println("give string is palindrome");
	}
	else
	{
		System.out.println("given string is not palindrome");
	}
		
	}

	public static void main(String[] args) {
		
		palin("madam");
		
		
		
		
		
		
		

	}

}
