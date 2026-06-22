import java.util.HashMap;

public class DayOfTheWeek {

    int generateRandomDay() {
        return (int) (Math.random() * 7) + 1;
    }

    void dayOfTheWeek() {
        HashMap<Integer, String> week = new HashMap<>();
        int day = generateRandomDay();

        week.put(1, "Monday");
        week.put(2, "Tuesday");
        week.put(3, "Wednesday");
        week.put(4, "Thursday");
        week.put(5, "Friday");
        week.put(6, "Saturday");
        week.put(7, "Sunday");

        if (day >= 1 && day <= 5) {
            System.out.println("This is a weekday: " + week.get(day));
        } else {
            System.out.println("This is a weekend: " + week.get(day));
        }

        if (day == 2) {
            System.out.println("On a Tuesday I go to the gym");
        } else if (day == 4) {
            System.out.println("On a Thursday I go to the gym");
        } else if (day == 7) {
            System.out.println("On a Sunday I do gardening");
        } else {
            System.out.println("REST DAY");
        }
    }
}