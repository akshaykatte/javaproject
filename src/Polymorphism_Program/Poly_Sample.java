package Polymorphism_Program;

public class Poly_Sample {
	// polymorphism means one object showing different t behavior at different stages

	public void add()
	{
		System.out.println("addition program");
	}
	public void add(int a ,int b)
	{
		int c=0;
		c=a+b;
		System.out.println(c);
	}
	public void add(int a ,int b ,int c)
	{
		int d=a+b+c;
		System.out.println(d);
	}
	public void add(int a )
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		Poly_Sample x = new Poly_Sample();
		x.add();
		x.add(45);
		x.add(63, 96);
		x.add(85, 62, 75);
		
		// this is also example of method overloading
	}

}
