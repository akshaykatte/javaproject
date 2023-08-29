package Practice;

public class GetSetProgram {
	private String name ;
	private int rollNum ;
	
	
	GetSetProgram(String name , int rollNum)
	{
		
		this.name = name ;
		this.rollNum= rollNum;
		
	}
	
	
	public String getName()
	{
		return name ;
	}
	
	
	public int setRollNum()
	{
		return rollNum ;
	}
	
	

	public static void main(String[] args) {
		
		GetSetProgram s1 = new GetSetProgram("mathew",26);
		
		System.out.println(s1.getName());
		System.out.println(s1.setRollNum());
		
		
		
		
		
		
	}

}
