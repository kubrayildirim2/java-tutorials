package be.intecbrussel.notebook.entities.animals;

import be.intecbrussel.notebook.entities.plants.Plant;

import java.util.LinkedHashSet;
import java.util.Set;

public class Omnivore extends Animal{

    private double maxFoodSize;
    private Set<Plant> plantDiet;

    public Omnivore(String name) {
        super(name);
    }

    public Omnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public void addPlantToDiet(Plant plant){

        if (plantDiet==null){

            plantDiet = new LinkedHashSet<>();
        }

            plantDiet.add(plant);

    }

    @Override
    public String toString() {
        return "Omnivore{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", length=" + length +
                ", maxFoodSize=" + maxFoodSize +
                ", plantDiet=" + plantDiet +
                "} ";
    }
}
