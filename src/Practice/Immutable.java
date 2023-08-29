package Practice;



final class Immutable {

	  // private class members
	 private String name ;
	 private int date ;
	 
	 
	 Immutable( String name , int date)
	 {
		 // class member initialize using constructor 
		this.name = name;
		this.date = date ;
	
	 }
	 // getter method returns the copy of class members
	 public String getName()
	 {
		 return name ;
	 }
	 
	 public int getDate()
	 {
		 return date ;
	 }
	 
	 

	public static void main(String[] args) {
		
		
		Immutable im = new Immutable("harry " , 20);
		
		
		System.out.println("Name = "+ im.getName());
		System.out.println("Date = "+ im.getDate());
		
	
	}

}
