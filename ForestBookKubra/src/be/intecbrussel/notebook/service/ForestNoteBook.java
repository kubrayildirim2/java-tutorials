package be.intecbrussel.notebook.service;

import be.intecbrussel.notebook.entities.animals.Animal;
import be.intecbrussel.notebook.entities.animals.Carnivore;
import be.intecbrussel.notebook.entities.animals.Herbivore;
import be.intecbrussel.notebook.entities.animals.Omnivore;
import be.intecbrussel.notebook.entities.plants.Plant;

import java.util.*;

public class ForestNoteBook {

    private List<Carnivore> carnivores;
    private List<Omnivore> omnivores;
    private List<Herbivore> herbivores;
    private int plantCount;
    private int animalCount;
    private List<Animal> animals;
    private List<Plant> plants;

    public ForestNoteBook() {

        carnivores = new LinkedList<>();
        herbivores = new LinkedList<>();
        omnivores = new LinkedList<>();
        animals = new LinkedList<>();
        plants = new LinkedList<>();

    }

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount() {

        return plantCount;
    }

    public int getAnimalCount() {

        return animalCount;
    }

    public void addAnimal(Animal animal) {



        if (!listContainsAnimal(animals,animal)){
            animals.add(animal);
            animalCount++;
            if (animal instanceof Carnivore) {
                carnivores.add((Carnivore) animal);
            } else if (animal instanceof Herbivore) {
                herbivores.add((Herbivore) animal);
            }else {
                omnivores.add((Omnivore) animal);
            }
        }

    }

    public boolean listContainsAnimal(List<Animal> list, Animal animal){

        for(Animal an: list){
            if(animal.getName().equals(an.getName())){
                return true;
            }
        }
        return false;
    }

    public void addPlant(Plant plant) {

        if(!listContainsPlant(plants,plant)) {
            plants.add(plant);
            plantCount++;
        }
    }
    public boolean listContainsPlant(List<Plant> list, Plant plant){

        for(Plant pl: list){
            if(plant.getName().equals(pl.getName())){
                return true;
            }
        }
        return false;
    }

    public void printNotebook() {

        for (Animal a: animals) {

            System.out.println(a);
        }

        for (Plant p: plants) {

            System.out.println(p);
        }

    }

    public void sortAnimalsByName(boolean reverse) {

        if(reverse){

            animals.sort(Comparator.comparing(Animal::getName).reversed());

        }else {

            animals.sort(Comparator.comparing(Animal::getName));
        }

    }

    public void sortPlantsByName() {

        plants.sort(Comparator.comparing(Plant::getName));

    }

    public void sortAnimalsByHeight() {

        animals.sort(Comparator.comparing(Animal::getHeight));

    }

    public void sortPlantsByHeight() {

        plants.sort(Comparator.comparing(Plant::getHeight));

    }
}
