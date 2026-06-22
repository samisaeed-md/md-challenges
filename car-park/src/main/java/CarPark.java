public class CarPark {
    static int rateForHour(int hour) {
        if (hour >= 0 && hour < 5) return 300;
        if (hour >= 5 && hour < 10) return 350;
        if (hour >= 10 && hour < 15) return 500;
        if (hour >= 15 && hour < 20) return 700;
        if (hour >= 20 && hour < 24) return 400;
        throw new Error("Out of range");
    }

    static int hoursParked(int arrival, int depart) {
        if (depart >= arrival) return depart - arrival;
        return (24 - arrival) + depart; // crossed midnight
    }

}

class Main {
    void main() {
        int arrival = (int) (Math.random() * 24);
        int depart = (int) (Math.random() * 24);
        int duration = CarPark.hoursParked(arrival, depart);

        int total = 0;
        int currentHour = arrival;

        for (int i = 0; i < duration; i++) {
            total += CarPark.rateForHour(currentHour);
            currentHour = (currentHour + 1) % 24; // next hour, wrap around
        }

        System.out.println("Arrival: " + arrival);
        System.out.println("Depart : " + depart);
        System.out.println("Hours  : " + duration);
        System.out.println("Charge : £" + total);
    }
}
