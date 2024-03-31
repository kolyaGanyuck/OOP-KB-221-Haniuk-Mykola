package lab03v2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BugTest {
    private Bug bug;
    @BeforeEach
    void setUp() {
        UserStory story = new UserStory("Створення профіля", 1, new ArrayList<>());
        story.complete();
        this.bug = Bug.createBug(1, "Bug1", 1, story);
    }
    @Test
    void complete() {
        Assertions.assertFalse(bug.isCompleted());
        bug.complete();
        Assertions.assertFalse(bug.isCompleted());
    }
    @Test
    void testToString() {
        Assertions.assertEquals("[Bug 1] Bug1: [US 0] Створення профіля", bug.toString());
    }
}