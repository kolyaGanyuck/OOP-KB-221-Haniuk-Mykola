package lab03v2;

import lombok.Data;

@Data
public class Bug extends Ticket {
    private int bugId;
    private UserStory uS;
    private boolean bugIsComplete;
    public static Bug createBug(int id, String name, int estimate, UserStory userStory) {

        if (userStory == null || !userStory.isUserStoryComplete()) return null;
        else {
            Bug bug = new Bug();
            bug.setBugId(id);
            bug.setName(name);
            bug.setEstimate(estimate);
            bug.setUS(userStory);
            bug.setBugIsComplete(false);
            System.out.println("Bug is create");
            return bug;
        }
    }
    @Override
    public void complete(){
        setBugIsComplete(true);
        System.out.println(getName() + " " + isBugIsComplete());
    }

    @Override
    public String toString() {
        return "[Bug " + bugId + "] " + getName() + ": " + getUS();
    }
}
