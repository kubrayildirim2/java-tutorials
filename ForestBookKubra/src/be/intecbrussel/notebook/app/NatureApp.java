package be.intecbrussel.notebook.app;

import be.intecbrussel.notebook.entities.animals.Carnivore;
import be.intecbrussel.notebook.entities.animals.Herbivore;
import be.intecbrussel.notebook.entities.animals.Omnivore;
import be.intecbrussel.notebook.entities.plants.*;
import be.intecbrussel.notebook.service.ForestNoteBook;


public class NatureApp {
    public static void main(String[] args) {

        ForestNoteBook myForestNoteBook = new ForestNoteBook();


        Bush bush1 = new Bush("Chokeberry",1);
        bush1.setLeafType(LeafType.HAND);
        bush1.setFruit("Chokeberry Fruit");

        Bush bush2 = new Bush("Lilac", 2);
        bush2.setLeafType(LeafType.HEART);
        bush2.setFruit("No Fruit");

        Tree tree1 = new Tree("Pinus", 10);
        tree1.setLeafType(LeafType.NEEDLE);

        Tree tree2 = new Tree("Platanus",12);
        tree2.setLeafType(LeafType.SPEAR);

        Flower flower1 = new Flower("Daisy",0.2);
        flower1.setSmell(Scent.EARTHY);

        Weed weed1 = new Weed("Oxalis",0.3);
        weed1.setArea(2);

        Carnivore Lion = new Carnivore("Panthera leo melanochaita",187,1.2,3.35);
        Lion.setMaxFoodSize(3);
        Carnivore Tiger = new Carnivore("Bengal Tiger",120,1.09,3.71);
        Tiger.setMaxFoodSize(2);
        Carnivore Bear = new Carnivore("Ursus Arctos",180,1.5,2.5 );
        Bear.setMaxFoodSize(1);
        Herbivore Zebra = new Herbivore("Equus Burchelli",350,1.7,2.6);
        Zebra.addPlantToDiet(weed1);
        Omnivore Mause = new Omnivore("Mus Musculus", 0.25,0.10,0.15);
        Mause.setMaxFoodSize(0.5);
        Mause.addPlantToDiet(weed1);
        Omnivore Crow = new Omnivore("Carrion Crow",0.4,0.5,0.8);
        Crow.setMaxFoodSize(0.2);
        Crow.addPlantToDiet(weed1);
        Omnivore Pig = new Omnivore("Mulefoot",26,1,1.2);
        Pig.setMaxFoodSize(1);
        Pig.addPlantToDiet(flower1);
        Herbivore Donkey = new Herbivore("Mule", 350,1.7,2.4);
        Donkey.addPlantToDiet(flower1);
        Herbivore Dier = new Herbivore("Moose",800,1.4,2.6);
        Dier.addPlantToDiet(weed1);


        myForestNoteBook.addPlant(bush1);
        myForestNoteBook.addPlant(bush2);
        myForestNoteBook.addPlant(tree1);
        myForestNoteBook.addPlant(tree2);
        myForestNoteBook.addPlant(flower1);
        myForestNoteBook.addPlant(weed1);

        myForestNoteBook.addAnimal(Lion);
        myForestNoteBook.addAnimal(Tiger);
        myForestNoteBook.addAnimal(Bear);
        myForestNoteBook.addAnimal(Zebra);
        myForestNoteBook.addAnimal(Mause);
        myForestNoteBook.addAnimal(Crow);
        myForestNoteBook.addAnimal(Pig);
        myForestNoteBook.addAnimal(Donkey);
        myForestNoteBook.addAnimal(Dier);

        myForestNoteBook.printNotebook();

        System.out.println(myForestNoteBook.getAnimalCount());
        System.out.println(myForestNoteBook.getPlantCount());

        System.out.println(myForestNoteBook.getCarnivores());

        System.out.println("SORTED LIST------------------------------");

        myForestNoteBook.sortAnimalsByName(false);
        myForestNoteBook.sortPlantsByName();

        myForestNoteBook.printNotebook();

    }

}
