package Encapsulation_Program;

public class Program {

	// encapsulation means grouping or wrapping the data member  and method or custructor into single inititty
	private String name;
	private int age ;

	Program(String name , int age)
	{
		this.name= name;
		this.age= age ;
	}

	public String set()
	{
		System.out.println("canditate name is "+name);
		return name ;
	}
	public int get()
	{
		System.out.println("candidate age is "+age);
		return age ;
	}
	public static void main(String[] args) {
		Program n = new Program("Jokey",30);
		n.get();
		n.set();
	

	}

}
