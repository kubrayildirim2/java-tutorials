package arraysOpdracht;

import java.util.Arrays;

public class CharArrayTools {

public static void sortLine(String[]Chars) {
		
		Arrays.sort(Chars);
	     
		 return;
}

public static void filterAlphabet(String[]Chars) {
	
	Arrays.sort(Chars);
	
	String Alphabet[]= {"a","b","c","d","e",
			"f","g","h","i","j","k","l",
			"m","n","o","p","q","r","s","t",
			"u","v","w","x","y","z"};
	String s1=null;
	Arrays.binarySearch( Alphabet, s1);
	return;
	
	
	}
	
}	
	
	
	

