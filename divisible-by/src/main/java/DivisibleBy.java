import java.util.ArrayList;

public class DivisibleBy {
    void main() {
        displayNumbersDivisibleBy3or5();
    }

    int displayNumbersDivisibleBy3or5() {
        ArrayList<Integer> numArr = new ArrayList<>();
        int sum = 0;
        for (int i = 1; i <= 500; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
                numArr.add(i);
            }
        }

        System.out.println("Numbers divisible by 3 or 5: " + numArr);
        System.out.println("Total: " + sum);


        return sum;
    }
}
