package Inheritance_Program;

public class Imp_Hera {

	public static void main(String[] args) {
		Hera_Sub1 a = new Hera_Sub1();
		a.m1();
		a.m2();
		a.s1();

		System.out.println("...........................");
		Hera_Sub2 c = new Hera_Sub2();
		c.m1();
		c.m2();
		c.s2();
		System.out.println("...........................");

		Hera_Sub3 b = new Hera_Sub3();
		b.m1();
		b.m2();
		b.s3();


	}

}
