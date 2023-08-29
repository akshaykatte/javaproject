package LogicalProgram;

public class DublicateEle {

	public static void main(String[] args) {
		
		
		String str[]= {"java","python","sql","ruby",/*"java"*/"net"/*,"sql"*/};
		
		int count=0;
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
				if(str[i]==str[j])
				
			{
				count++;
				
			}
		}
		
	//	System.out.println(count);
		
		if(count==2)
			System.out.println("dublicate value are exist");
		else
			System.out.println("here not dublicate value are availabe");
		
		
	
	}

}
