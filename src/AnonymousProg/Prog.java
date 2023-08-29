package AnonymousProg;

public class Prog {
	
//	int a;
//	int b ;
//	
//	void Prog(int q ,int p)
//	{
//		a=q;
//		b=p;
//		int c=a+b;
//		System.out.println("addition is "+c);
//	}
	
	void call(String a)
	{
		System.out.println(a);
	}
	
	
	
	

	public static void main(String[] args) {
		   new Prog().call("Abc");

	}

}
