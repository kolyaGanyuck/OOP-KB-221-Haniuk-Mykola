package lab03v2;

import lombok.Data;

@Data
public class Ticket {
    protected static int id = 0;
    protected int currentId;
    private String name;

    @Override
    public String toString() {
        return "[Ticket " + currentId + "] " + name
                + ", estimate = " + estimate + ", isCompleted = " + isCompleted;
    }

    private int estimate;
    private boolean isCompleted;

    Ticket(String name, int estimate) {
        currentId = id++;
        isCompleted = false;
        this.name = name;
        this.estimate = estimate;
    }

    Ticket() {

    }

    public boolean setCompleted() {
        return isCompleted = true;
    }
    public void complete() {
        isCompleted = true;
        System.out.println("Ticket with name " + name + " is completed");
    }
}
