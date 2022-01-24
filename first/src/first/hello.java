package first;

import java.util.Scanner;

public class hello {

		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter your name: ");
			String name = scanner.nextLine();
			
			System.out.println("Enter your city: ");
			String city = scanner.nextLine();
			
			System.out.println("Enter your age: ");
			int age = scanner.nextInt();
			
			System.out.printf("My name is %s I live in %s. I am %d%n years old.", name,city, age);
			
			
			scanner.close();
			
			}
		
		}

         





