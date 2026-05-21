import java.util.*;

public class SevenBoom {
    static void main() {
        ArrayList<Integer> boom = new ArrayList<>();
        int random = (int) (Math.random() * 10) + 1;

        for (int i = 1; i <= random; i++) {
            if (String.valueOf(i).contains("7")) {
                System.out.println(boom + " 7BOOM");
                break;
            } else {
                boom.add(i);
            }
        }
    }
}
