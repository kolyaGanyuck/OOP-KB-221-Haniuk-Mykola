package lab03.Task1.cattle;

import lab03.Task1.Animal;
import lombok.Data;

@Data

public class Cattle extends Animal {
    protected int production;
    protected boolean inSquad;
    public Cattle(int age, double weight, int production){
        super(age, weight);
        this.production = production;
        this.inSquad = false;
    }


}
