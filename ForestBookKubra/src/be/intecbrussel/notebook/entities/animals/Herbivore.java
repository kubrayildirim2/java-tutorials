package be.intecbrussel.notebook.entities.animals;

import be.intecbrussel.notebook.entities.plants.Plant;

import java.util.LinkedHashSet;
import java.util.Set;

public class Herbivore extends Animal{

    private Set<Plant> plantDiet;

    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {this.plantDiet = plantDiet;
    }

    public void addPlantToDiet(Plant plant) {

        if (plantDiet==null){

           plantDiet=new LinkedHashSet<>();

       }

           plantDiet.add(plant);

    }

    public void printDiet() {

    }

    @Override
    public String toString() {
        return "Herbivore{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", length=" + length +
                ", plantDiet=" + plantDiet +
                "} ";
    }
}

