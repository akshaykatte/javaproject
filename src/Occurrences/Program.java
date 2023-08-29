package Occurrences;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		String str1 = "automation is very good consept in testing feild";
		String str = str1.replace(" ", "");
		char ch []=str.toCharArray();
		int count = 0 ;

		HashMap<Character, Integer> map = new HashMap<>();

		for(int i=0;i<ch.length;i++)
		{

			count = 0;
			for(int j=0;j<ch.length;j++)
				if(ch[i]==ch[j])
				{
					count++;
				}
			map.put(ch[i], count);
		}

		//System.out.println(map);

		Set a = map.entrySet();

		Iterator x = a.iterator();

		while(x.hasNext())
		{
			System.out.print(x.next()+"  ");
		}



	}

}
