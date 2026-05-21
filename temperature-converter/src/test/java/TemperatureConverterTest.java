import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    TemperatureConverter temp = new TemperatureConverter();

    @Test
    void testIfNumberGivenEndsInEitherF0rC(){
        boolean result = temp.checkLastChar();
        assertTrue(result);
    }

    @Test
    void testIfCelsiusIsCalculatedCorrectlyFromFahrenheit(){
        assertEquals(-1.1111111111111112,(double) (30 - 32) / 9* 5);
    }

    @Test
    void testIfCFahrenheitIsCalculatedCorrectlyFromCelsius(){
        assertEquals(86,(30 * 1.8) + 32);
    }
}