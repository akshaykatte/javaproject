package InterfaceProgram;

public class Prog1 implements Interface1 {

	@Override
	public void beforeMethod() {
	System.out.println("It will execute before method");
		
	}

	@Override
	public void duringMethod() {
		System.out.println("It will execute duringMethod");
		
	}

	@Override
	public void afterMethod() {
		System.out.println("It will execute afterMethod");
		
	}
	
	
	
	

}
