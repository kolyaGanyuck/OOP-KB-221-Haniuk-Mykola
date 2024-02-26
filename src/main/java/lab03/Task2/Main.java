package lab03.Task2;

import lab03.Task1.Farmer;

public class Main {
    public static void main(String[] args) {
        Farmers farmers = new Farmers();
        Potato potato = new Potato(2, "Картопля");
        Vegetable tomato = new Tomato(3, "Томати");

        farmers.addVegetable(potato);
        farmers.addVegetable(tomato);

        farmers.plantVegatables(tomato);
        farmers.plantVegatables(potato);
        System.out.println();

        farmers.determinePlantHarvest(potato);
        System.out.println();

        farmers.fertilizeHarvest(tomato);
        System.out.println();

        farmers.waterHarvest(potato);
        System.out.println();

        farmers.harvest(potato);
        System.out.println();

        System.out.println(potato.calculateHarvest());
        System.out.println(tomato.calculateHarvest());

    }
}
