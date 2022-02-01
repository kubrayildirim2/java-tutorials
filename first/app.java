package opdracht;

import java.util.Scanner;


public class app {
	
	public static void main(String[] args ) {
		
		
		Scanner scanner1= new Scanner(System.in);
		
		double totalhours=0; 
		int totalhours1=0;
		int totalhours2=0;
		double salary=0;
		int totalStop=0;
		int totalStart=0;
		
		System.out.println("Please fill in the hour you started working");
		int hourStart = scanner1.nextInt();
		
		
		System.out.println("Please fill in the minutes you started working");
		int minutesStart = scanner1.nextInt();
		
		
		System.out.println("Please fill in the hour you stopped working");
		int hourStop = scanner1.nextInt();
		
        System.out.println("Please fill in the minutes you stopped working");
		int minutesStop = scanner1.nextInt();
		
		 int hourStart2=hourStart*60; //I set everything in minutes but named hourStart and hourStop
		 int hourStop2=hourStop*60;
		 
		 totalStart= minutesStart + hourStart2; // Total start in minutes
		 totalStop= minutesStop + hourStop2;    // Total stop in minutes
		 
		 
	    if (totalStop>totalStart) {    //if they worked during the day
	    	
	   
		 totalhours= (Math.subtractExact(totalStop, totalStart)/60);
		
		
	
		System.out.println("you have worked "+ totalhours +" hours and " + Math.subtractExact(totalStop, totalStart)%60 + " minutes" );
		
	    
	    } else {  //if they worked over midnight
			
		 totalhours=((totalStop+ (1440-totalStart))/60);
		
			System.out.println("You have worked "+ totalhours + " hours and " + (totalStop+ (1440-totalStart))%60 + " minutes");}
		 
		 
		 System.out.println("");
		 // I want to put a space line here
			
		 
		System.out.println("Please fill in the numbers you have started working \nMonday [1] \nTuesday [2] \nWednesday [3]"
				+ "\nThursday [4] \nFriday [5] \nSaturday [6] \nSunday [7] ");
	        int startdays = scanner1.nextInt();
		
		
		    
	    
	    if (startdays==1||startdays==2||startdays==3||startdays==4) {
	    	
	    	
	        salary = totalhours*11.5;
	    	
	        System.out.println("You have earned "+salary +"Euro");
	    
	    } else if(startdays==5&&totalStop>totalStart)  {
	    	
	    	System.out.println("You have earned "+salary +"Euro");
	    } else if(startdays==5&&totalStop<totalStart)	{
	    	
	    	totalhours1=totalStop;
	    	totalhours2=((24*60)-totalStart);
	    	
	    	double salary2=(totalhours1*11.5/60*1.25)+(totalhours2*11.5/60);
	    	//11.5/60 is the salary per minute
			System.out.println("You have earned "+salary2 +"Euro");
	    } else if(startdays==6&&totalStop>totalStart)   {
	    	
	    	double salary3=((totalStop-totalStart)*11.5/60*1.25);
	    	
			System.out.println("You have earned "+salary3 +"Euro");
	    } else if(startdays==6&&totalStop<totalStart)  {
	    	
	    	totalhours1=totalStop;
	    	totalhours2=((24*60)-totalStart);
	    	
	    	double salary4=(totalhours1*11.5/60*1.5)+(totalhours2*11.5/60*1.25);
	    	
			System.out.println("You have earned "+salary4 +"Euro");
			
	    } else if(startdays==7&&totalStop>totalStart) {
	    	
	    	double salary5=((totalStop-totalStart)*11.5/60*1.5);
	    	
	    	System.out.println("You have earned "+salary5 +"Euro");
	    } else if(startdays==7&&totalStop<totalStart) {
	    	
	    	totalhours1=totalStop;
	    	totalhours2=((24*60)-totalStart);
	    	
	    	double salary6=(totalhours1*11.5/60)+(totalhours2*11.5/60*1.5);
	    	
			System.out.println("You have earned "+salary6 +"Euro");
	    	
	    	} 
	    
	    }}
