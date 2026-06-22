import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RPSTest {


    @Test
    void randomIndexShouldBeBetween0And2() {
        // Arrange

        // Act
        int randomIndex = (int) (Math.random() * 3);

        // Assert
        assertTrue(randomIndex >= 0 && randomIndex < 3,
                "randomIndex was out of range: " + randomIndex);
    }
}


