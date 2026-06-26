import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RPSTest {

    @Test
    void playerWinsWhenRockBeatsScissors() {
        // Arrange
        String player = "ROCK";
        String cpu = "SCISSORS";

        // Act
        String result = RPS.getResult(player, cpu);

        // Assert
        assertEquals("YOU WIN", result);
    }

    @Test
    void playerLosesWhenRockLosesToPaper() {
        // Arrange
        String player = "ROCK";
        String cpu = "PAPER";

        // Act
        String result = RPS.getResult(player, cpu);

        // Assert
        assertEquals("YOU LOSE", result);
    }

    @Test
    void playerDrawsWhenBothPickSameChoice() {
        // Arrange
        String player = "SCISSORS";
        String cpu = "SCISSORS";

        // Act
        String result = RPS.getResult(player, cpu);

        // Assert
        assertEquals("DRAW", result);
    }
}