package lab03.Task1;

import lombok.Data;

@Data
public class Animal {
    protected static int id = 1;
    protected int currentId;
    protected int age;
    protected double weight;

    public Animal (int age, double weight){
        this.age = age;
        this.weight = weight;
        this.currentId = id++;
    }

    public Animal(){

    }

}
