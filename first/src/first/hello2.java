package first;

import java.util.Scanner;
import java.util.*;



public class hello2 {

		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
            System.out.println("What is the name of the mom?");
            String namemom = scanner.nextLine();
            System.out.println("What is the name of the dad?");
            String namedad = scanner.nextLine();
            System.out.println("Child gender?");
            String gender = scanner.nextLine();
            
            String halfnamemom = getHalfName(namemom);
            String halfnamedad = getHalfName(namedad);
            
            String name = "";
            if(gender.startsWith("m")) { 
            	name = halfnamedad + halfnamemom;
            } else {
            	name = halfnamemom + halfnamedad;
            }
            System.out.println("suggested name: "  + name.toUpperCase());
            
            	
            }

		private static String getHalfName(String name) {
			int halfIndex = name.length()/2;
			String half = name.substring(0, halfIndex);
			return half;
		}
}