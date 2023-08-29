package Array_Prog;

import java.util.ArrayList;
import java.util.LinkedHashSet;

import StringProg.RemoveDublicateStr;

public class Remove_Dublicate_array {
// remove duplicates array and convert into List
	public static void main(String[] args) {
		
		
		
		
		int arr[]= {1,2,2,3,3,3,4,4,4,4,5,5}; 
		
		
		LinkedHashSet<Integer> h = new LinkedHashSet<>();
		
		for (int a:arr)
		{
			h.add(a);
		}
		
		//System.out.println(h);
		
		ArrayList ab = new ArrayList();
		ab.add(h);
		System.out.println(ab);
		
		
		
		
	}

}
