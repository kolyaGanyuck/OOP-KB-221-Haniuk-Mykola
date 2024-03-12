package lab03.Task2;

import lombok.Data;

@Data
public class Vegetable {
    protected int areaOfGrowth; // гектари
    protected String translation;
    protected int productivity; // тонни
    protected boolean isGrowth;
    protected boolean isHarvest;
    protected boolean isWatered;
    protected boolean isFertilize;

    public Vegetable(int areaOfGrowth, String translation) {
        this.areaOfGrowth = areaOfGrowth;
        this.translation = translation;
        this.isGrowth = false;
        this.isHarvest = false;
        this.isWatered = false;
        this.isFertilize = false;
    }

    public String calculateHarvest(){
        productivity = areaOfGrowth * 20; // для картоплі
        return "Врожайність культури " + translation + " з " + areaOfGrowth + " гектарів становить " + productivity + " т";
    }
}
