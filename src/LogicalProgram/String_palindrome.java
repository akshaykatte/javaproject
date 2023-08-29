package LogicalProgram;

public class String_palindrome {

	public static void main(String[] args) {


		String str ="madam";
		String rev = "";
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			rev = ch+rev ;

		}
			System.out.println(rev);	

		if(rev.equals(str))
		{
			System.out.println("Given string is palindrome");

		}
		else
		{
			System.out.println("Given String is not palindrome");
		}

	}

}
