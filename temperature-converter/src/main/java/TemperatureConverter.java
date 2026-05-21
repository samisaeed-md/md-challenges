public class TemperatureConverter {
    String fahrenheit = "30F";
    String celsius = "30C";

    void main() {
        System.out.println(calculateCelsiusFromFahrenheit());
    }

    boolean checkLastChar() {
        int n = fahrenheit.length();
        String last = String.valueOf(fahrenheit.charAt(n - 1));

        if (last.equals("F") || last.equals("C")) {
            return true;
        } else {
            return false;
        }
    }

    double calculateCelsiusFromFahrenheit() {
        String numberOnly = fahrenheit.replaceAll("[^0-9]", ""); // Takes the string and replaces all numbers with an empty string
        double r = Integer.parseInt(numberOnly); // Turns string into double
        return (r - 32) / 9 * 5;
    }

    double calculateFahrenheitFromCelsius() {
        String numberOnly = celsius.replaceAll("[^0-9]", ""); // Takes the string and replaces all numbers with an empty string
        double r = Integer.parseInt(numberOnly); // Turns string into double
        return (r * 1.8) + 32;
    }
}
