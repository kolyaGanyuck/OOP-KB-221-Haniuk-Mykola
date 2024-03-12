package lab03.Task1.cattle;

public class Sheep extends Cattle {
    public Sheep(int age, double weight, int production) {
        super(age, weight, production);
    }
    public int getProduction() {
        return production;
    }
}
