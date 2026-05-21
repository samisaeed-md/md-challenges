import java.util.*;

public class Main {
    static void main(){
        ArrayList<String> bus = new ArrayList<String>();
        Collections.addAll(bus,"Ryan", "Brandon", "Rebecca", "Richard", "Jessica", "Brian", "Antoinne", "Grace", "Zee", "Ibrahim");

        HashSet<Object> test = new HashSet<>(bus);

        Object[] testArray = test.toArray();

        System.out.println(Arrays.toString(testArray)); // Expected output: Array
        System.out.println(test); //Expected output: HashSet
    }
}
