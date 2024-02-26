package lab03.Task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Farmers {
    private Map<Class<? extends Vegetable>, List<Vegetable>> vegetableList = new HashMap<>();

    public void addVegetable(Vegetable vegetable) {
        vegetableList.computeIfAbsent(vegetable.getClass(), k -> new ArrayList<>()).add(vegetable);
    }

    public void determinePlantHarvest(Vegetable vegetable){
        if (vegetableList.containsKey(vegetable.getClass())) {
            List<? extends Vegetable> vegetables = vegetableList.get(vegetable.getClass());
            for (Vegetable vegetable1 : vegetables) {
                System.out.println("Площа засадженна культурою " + vegetable1.getTranslation() + " становить " + vegetable1.getAreaOfGrowth() + " га");
            }
        }
    }

    public void plantVegatables(Vegetable vegetable) {
        if (vegetableList.containsKey(vegetable.getClass())) {
            List<? extends Vegetable> vegetables = vegetableList.get(vegetable.getClass());
            for (Vegetable vegetable1 : vegetables) {
                vegetable1.setGrowth(true);
                System.out.println(vegetable1.getTranslation() + " посаджено на площі " + vegetable1.getAreaOfGrowth() + " га");
            }

        }
    }

    public void harvest(Vegetable vegetable) {
        if (vegetableList.containsKey(vegetable.getClass())) {
            List<? extends Vegetable> vegetables = vegetableList.get(vegetable.getClass());
            for (Vegetable vegetable1 : vegetables) {
                if (vegetable1.isGrowth) {
                    vegetable1.setHarvest(true);
                    System.out.println("Урожай культури " + vegetable1.getTranslation() + " з площі " + vegetable1.getAreaOfGrowth() + "га зібрано" );
                }
                else System.out.println("Культура " + vegetable.getTranslation() + " не була посаджена, тож не може бути зібрана");

            }
        }
    }

    public void waterHarvest(Vegetable vegetable) {
        if (vegetableList.containsKey(vegetable.getClass())) {
            List<? extends Vegetable> vegetables = vegetableList.get(vegetable.getClass());

            for (Vegetable vegetable1 : vegetables) {
                if (vegetable1.isGrowth) {
                    vegetable1.setWatered(true);
                    System.out.println("Урожай " + vegetable1.getTranslation() + ", що засаджений на площі " + vegetable1.getAreaOfGrowth() + "га полито");
                }
                else System.out.println("Культура " + vegetable.getTranslation() + " не була посаджена, тож не може бути полита");

            }
        }
    }

    public void fertilizeHarvest(Vegetable vegetable) {
        if (vegetableList.containsKey(vegetable.getClass())) {
            List<? extends Vegetable> vegetables = vegetableList.get(vegetable.getClass());
            for (Vegetable vegetable1 : vegetables) {
                if (vegetable1.isGrowth) {
                    vegetable1.setFertilize(true);
                    System.out.println("Урожай " + vegetable1.getTranslation() + ", що засаджений на площі " + vegetable1.getAreaOfGrowth() + "га удобрено");
                }
                else System.out.println("Культура " + vegetable.getTranslation() + " не була посаджена тож не може бути удобрена");

            }
        }
    }
}