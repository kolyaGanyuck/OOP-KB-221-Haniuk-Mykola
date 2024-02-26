package lab03.Task2;

public class Tomato extends Vegetable{
    public Tomato(int areaOfGrowth, String translation) {
        super(areaOfGrowth, translation);
    }
    @Override
    public String calculateHarvest() {
        productivity = areaOfGrowth * 40;
        return "Врожайність культури " + translation + " з " + areaOfGrowth + " гектарів становить " + productivity + " т";
    }
}
