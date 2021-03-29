package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("web")
@Feature("Login tests")
@Story("Some story")
public class WithStoryTests extends TestBase {
    @Test
    @DisplayName("Some fake test with story")
    void storyTest() {
        assertTrue(true);
    }

    @Test
    @DisplayName("the Second fake test with story")
    void story2ndTest() {
        assertTrue(true);
    }
}