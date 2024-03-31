package lab03v2;

import lombok.Data;

@Data
public class Ticket {
    protected static int id = 0;
    protected int currentId;
    private String name;
    private int estimate;
    private boolean isCompleted;

    Ticket(String name, int estimate) {
        currentId = id++;
        isCompleted = false;
        this.name = name;
        this.estimate = estimate;
    }

    public void complete() {
        isCompleted = true;
        System.out.println("Ticket with name " + name + " is completed");
    }

    Ticket(){

    }
}
