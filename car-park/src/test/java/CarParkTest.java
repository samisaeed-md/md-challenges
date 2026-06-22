import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarParkTest {

    @Test

    void correctRateForHourIsOutputted() {
        // Arrange
        int hour = 6;

        // Act
        int result = CarPark.rateForHour(hour);

        // Assert
        assertEquals(350, result);
    }


}