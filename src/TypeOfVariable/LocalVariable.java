package TypeOfVariable;

public class LocalVariable {
	// a veriable which is declare inside the method that called local variable 
	// scope of the local verible are within the method
	 int a=45;// this is globle varible which is declare inside the class but out side the method
	public  void m1() {
		
		int a=10;//this is local variable
		System.out.println(a);
		
		//System.out.println(this.a);

	}
	

	
	

	public static void main(String[] args) {
		LocalVariable b = new LocalVariable();
		
		b.m1();
		

	}

}
