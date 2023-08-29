package OppsCon;

public class EncapsulProgram {
	//Encapsulation --> wrap the data member and corresponding method in a sigle unit
	
	private String Name;
	
	
	public void get(String b)
	{
		Name = b;
	}
	
	public void set()
	{
		System.out.println("Name is "+Name);
	}
	

	public static void main(String[] args) {
		EncapsulProgram a = new EncapsulProgram();
		
		a.get("Rockey");
		a.set();
		
	}

}
