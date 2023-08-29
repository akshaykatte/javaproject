package OppsCon;

public class PolymorProg1 extends PolymorProg {

	public void m2()
	{
		System.out.println("overriding method");
	}
	
	
	public static void main(String[] args) {
		
		PolymorProg a = new PolymorProg1();
		a.m2();
		a.m1();
		
				
		
		
		

	}

}
