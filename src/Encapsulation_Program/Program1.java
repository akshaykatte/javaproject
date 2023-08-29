package Encapsulation_Program;

import java.util.Scanner;

public class Program1 {
	private String accHolderName ;
	private int accounrNum ;
	
	
	public void set(String a , int b)
	{
		accHolderName=a;
		accounrNum = b ;
	}
	public void get ()
	{
		System.out.println("Bank Account Holder Name is "+accHolderName);
		System.out.println("Account Number is "+accounrNum);
	}
	
	

	         public static void main(String[] args) {
	        	 Program1 x = new Program1();
	        	
	        	 x.set("amitab bacchan", 45236978);
	        	 x.get();
	        	 
	        
	}

}
