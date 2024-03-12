package lab03.Task1;

import lab03.Task1.bird.Bird;
import lab03.Task1.bird.Geese;
import lab03.Task1.bird.Turkey;
import lab03.Task1.cattle.Cow;
import lab03.Task1.cattle.Goat;
import lab03.Task1.cattle.Sheep;

public class Main {
    public static void main(String[] args) {
        Farmer farmer = new Farmer();
        farmer.addAnimal(new Cow(6, 500, 50));
        farmer.addAnimal(new Cow(8, 600, 40));
        farmer.addAnimal(new Goat(3, 50, 4));
        farmer.addAnimal(new Geese(2, 3));
        farmer.addAnimal(new Turkey(2, 3));
        farmer.addAnimal(new Sheep(3, 20, 13));
        farmer.addAnimal(new Sheep(3, 20, 11));

        System.out.println(farmer.releaseAnimal(Cow.class));
        System.out.println(farmer.releaseAnimal(Cow.class));
        System.out.println(farmer.countAnimal(Cow.class));

        farmer.removeAnimal(Cow.class, 1);
        farmer.removeAnimal(Cow.class, 5);

        farmer.feedAnimal(Turkey.class);

        System.out.println(farmer.countAnimal(Cow.class));
        System.out.println(farmer.countAnimal(Bird.class));
        System.out.println(farmer.countAnimal(Goat.class));
        farmer.getProduction(Goat.class);
        farmer.getProduction(Sheep.class);

    }
}
