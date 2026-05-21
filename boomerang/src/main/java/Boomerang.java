import java.util.*;

public class Boomerang {
    static void main() {
        ArrayList<Integer> boomIntArr = new ArrayList<>();
        Collections.addAll(boomIntArr,3, 7, 3, 2, 1, 5, 1, 2, 2, -2, 2);

        for(int i = 2; i <= boomIntArr.size() - 1; i++){
            if(boomIntArr.get(i).equals(boomIntArr.get(i-2))){
                System.out.println("B: " + boomIntArr.get(i) + boomIntArr.get(i-1) + boomIntArr.get(i-2) );
            }
        }
    }
}
