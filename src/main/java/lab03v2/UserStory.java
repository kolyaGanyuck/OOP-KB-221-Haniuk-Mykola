package lab03v2;


import lombok.Data;

import java.util.List;
@Data

public class UserStory extends Ticket {
    protected static int userId = 0;
    private int currentUserId;
    private boolean userStoryComplete;
    private List<UserStory> dependencies;

    UserStory(String name, int estimate, List<UserStory> dependencies) {
        super(name, estimate);
        currentUserId = userId + 1;
        userStoryComplete = false;
        this.dependencies = dependencies;
        this.dependencies.add(this);
    }


    @Override
    public void complete() {
        dependencies.get(0).completeUserStory();
        for (Ticket ticket : dependencies) {
            if (!ticket.isCompleted()) {
                System.out.println("Не всі залежності завершені");
                break;
            }
            System.out.println("Залежність з id [" + ticket.getCurrentId() + "] |" + ticket.getName() + "| завершена успішно ");
        }
        userStoryComplete = true;
    }

    public void completeUserStory() {
        setCompleted();
    }

    public List<UserStory> getListOfUserStories() {
        return dependencies;
    }

    @Override
    public String toString() {
        return "[US " + getCurrentUserId() + "] " + getName();
    }

    public void addDependency(UserStory dependency) {
        dependencies.add(dependency);
    }
}

