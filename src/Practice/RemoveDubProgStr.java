package Practice;

import java.util.HashSet;

public class RemoveDubProgStr {

	public static void main(String[] args) {
// Remove dublicate String
//		String str = "akshay";
//		   char X[] = str.toCharArray();
//	
//		HashSet h =new HashSet();
//		
//		
//		   for(int i=0;i<X.length;i++)
//		   {
//			   h.add(X[i]);
//		   }
//		   
//	System.out.println(h);
	
	// find dublicate character
	
	
	String str = "HiAutomationIsAGoodTestingTool";
	
	char ch[]=str.toCharArray();// it separate the each character
  for(int i=0;i<ch.length;i++)
  {
	  for(int j=i+1;j<ch.length;j++)
		  if(ch[i]==ch[j])
	  {
		  System.out.println("in this string dublicate character are = "+ch[i]);
	  }
  }
	
		
	
		
		
		
	}

}
