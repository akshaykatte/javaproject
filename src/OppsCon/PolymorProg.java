package OppsCon;

public class PolymorProg {
	
	// complile time polymorphism --> a method which get binded at the time of complitime
	// method overloading has a exmple of complile time polymorphism
	//Method overLoading--> having a more than one method with same name in class with different argument
	
	
	void m1()
	{
		int a=45;
		System.out.println(a);
	}
	 void m1(int b)
	 {
		
		 System.out.println(b);
	 }
       void m1(int a,int b)
{
	int c=0;
	c=a+b;
	System.out.println(c);
	
}
    public void m2()
    {
    	System.out.println("this is method of run time polymorphism");
    }
       
	public static void main(String[] args) {
		PolymorProg x = new PolymorProg();
		x.m1();
		x.m1(45);
		x.m1(89, 65);

	}

}
