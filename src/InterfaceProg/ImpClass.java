package InterfaceProg;

public class ImpClass implements Prog  {

	public static void main(String[] args) {
		
		ImpClass a = new ImpClass();
		a.m1();
		a.m2();
		
		
	}

	@Override
	public void m1() {
		System.out.println("this is interface ");
		
	}

	@Override
	public void m2() {
		System.out.println("we achive multiple inherritance by using interface");
		
	}

}
