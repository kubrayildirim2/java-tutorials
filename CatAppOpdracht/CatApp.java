package be.intecbrussel;

import java.util.Arrays;


public class CatApp extends Animal{
	
	public static void main(String[] args) {
		
		AndeanMountainCat amc= new AndeanMountainCat();
		
		amc.setName("Mimi");
		amc.setColor("black");
		amc.isAlive();
		amc.setVaccinationCount(3);
	
		NorwegianForestCat nfc= new NorwegianForestCat();
		
		nfc.setName("Pifu");
		nfc.setColor("white");
		
		TurkishVanCat tvc= new TurkishVanCat();
		tvc.setName("Pamuk");
		tvc.setColor("white");
		
		TurkishVanCat tvc2= new TurkishVanCat();
		tvc2.setName("Mecnun");
		tvc2.setColor("yellow");
		tvc2.setBadgeNo(2202);
		
		TurkishVanCat tvc3= new TurkishVanCat();
		tvc3.setName("Zeytin");
		tvc3.setColor("black");
		
		SiameseCat sc= new SiameseCat();
		sc.setName("Sisko");
		sc.setColor("gray");
		sc.setVaccinationCount(0);
		
		
	    PersianCat pc= new PersianCat();
		pc.setName("Pino");
		pc.setColor("white");
		pc.setVaccinationCount(0);
		
		String[] Cats= {amc.toString(),nfc.toString(),tvc.toString(),tvc2.toString(),
				tvc3.toString(),pc.toString(),sc.toString()};
		
		for(int i=0; i<Cats.length; i++) {
		
		    System.out.println(Cats[i]);
		
				}
		System.out.println(sc.getNoOfVaccinatedCats());
		System.out.println(pc.getVaccinationCount());
	    }
	
	}
