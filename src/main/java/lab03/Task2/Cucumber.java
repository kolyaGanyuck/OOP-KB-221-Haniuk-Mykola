package lab03.Task2;

public class Cucumber extends Vegetable{
    public Cucumber(int areaOfGrowth, String translation) {
        super(areaOfGrowth, translation);
    }
    @Override
    public String calculateHarvest() {
        productivity = areaOfGrowth * 15;
        return "Врожайність культури " + translation + " з " + areaOfGrowth + " гектарів становить " + productivity + " т";
    }
}
