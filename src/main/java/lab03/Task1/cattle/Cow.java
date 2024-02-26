package lab03.Task1.cattle;

public class Cow extends Cattle {
    public Cow(int age, double weight, int production) {
        super(age, weight, production);
    }
    public int getProduction() {
        return production;
    }
}
