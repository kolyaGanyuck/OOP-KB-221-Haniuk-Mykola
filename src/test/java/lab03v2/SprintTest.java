package lab03v2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SprintTest {
    private Ticket ticket;
    private UserStory userStory;
    private UserStory userStory2;
    private Bug bug;
    private Sprint sprint;

    @BeforeEach
    void setUp() {
        ticket = new Ticket("ticket_1", 2);
        userStory = new UserStory("Створення профіля", 1, new ArrayList<>());
        userStory2 = new UserStory("Створення профіля", 1, new ArrayList<>());
        userStory.complete();
        bug = Bug.createBug(1, "Bug1", 3, userStory);
        sprint = new Sprint(3, 3);
    }

    @Test
    void estimateCheck() {
        Assertions.assertTrue(sprint.addTicket(ticket));
        Assertions.assertTrue(sprint.addTicket(ticket));
        Assertions.assertTrue(sprint.addTicket(ticket));
        Assertions.assertFalse(sprint.addTicket(ticket));
    }

    @Test
    void addUserStory() {
        Assertions.assertTrue(sprint.addUserStory(userStory2));
    }

    @Test
    void addBug() {
        Assertions.assertTrue(sprint.addBug(bug));

    }

    @Test
    void getTotalEstimate() {
        sprint.addTicket(ticket);
        sprint.addBug(bug);
        sprint.addUserStory(userStory2);
        Assertions.assertEquals(6, sprint.getTotalEstimate());
    }
}