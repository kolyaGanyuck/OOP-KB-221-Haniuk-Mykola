package lab03v2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UserStoryTest {
    private UserStory story;
    @BeforeEach
    void setUp(){
        story = new UserStory("Створення профіля", 1, new ArrayList<>());
        UserStory dependency1 = new UserStory("Залежність 1", 2, new ArrayList<>());
        UserStory dependency2 = new UserStory("Залежність 2", 3, new ArrayList<>());
        dependency1.completeUserStory();
        dependency2.completeUserStory();
        this.story.addDependency(dependency1);
        this.story.addDependency(dependency2);
    }

    @Test
    void getSizeOfListOfUserStories() {
            Assertions.assertEquals(3, story.getListOfUserStories().size());
    }
    @Test
    void completeUserStory(){
        story.complete();
        Assertions.assertTrue(story.isUserStoryComplete());
    }
    @Test
    void toStringUserStory(){
        Assertions.assertEquals("[US 0] Створення профіля", story.toString());
    }
}