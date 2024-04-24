package lab03v2;

import lombok.Data;

@Data

public class Bug extends Ticket {
    private static int bugId = 0;
    private UserStory userStory;
    private boolean bugIsComplete;


    public static Bug createBug(String name, int estimate, UserStory userStory) {

        if (userStory == null || !userStory.isUserStoryComplete()) return null;
        else {
            Bug bug = new Bug();
            bug.setBugId(bugId + 1);
            bug.setName(name);
            bug.setEstimate(estimate);
            bug.setUserStory(userStory);
            bug.setBugIsComplete(false);
            System.out.println("Баг створено");
            return bug;
        }
    }

    public void setBugId(int bugId) {
        this.bugId = bugId;
    }

    @Override
    public void complete() {
        setBugIsComplete(true);
        System.out.println(getName() + " " + isBugIsComplete());
    }

    @Override
    public String toString() {
        return "[Bug " + bugId + "] " + getName() + ": " + getUserStory();
    }
}
