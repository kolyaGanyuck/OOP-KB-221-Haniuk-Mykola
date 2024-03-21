package lab03.Task1;

import lab03.Task1.cattle.Cattle;
import lab03.Task1.cattle.Cow;
import lab03.Task1.cattle.Sheep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Farmer {
    private Map<Class<? extends Animal>, List<Animal>> animals = new HashMap<>();

    public void addAnimal(Animal animal) {
        animals.computeIfAbsent(animal.getClass(), k -> new ArrayList<>()).add(animal);
    }

    public void removeAnimal(Class<? extends Animal> animalClass, int id) {
        List<? extends Animal> animalList = animals.get(animalClass);
        if (animalList != null) {
            for (int i = 0; i < animalList.size(); i++) {
                Animal animal = animalList.get(i);
                if (animal.getCurrentId() == id) {
                    System.out.println("Тварина з ідентифікатором " + animal.getCurrentId() + " видалена");
                    animalList.remove(i);
                    break;
                } else System.out.println("Тварини з ідентифікатором " + id + " немає в списку");
            }
        }
    }

    public String countAnimal(Class<? extends Animal> animal) {
        List<? extends Animal> animalList = animals.get(animal);

        if (animalList != null && !animalList.isEmpty()) {
            int size = animalList.size();
            return "Тварин класу " + animal.getSimpleName() + " - " + size;
        }
        return "Тварин типу " + animal.getSimpleName() + " немає";
    }

    public void feedAnimal(Class<? extends Animal> animal) {
        List<? extends Animal> animalList = animals.get(animal);
        if (animalList != null) {
            for (Animal animal1 : animalList) {
                System.out.println("Тварина класу " + animal1.getClass().getSimpleName() + " з ідентифікатором " + animal1.getCurrentId() + " погодована");

            }
        } else System.out.println("Тварин типу " + animal.getSimpleName() + " немає");
    }

    public String releaseAnimal(Class<? extends Animal> animalClass) {
        if (Cattle.class.isAssignableFrom(animalClass)) {
            List<? extends Animal> animalList = animals.get(animalClass);
            if (animalList != null && !animalList.isEmpty()) {
                Animal animal1 = animals.get(animalClass).get(0);
                if (animal1 instanceof Cattle) {
                    Cattle cattle = (Cattle) animal1;
                    if (cattle.isInSquad()) {
                        System.out.println("Худоба типу " + cattle.getClass().getSimpleName() + " була у загоні");
                        changeSquadType((List<? extends Cattle>) animalList, false);
                    } else {
                        System.out.println("Худоба типу " + cattle.getClass().getSimpleName() + " була на паші");
                        changeSquadType((List<? extends Cattle>) animalList, true);

                    }
                }
            }
        }
        return "Худоба перегнана";
    }

    public void changeSquadType(List<? extends Cattle> animals1, boolean type) {
        for (Cattle animal1 : animals1) {
            animal1.setInSquad(type);
        }
    }

    public void getProduction(Class<? extends Cattle> animalClass) {
        List<Animal> animalList = animals.get(animalClass);
        if (animalList != null && animalList.get(0) instanceof Cattle) {
            String productionType;
            String animalType;
            if (animalList.get(0) instanceof Sheep) {
                productionType = " кілограмів хутра";
                animalType = "Вівця ";
            } else {
                productionType = " літрів молока";
                if (animalList.get(0) instanceof Cow) animalType = "Корова ";
                else animalType = "Коза ";
            }
            for (Animal animal : animalList) {
                    Cattle cattle = (Cattle) animal;
                    System.out.println(animalType + "з ідентифікатором " + animal.getCurrentId() + " дала " + cattle.getProduction() + productionType);

            }
        }
    }
}
