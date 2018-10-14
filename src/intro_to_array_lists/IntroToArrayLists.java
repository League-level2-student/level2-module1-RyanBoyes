package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	
	
	
	
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> AL1 = new ArrayList<String>();
		//2. Add five Strings to your list
		AL1.add("1");
		AL1.add("2");
		AL1.add("3");
		AL1.add("4");
		AL1.add("5");
		//3. Print all the Strings using a standard for-loop
		for(int i=0;i<AL1.size();i++) {
			String print = AL1.get(i);
			if(i%2==0) {
			System.out.println(print);
			}
			}
		//4. Print all the Strings using a for-each loop
		for(String j : AL1) {
			System.out.println(j);
		}
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the Strings in reverse order.
		for(int a = 5; a>0; a--) {
			
			System.out.println(a);
		}
		//7. Print only the Strings that have the letter 'e' in them.
		if(AL1.contains("e")){
			System.out.println(AL1);
		}
	}
}
