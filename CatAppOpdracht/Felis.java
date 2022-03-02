package be.intecbrussel;

public class Felis extends Animal{
	
	private static int vaccinationCount;
	private String name;
	private int age;
	private int badgeNo;
	private int shelterNo;
	
	
	
	public Felis() {
		    this(0,null,0,0, 0);
		    }
	public Felis(int vaccinationCount,String name, int age,int badgeNo, int shelterNo) {
	    	
	    	this.setVaccinationCount(vaccinationCount);
	    	this.setName(name);
	    	this.setAge(age);
	    	this.setShelterNo(shelterNo);
	    	this.setShelterNo(shelterNo);
	    }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getBadgeNo() {
		return badgeNo;
	}
	public void setBadgeNo(int badgeNo) {
		
		// badgeNo=Math.abs(badgeNo); 
		   
		  if (badgeNo<0 || badgeNo>999) {
			  
			  System.out.println("Badge number must be between 0 and 1000!");
		  }
		     this.badgeNo = badgeNo;
		
	}
	public int getShelterNo() {
		return shelterNo;
	}
	public void setShelterNo(int shelterNo) {
		this.shelterNo = shelterNo;
	}
	
	public void miauw() {
		System.out.println("miauwww");
	}	
    public int miauw(int times) {
		return 2*times;	
    }	
	
   
    public int getNoOfVaccinatedCats() {
		
		vaccinationCount++;
		
		return vaccinationCount;
	}

	public static int getVaccinationCount() {
		return vaccinationCount;
	}
	public static void setVaccinationCount(int vaccinationCount) {
		
		if (isAlive()==true) {
		
			vaccinationCount++;
		}else {
				
		     vaccinationCount=0;
		     
		}
	}
	public boolean equals(Object o) {
		
		if (( o !=null) &&
		
		(getClass()==o.getClass()) &&
		((Felis)o).getBadgeNo()==getBadgeNo() &&
	    ((Felis)o).getShelterNo()==getShelterNo())
	    
	    return true;
		
		else return false;	
				
		}
    public int hashCode() {
    	return badgeNo+shelterNo;
    }
}
