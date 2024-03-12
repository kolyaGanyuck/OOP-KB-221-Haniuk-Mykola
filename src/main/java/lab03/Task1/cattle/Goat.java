package lab03.Task1.cattle;

public class Goat extends Cattle {
    public Goat(int age, double weight, int production) {
        super(age, weight, production);
    }
    public int getProduction() {
        return production;
    }
}
