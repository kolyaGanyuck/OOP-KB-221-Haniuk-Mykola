package lab03v2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ticket ticket = new Ticket("ticket_1", 1);
        Ticket ticket2 = new Ticket("ticket_2", 5);

        System.out.println(ticket2.getCurrentId());
        System.out.println(ticket2.getName());
        System.out.println(ticket2.getEstimate());
        System.out.println(ticket2.isCompleted());
        ticket.complete();
        System.out.println(ticket2.isCompleted());

        UserStory story = new UserStory("Створення профіля", 1, new ArrayList<>());
        UserStory story2 = new UserStory("Створення профіля", 1, new ArrayList<>());

        UserStory dependency1 = new UserStory("Залежність 1", 2, new ArrayList<>());
        UserStory dependency2 = new UserStory("Залежність 2", 3, new ArrayList<>());

        story.addDependency(dependency1);
        story.addDependency(dependency2);

        dependency1.completeUserStory();
        dependency2.completeUserStory();

        story.completeUserStory();
        System.out.println("____________________________________________________________");
        System.out.println(story.isUserStoryComplete());

        story.complete();

        List<UserStory> arrayList = story.getListOfUserStories();
        System.out.println(arrayList);

        System.out.println("____________________________________________________________");

        System.out.println(Bug.createBug(1, "Bug1", 1, story));
        Bug bug = Bug.createBug(1, "Bug1", 1, story);
        System.out.println(story.isUserStoryComplete());
        System.out.println("____________________________________________________________");

        Sprint sprint = new Sprint(3, 3);
        System.out.println("-ticket-");
        System.out.println(sprint.addTicket(ticket));
        System.out.println(sprint.addTicket(ticket2));
        System.out.println();
        System.out.println("-story-");
        System.out.println(sprint.addUserStory(story));
        System.out.println(sprint.addUserStory(story2));
        System.out.println();
        System.out.println("-bug-");
        System.out.println(sprint.addBug(bug));
        bug.setBugIsComplete(true);
        System.out.println(sprint.addBug(bug));
        System.out.println();

        System.out.println("Total estimate " + sprint.getTotalEstimate());
    }
}
