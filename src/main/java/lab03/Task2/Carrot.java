package lab03.Task2;

public class Carrot extends Vegetable {
    public Carrot(int areaOfGrowth, String translation) {
        super(areaOfGrowth, translation);
    }
    @Override
    public String calculateHarvest() {
        productivity = areaOfGrowth * 35;
        return "Врожайність культури " + translation + " з " + areaOfGrowth + " гектарів становить " + productivity + " т";
    }
}

