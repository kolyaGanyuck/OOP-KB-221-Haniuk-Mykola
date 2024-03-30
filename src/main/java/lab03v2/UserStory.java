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
        currentUserId = userId++;
        userStoryComplete = false;
        this.dependencies = dependencies;
        this.dependencies.add(this);
    }

    @Override
    public void complete() {
        dependencies.get(0).completeUserStory();
        for (Ticket ticket : dependencies) {
            if (!ticket.isCompleted()) {
                System.out.println("Not all user's dependencies are complete");
                break;
            }
            System.out.println("User with id " + userId + " complete dependency + " + ticket.getName());
        }
        userStoryComplete = true;
    }

    public void completeUserStory() {
        setCompleted(true);
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


//        dependencies.add("id: " + id + ", name " + name + ", estimate: " + estimate);