import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DayOfTheWeekTest {

    @Test
    void generateRandomDayAlwaysReturnsNumberBetween1And7() {
        // Arrange
        DayOfTheWeek dayOfTheWeek = new DayOfTheWeek();

        // Act
        for (int i = 0; i < 100; i++) {
            int result = dayOfTheWeek.generateRandomDay();

            // Assert
            assertTrue(
                    result >= 1 && result <= 7,
                    "Generated day was out of range: " + result
            );
        }
    }
}
