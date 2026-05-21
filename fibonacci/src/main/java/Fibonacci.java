import java.util.*;

public class Fibonacci {
    static void main() {
        ArrayList<Integer> fib = new ArrayList<>();
        Collections.addAll(fib,0,1);

        for (int i = 2; i < 10; i++) {
            fib.add(fib.get(i - 1) + fib.get(i - 2));
        }
        System.out.println(fib);
    }
}

